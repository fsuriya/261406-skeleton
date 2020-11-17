package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.type.IntType_c;
import th.ac.cmu.cpe.cpe406.type.Type;
import th.ac.cmu.cpe.cpe406.util.Position;

public class BinaryOP_c extends Expr_c implements BinaryOP {

	 protected Expr l;
	 protected Expr r;

	 public BinaryOP_c(Position pos, Expr l, Expr r) {
	        super(pos);
	        this.l = l;
	        this.r = r;
	 }
	 
//	 @Override
//	 public Type TypeCheck() throws Exception {
//		 Type lType = l.TypeCheck();
//		 Type rType = r.TypeCheck();
//	 }
}
