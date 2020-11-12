package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.util.Position;

public class IfStmt_c extends Stmt_c implements IfStmt {
	protected Expr condition;
	protected Stmt t;
	protected Stmt e;
	// matched
    public IfStmt_c(Position pos, Expr c, Stmt t, Stmt e) {
		super(pos);
		this.condition = c;
		this.t = t;
		this.e = e;
	}
    // unmatched
    public IfStmt_c(Position pos, Expr c, Stmt t) {
		super(pos);
		this.condition = c;
		this.t = t;
		this.e = null;
	}

}