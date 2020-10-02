package state_pattern_better;

public class MetalGate extends Gate 
{
	public MetalGate() {
		this.state = new ClosedState(this);
	}

	@Override
	public void changeState(GateState gatestate) {
		this.state = gatestate;		
	}

	@Override
	public void enter() {
		this.state.enterEvent();		
	}

	@Override
	public void pay() {
		this.state.payEvent();		
	}

	@Override
	public void payOk() {
		this.state.payOkEvent();		
	}

	@Override
	public void payFailed() {
		this.state.payFailedEvent();		
	}

	public void getState() {
		System.out.println(this.state);
	}
}
