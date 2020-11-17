package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.util.Position;
import th.ac.cmu.cpe.cpe406.type.IntType_c;
import th.ac.cmu.cpe.cpe406.type.Type;
import th.ac.cmu.cpe.cpe406.type.SymTable;

public class IntOP_c extends BinaryOP_c implements BinaryOP {

	public IntOP_c(Position pos, Expr l, Expr r) {
		super(pos, l, r);
	}
	@Override
	public Type TypeCheck(SymTable sym) throws Exception {
		Expr_c el = (Expr_c) l;
		Expr_c er = (Expr_c) r;
		if(el.TypeCheck(sym) != null && er.TypeCheck(sym) != null) {			
			if(el.TypeCheck(sym).isInt()) {
				if(er.TypeCheck(sym).isInt()) {
					return new IntType_c();
				}else{
					throw new Exception("Type error at: "+ pos.path() + " line: "+ pos.line() + "\n Error: Right of operator is not 'int'.");
				}
			}else {
				throw new Exception("Type error at: "+ pos.path() + " line: "+ pos.line()+ "\n Error: Left of operator is not 'int'.");
			}
		}else {
			throw new Exception("Type error at: "+ pos.path() + " line: "+ pos.line()+ "\n Error: Left or Right of operator is not 'int'.");
		}
		
	}
	

	 
}
