package state_pattern_better;

public class Main {

	public static void main(String[] args) {
		
		Gate security_gate = new MetalGate();
		
//		0.
		security_gate.getState();
		
//		1.		
		security_gate.enter();
		security_gate.getState();
		
//		2.
		security_gate.pay();
		security_gate.getState();
		
//		2.
		security_gate.pay();
		security_gate.getState();
		
//		2.
		security_gate.enter();
		security_gate.getState();
	}

}
