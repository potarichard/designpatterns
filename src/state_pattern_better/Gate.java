package state_pattern_better;

public abstract class Gate 
{
	protected GateState state;
	public abstract void changeState(GateState gatestate);	
	public abstract void enter();
	public abstract void pay();
	public abstract void payOk();
	public abstract void payFailed();
	public abstract void getState();
}
