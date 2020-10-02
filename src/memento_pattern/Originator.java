package memento_pattern;

public class Originator 
{
	 private String state;	 
	 private Memento memento;
	 
	 public void setState(String state)
	 {
		 this.state = state;
		 System.out.println("State at present : " +state);
	 }
	 
	 // Creates memento
	 public Memento storeMemento()
	 {
		 memento = new Memento(state);
		 return memento;
	 }

	 // Back to old state
	 public String Revert(Memento memento)
	 {
		 System.out.println("Restoring to previous state...");
		 state = memento.getState();
		 System.out.println("State at present : " +state);
		 
		 return state;
	 }
}
