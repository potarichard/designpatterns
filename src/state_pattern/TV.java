package state_pattern;

public class TV 
{
	 private State on_off_state;
	 public State stream_state;

	 public State getOffOnState() { return on_off_state; }
	 public void setOffOnState(State state) { this.on_off_state = state; }
	 
	 
	 
	 public void setOnOffState(State state)
	 {
		 this.on_off_state = state;
	 }
	 
	 public void pressButton0()
	 {
		 on_off_state.pressSwitch(this);
	 }
}
