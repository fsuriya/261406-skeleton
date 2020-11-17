package th.ac.cmu.cpe.cpe406.ast;

import th.ac.cmu.cpe.cpe406.type.BoolType_c;
import th.ac.cmu.cpe.cpe406.type.IntType_c;
import th.ac.cmu.cpe.cpe406.type.SymTable;
import th.ac.cmu.cpe.cpe406.type.Type;
import th.ac.cmu.cpe.cpe406.type.UnitType_c;
import th.ac.cmu.cpe.cpe406.util.InternalCompilerError;
import th.ac.cmu.cpe.cpe406.util.Position;

public class PrimitiveTypeNode_c extends TypeNode_c
        implements PrimitiveTypeNode {

    protected PrimitiveTypeNode.Kind kind;

    public PrimitiveTypeNode_c(Position pos, PrimitiveTypeNode.Kind kind) {
        super(pos);
        this.kind = kind;
    }
    @Override
    public Type TypeCheck(SymTable sym) throws Exception{
    	switch (this.kind) {
        case INT:
            return new IntType_c();
        case BOOLEAN:
            return new BoolType_c();
        case CHAR:
        	return new IntType_c();
        }
        throw new InternalCompilerError("Unknown primitive type");
	}
}
