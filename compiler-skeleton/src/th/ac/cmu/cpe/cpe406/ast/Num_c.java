package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.type.Type;
import th.ac.cmu.cpe.cpe406.type.IntType_c;
import th.ac.cmu.cpe.cpe406.util.Position;
import th.ac.cmu.cpe.cpe406.type.SymTable;

public class Num_c extends Expr_c implements Num {

	protected int value;

    public Num_c(Position pos, int value) {
        super(pos);
        this.value = value;
    }
    @Override
    public Type TypeCheck(SymTable sym) {
    	return new IntType_c();
    }
	
}
