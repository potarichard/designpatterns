package command_pattern;

public class UndoCommand implements ICommand
{
	 private Receiver receiver;
	 
	 UndoCommand(Receiver recv)
	 {
		 receiver=recv;
	 }
	 
	 @Override
	 public void execute()
	 {
		 receiver.performUndo();
	 }
}
