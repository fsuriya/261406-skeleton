package th.ac.cmu.cpe.cpe406.ast;

import java.util.List;

import th.ac.cmu.cpe.cpe406.type.SymTable;
import th.ac.cmu.cpe.cpe406.type.Type;
import th.ac.cmu.cpe.cpe406.util.Position;
import th.ac.cmu.cpe.cpe406.type.UnitType_c;

public class Assign_c extends Stmt_c implements Assign {

	List<Variable> l;
	List<Expr> r;

    public Assign_c(Position pos, List<Variable> l, List<Expr> r) {
        super(pos);
        this.l = l;
        this.r = r;
    }
    
    @Override
    public Type TypeCheck(SymTable sym) throws Exception{
    	if(l.size() != r.size()) throw new Exception("Error at " + pos.path() + "line:" + pos.line() + "Error: assign error");
    	for (int i = 0; i<l.size(); i++) {
    		Type lType = l.get(i).TypeCheck(sym);
    		Type rType = ((Expr_c) r.get(i)).TypeCheck(sym);
    		if(lType != null && rType != null) {
    			if ((lType.isInt() && rType.isInt()) || (lType.isBool() && rType.isBool())) {
    				throw new Exception("Compile error at" + pos.path() + "line:" + pos.line() + "Error: left and right type are not equl.");
    			}
    		}
    	}
    	return new UnitType_c();
    }

}
