package state_pattern;

public class Stream implements State 
{
	 @Override
	 public void pressSwitch(TV context)
	 {
		 System.out.println("If tv is on i go channel mode");
		 if(context.getOffOnState().getClass().isInstance(On.class))			 
			 context.stream_state = new Channel();
	 }
}
