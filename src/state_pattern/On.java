package state_pattern;

public class On implements State
{
	 @Override
	 public void pressSwitch(TV context)
	 {
		 System.out.println("I am already On .Going to be Off now");
		 context.setOffOnState(new Off());
	 }
}
