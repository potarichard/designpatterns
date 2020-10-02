package state_pattern;

// Allow an object to alter its behavior when its internal state changes. The object will appear to
// change its class. - egy gomb, kezdfeti állapot off -> bekapcsol -> állapot on -> 
// gomb mégegyszer megnyom már kikapcs lesz

public class StatePatternEx 
{
	
	public static void main(String[] args) 
	{
		 System.out.println("***State Pattern Demo***\n");
		 		 
		 TV tv = new TV();
		 tv.setOnOffState(new Off());
		 
		 //First time press
		 tv.pressButton0();
		 
		 //Second time press
		 tv.pressButton0();
	}

}
