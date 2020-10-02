package state_pattern_better;

// this could be an abstract class and have the gate reference, and the contructor to inject the state... but ITs OK
public interface GateState 
{	
	public void enterEvent();
	public void payEvent();
	public void payOkEvent();
	public void payFailedEvent();
}
