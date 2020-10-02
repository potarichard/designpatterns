package state_pattern_better;

public class OpenedState implements GateState {

	private Gate gate;
	
	public OpenedState(Gate gate) {
		super();
		this.gate = gate;
	}

	@Override
	public void enterEvent() {
		System.out.println("Gate state is opened, received a enterEvent");
		this.gate.changeState(new ClosedState(this.gate));		
	}

	@Override
	public void payEvent() {
		System.out.println("Gate state is opened, received a payEvent");
	}

	@Override
	public void payOkEvent() {
		System.out.println("Gate state is opened, received a payOKEvent");
	}

	@Override
	public void payFailedEvent() {
		System.out.println("Gate state is opened, received a payFailedEvent");
	}

	@Override
	public String toString() {
		return "Opened gate state";
	}
}
