package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.type.SymTable;
import th.ac.cmu.cpe.cpe406.type.Type;
import th.ac.cmu.cpe.cpe406.type.UnitType_c;
import th.ac.cmu.cpe.cpe406.util.Position;

public class WhileStmt_c extends Stmt_c implements WhileStmt {
	protected Expr condition;
	protected Stmt b;
    public WhileStmt_c(Position pos, Expr c, Stmt b) {
		super(pos);
		this.condition = c;
		this.b = b;
	}
    @Override
	public Type TypeCheck(SymTable sym) throws Exception {
		Type conditionType = ((Expr_c)condition).TypeCheck(sym);
		if(conditionType != null) {
			if(conditionType.isBool()) {
				Type bType = ((Stmt_c)b).TypeCheck(sym);
				if(bType != null) {
					if(bType.isUnit()) {
						return new UnitType_c();
					}
				}
			}
		}
		throw new Exception("Type error at: "+ pos.path() + " line: "+ pos.line() + "\n Error: condition of while is not boolean.");
	}
}