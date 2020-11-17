package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.type.BoolType_c;
import th.ac.cmu.cpe.cpe406.type.Type;
import th.ac.cmu.cpe.cpe406.util.Position;

public class Boolean_c extends Expr_c implements Boolean {

	protected boolean bool;

    public Boolean_c(Position pos, boolean bool) {
        super(pos);
        this.bool = bool;
    }
    
    public Type TypeCheck() {
    	return new BoolType_c();
    }
}
