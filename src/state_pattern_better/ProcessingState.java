package state_pattern_better;

public class ProcessingState implements GateState {

	private Gate gate;
	
	public ProcessingState(Gate gate) {
		super();
		this.gate = gate;
	}
	
	@Override
	public void enterEvent() {
		System.out.println("Gate state is processing, received a enterEvent");		
	}

	@Override
	public void payEvent() {
		System.out.println("Gate state is processing, received a payEvent");	
		
		int amount_payed = 50;
		int pass_amount = 50;
		
		if(amount_payed >= pass_amount)
			this.payOkEvent();
		else
			this.payFailedEvent();
	}

	@Override
	public void payOkEvent() {
		System.out.println("Gate state is processing, received a payOKEvent");	
		this.gate.changeState(new OpenedState(this.gate));
	}

	@Override
	public void payFailedEvent() {
		System.out.println("Gate state is processing, received a payFailedEvent");	
		this.gate.changeState(new ClosedState(this.gate));		
	}

	@Override
	public String toString() {
		return "Processing gate state";
	}
}
