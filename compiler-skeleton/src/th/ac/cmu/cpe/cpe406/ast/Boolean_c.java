package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.util.Position;

public class Boolean_c extends Expr_c implements Boolean {

	protected boolean id;

    public Boolean_c(Position pos, boolean id) {
        super(pos);
        this.id = id;
    }
}
