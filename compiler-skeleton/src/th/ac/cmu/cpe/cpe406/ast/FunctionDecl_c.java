package th.ac.cmu.cpe.cpe406.ast;

import java.util.List;
import th.ac.cmu.cpe.cpe406.util.Position;

public class FunctionDecl_c extends Node_c implements FunctionDecl {
	protected Id name;
	protected List<Expr> params;
	protected TypeNode returnType;
	protected Block body;
	
    public FunctionDecl_c(Position pos, Id name, List<Expr> params, TypeNode returnType, Block body) {
		super(pos);
		this.name = name;
		this.params = params;
		this.returnType = returnType;
		this.body = body;
	}
}
