package th.ac.cmu.cpe.cpe406.ast;

import java.util.List;
import th.ac.cmu.cpe.cpe406.util.Position;

public class FunctionCall_c extends Expr_c implements FunctionCall {
	protected Id name;
	protected List<Expr> params;
	
    public FunctionCall_c(Position pos, Id name, List<Expr> params) {
		super(pos);
		this.name = name;
		this.params = params;
	}
}

