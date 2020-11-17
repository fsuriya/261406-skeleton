package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.type.SymTable;
import th.ac.cmu.cpe.cpe406.type.Type;
import th.ac.cmu.cpe.cpe406.util.Position;

public class Variable_c extends Expr_c implements Variable {

    protected Id id;

    public Variable_c(Position pos, Id id) {
        super(pos);
        this.id = id;
    }

    @Override
    public Type TypeCheck(SymTable sym) throws Exception{
    	if (sym.lookup(id.name()) == null) {
    		throw new Exception("Variable at " + pos.path() + "line:" + pos.line() + " not decal in this scope.");
	    } 
    	return sym.lookup(id.name());
    }
}
