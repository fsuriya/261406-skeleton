package th.ac.cmu.cpe.cpe406.ast;

import java.util.List;
import th.ac.cmu.cpe.cpe406.type.SymTable;
import th.ac.cmu.cpe.cpe406.type.SymTable_c;
import th.ac.cmu.cpe.cpe406.type.Type;
import th.ac.cmu.cpe.cpe406.type.UnitType_c;
import th.ac.cmu.cpe.cpe406.util.Position;

public class Block_c extends Expr_c implements Block {

	protected List<Stmt> statements;
	protected Position ext;
	
    public Block_c(Position pos, List<Stmt> s) {
        super(pos);
        this.statements = s;
    }

    public Block_c(Position pos, List<Stmt> s, Position ext) {
        super(pos);
        this.statements = s;
        this.ext = ext;
    }

	@Override
	public Type TypeCheck(SymTable sym) throws Exception {
		SymTable newsym = new SymTable_c(sym);
		for(Stmt x: statements) {
			Type xType = ((Stmt_c) x).TypeCheck(newsym);
			if(xType != null) {
				if(!xType.isUnit()) {
					throw new Exception("Type error at: "+ pos.path() + " line: "+ pos.line() + "\n Error: This Stmt is sus!!!");
				}
			}
		}
		return new UnitType_c();
	}

}