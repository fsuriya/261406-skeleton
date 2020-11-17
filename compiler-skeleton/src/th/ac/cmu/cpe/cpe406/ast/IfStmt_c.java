package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.type.SymTable;
import th.ac.cmu.cpe.cpe406.type.Type;
import th.ac.cmu.cpe.cpe406.type.UnitType_c;
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
    @Override
	public Type TypeCheck(SymTable sym) throws Exception {
		Type conditionType = ((Expr_c)condition).TypeCheck(sym);
		if(conditionType != null) {
			if(conditionType.isBool()) {
				Type tType = null;
				Type eType = null;
				if(e != null) {
					eType = ((Stmt_c)e).TypeCheck(sym);
					if(eType != null) {
						if(eType.isUnit()) {
							return new UnitType_c();
						}
					}
				}
				tType = ((Stmt_c)t).TypeCheck(sym);
				if(tType != null) {
					if(tType.isUnit()) {
						return new UnitType_c();
					}
				}
			}
		}
		throw new Exception("Type error at: "+ pos.path() + " line: "+ pos.line() + "\n Error: condition of if is not boolean.");
	}

}