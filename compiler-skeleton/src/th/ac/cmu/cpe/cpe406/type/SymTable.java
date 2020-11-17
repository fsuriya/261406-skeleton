package th.ac.cmu.cpe.cpe406.type;

public interface SymTable {
	Type lookup(String name);
	void add(String name, Type type);
}
