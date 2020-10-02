package command_pattern.bitbetter;

public class VolumeDownCommand implements Command {

	Receiver receiver;	
	
	public VolumeDownCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		receiver.down();		
	}

	@Override
	public void undo() {
		receiver.up();		
	}

}
