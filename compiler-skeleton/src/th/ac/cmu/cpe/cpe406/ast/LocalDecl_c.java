package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.type.SymTable;
import th.ac.cmu.cpe.cpe406.type.Type;
import th.ac.cmu.cpe.cpe406.type.IntType_c;
import th.ac.cmu.cpe.cpe406.type.BoolType_c;
import th.ac.cmu.cpe.cpe406.util.Position;
import th.ac.cmu.cpe.cpe406.type.UnitType_c;

public class LocalDecl_c extends Stmt_c implements LocalDecl {

    protected Id id;
    protected TypeNode typeNode;

    public LocalDecl_c(Position pos, Id id, TypeNode typeNode) {
        super(pos);
        this.id = id;
        this.typeNode = typeNode;
    }
    
    @Override
    public Type TypeCheck(SymTable sym) throws Exception{
    	Type typeToAdd = null;
    	if (sym.lookup(id.name()) == null) {
	    	if (((TypeNode_c) typeNode).TypeCheck(sym).isInt()) {
	    		typeToAdd = new IntType_c();
	    	} else if (((TypeNode_c) typeNode).TypeCheck(sym).isBool()){
	    		typeToAdd = new BoolType_c();
	    	} else {
	    		throw new Exception("Compile error at " + pos.path() + "\nline:" + pos.line() + "\nError: type error");
	    	}
    	} else {
    		String typeError = "Unknown Type";
    		if (sym.lookup(id.name()).isInt()){
    			typeError = "int";
    		} else if (sym.lookup(id.name()).isBool()){
    			typeError = "bool";
    		} 
    		throw new Exception("Compile error at " + pos.path() + "\nline:" + pos.line() + "\nError: Redeclaration of '" + id.name()  +":" + typeError + "'");
    	}
    	sym.add(id.name(), (Type)typeToAdd);
    	
		return new UnitType_c();
	}
}
