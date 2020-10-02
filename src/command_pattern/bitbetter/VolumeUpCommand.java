package command_pattern.bitbetter;

public class VolumeUpCommand implements Command {

	Receiver receiver;	
	
	public VolumeUpCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		receiver.up();		
	}

	@Override
	public void undo() {
		receiver.down();		
	}

}
