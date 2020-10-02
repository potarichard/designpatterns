package command_pattern.bitbetter;

public class OffCommand implements Command {

	Receiver receiver;	
		
	public OffCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.off();
	}

	@Override
	public void undo() {
		receiver.on();		
	}

}
