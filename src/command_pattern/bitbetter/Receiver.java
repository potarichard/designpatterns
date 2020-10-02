package command_pattern.bitbetter;

// kellenek ide azok amilyen kommandok elehetnek
public interface Receiver {
	
	public void on();
	public void off();
	public void up();
	public void down();
}
