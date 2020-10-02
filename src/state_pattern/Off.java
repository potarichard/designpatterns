package state_pattern;

public class Off implements State
{
	 @Override
	 public void pressSwitch(TV context)
	 {
		 System.out.println("I am Off .Going to be On now");
		 context.setOffOnState(new On());
	 }
}
