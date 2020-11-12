package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.util.Position;

public class WhileStmt_c extends Stmt_c implements WhileStmt {
	protected Expr condition;
	protected Stmt b;
    public WhileStmt_c(Position pos, Expr c, Stmt b) {
		super(pos);
		this.condition = c;
		this.b = b;
	}
}