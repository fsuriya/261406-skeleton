package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.util.Position;

public class Num_c extends Expr_c implements Num {

	protected int id;

    public Num_c(Position pos, int id) {
        super(pos);
        this.id = id;
    }
	
}
