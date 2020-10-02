package command_pattern.bitbetter;

public class OnCommand implements Command {

	Receiver receiver;	
	
	public OnCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		receiver.on();		
	}

	@Override
	public void undo() {
		receiver.off();		
	}

}
