package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.util.Position;

public class Plus_c extends Expr_c implements Mult {

    Expr l;
    Expr r;

    public Plus_c(Position pos, Expr l, Expr r) {
        super(pos);
        this.l = l;
        this.r = r;
    }

}
