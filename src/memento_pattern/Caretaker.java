package memento_pattern;

import java.util.ArrayList;
import java.util.List;

public class Caretaker 
{	
	private List<Memento> saved_states = new ArrayList<Memento>();
	
	public void addMemento(Memento m) 
	{ 
		saved_states.add(m); 
	}
	
	public Memento getMemento(int index) 
	{ 
		return saved_states.get(index); 
	}
	
}
