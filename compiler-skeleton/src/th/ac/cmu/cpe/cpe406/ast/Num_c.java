package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.type.*;
import th.ac.cmu.cpe.cpe406.util.Position;

public class Num_c extends Expr_c implements Num {

	protected int value;

    public Num_c(Position pos, int value) {
        super(pos);
        this.value = value;
    }
    
    public Type TypeCheck() {
    	return new IntType_c();
    }
	
}
