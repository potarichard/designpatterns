package state_pattern;

public class Channel implements State 
{
	 @Override
	 public void pressSwitch(TV context)
	 {
		 System.out.println("If tv is on i go stream mode");
		 if(context.getOffOnState().getClass().isInstance(On.class))	
			 context.stream_state = new Stream();
	 }
}
