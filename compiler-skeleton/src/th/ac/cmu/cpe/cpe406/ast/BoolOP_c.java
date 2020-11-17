package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.type.IntType_c;
import th.ac.cmu.cpe.cpe406.type.Type;
import th.ac.cmu.cpe.cpe406.type.SymTable;
import th.ac.cmu.cpe.cpe406.util.Position;

public class BoolOP_c extends BinaryOP_c implements BinaryOP {
	 public BoolOP_c(Position pos, Expr l, Expr r) {
		super(pos, l, r);
	}

	@Override
	public Type TypeCheck(SymTable sym) throws Exception {
		Expr_c el = (Expr_c) l;
		Expr_c er = (Expr_c) r;
		if(el.TypeCheck(sym) != null && er.TypeCheck(sym) != null) {			
			if(el.TypeCheck(sym).isBool()) {
				if(er.TypeCheck(sym).isBool()) {
					return new IntType_c();
				}else{
					throw new Exception("Type error at: "+ pos.path() + " line: "+ pos.line() + "\n Error: Right of operator is not 'bool'.");
				}
			}else {
				throw new Exception("Type error at: "+ pos.path() + " line: "+ pos.line()+ "\n Error: Left of operator is not 'bool'.");
			}
		}else {
			throw new Exception("Type error at: "+ pos.path() + " line: "+ pos.line()+ "\n Error: Left or Right of operator is not 'bool'.");
		}
	}

}
