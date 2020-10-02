package state_pattern_better;

public class ClosedState implements GateState {

	private Gate gate;
	
	public ClosedState(Gate gate) {
		super();
		this.gate = gate;
	}
	
	@Override
	public void enterEvent() {
		System.out.println("Gate state is closed, received a enterEvent");		
	}

	@Override
	public void payEvent() {
		System.out.println("Gate state is closed, received a payEvent");
		this.gate.changeState(new ProcessingState(this.gate));			
	}

	@Override
	public void payOkEvent() {
		System.out.println("Gate state is closed, received a payOkEvent");		
	}

	@Override
	public void payFailedEvent() {
		System.out.println("Gate state is closed, received a FailedEvent");		
	}

	@Override
	public String toString() {
		return "Closed gate state";
	}

	
}
