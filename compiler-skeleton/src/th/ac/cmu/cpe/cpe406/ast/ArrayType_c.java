package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.util.Position;

public class ArrayType_c extends TypeNode_c implements ArrayType {

	protected TypeNode type;
	protected Integer dims;
	
	public ArrayType_c (Position pos, TypeNode type, Integer dims) {
		super(pos);
		this.type = type;
		this.dims = dims;
	}
}
