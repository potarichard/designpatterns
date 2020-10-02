package memento_pattern;

// Without violating encapsulation, capture and externalize an object’s internal state so that
// the object can be restored to this state later
public class MementoPatternEx 
{

	public static void main(String[] args) 
	{
		 System.out.println("***Memento Pattern Demo***\n");
		 
		 Originator originator = new Originator();
		 Caretaker caretaker = new Caretaker();
		 
		 originator.setState("First state");
		 caretaker.addMemento(originator.storeMemento());
		 originator.setState("Second state");
		 caretaker.addMemento(originator.storeMemento());
		 originator.setState("Third state");
		 
		 originator.Revert(caretaker.getMemento(1));
		 originator.Revert(caretaker.getMemento(0));
	}

}
