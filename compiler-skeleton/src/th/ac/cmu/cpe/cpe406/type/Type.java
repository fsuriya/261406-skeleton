package th.ac.cmu.cpe.cpe406.type;
import java.util.List;
public interface Type {

	boolean isInt();
	boolean isBool();
	boolean isUnit();
	boolean isFunction();
	List<Type> GetParamTypes();
	Type GetReturnType();
}
