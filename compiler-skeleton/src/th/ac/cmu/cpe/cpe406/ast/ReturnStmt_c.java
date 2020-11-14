package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.util.Position;

public class ReturnStmt_c extends Stmt_c implements ReturnStmt{
	protected Expr result;
	
    public ReturnStmt_c(Position pos, Expr r) {
		super(pos);
		this.result = r;
	}
}
