package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.util.Position;

public class EQOP_c extends Expr_c implements BinaryOP {

	 Expr l;
	 Expr r;

	 public EQOP_c (Position pos, Expr l, Expr r) {
	        super(pos);
	        this.l = l;
	        this.r = r;
	 }

}
