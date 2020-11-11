package th.ac.cmu.cpe.cpe406.ast;

import java.util.List;

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
}