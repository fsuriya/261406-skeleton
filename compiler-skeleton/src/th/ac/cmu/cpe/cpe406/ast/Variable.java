package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.type.SymTable;
import th.ac.cmu.cpe.cpe406.type.Type;

public interface Variable extends Expr {
	 public Type TypeCheck(SymTable sym) throws Exception;
}
