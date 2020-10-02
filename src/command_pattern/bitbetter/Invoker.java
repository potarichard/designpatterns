package command_pattern.bitbetter;

// could have a list of commands, but its like a device so know when designed what actions it have
public class Invoker {

	Command on;
	Command off;
	Command up;
	Command down;
	
	public Invoker(Command on, Command off, Command up, Command down) {
		super();
		this.on = on;
		this.off = off;
		this.up = up;
		this.down = down;
	}
	
	public void clickOn() {
		on.execute();
	}
	public void clickOff() {
		off.execute();
	}
	public void clickUp() {
		up.execute();
	}
	public void clickDown() {
		down.execute();
	}
	
	public void clickOnAgain() {
		on.undo();
	}
}
