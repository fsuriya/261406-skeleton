package th.ac.cmu.cpe.cpe406.type;

import java.util.HashMap;
import java.util.Map;

import th.ac.cmu.cpe.cpe406.ast.Id;
import th.ac.cmu.cpe.cpe406.ast.TypeNode;

public class SymTable_c implements SymTable {
	
	Map<String, Type> table = new HashMap<>();
	SymTable parent;
	
	public SymTable_c(SymTable parent) {
		this.parent = parent;
	}

	@Override
	public Type lookup(String name) {
		// TODO Auto-generated method stub
		if (table.containsKey(name)) return table.get(name);
		else if (parent != null) return parent.lookup(name);
		else return null;
	}

	@Override
	public void add(String name, Type type) {
		// TODO Auto-generated method stub
		table.put(name, type);
	}

}
