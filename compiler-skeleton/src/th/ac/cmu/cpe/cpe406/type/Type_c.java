package th.ac.cmu.cpe.cpe406.type;

import java.util.List;

public abstract class Type_c implements Type {

	public boolean isInt() {
		return false;
	}
	
	public boolean isBool() {
		return false;
	}

	public boolean isUnit(){
		return false;
	}
	public boolean isFunction(){
		return false;
	}
	public List<Type> GetParamTypes(){
		return null;
	}
	public Type GetReturnType(){
		return null;
	}
}
