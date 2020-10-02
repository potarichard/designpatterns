package command_pattern;

public class AddCommand implements ICommand
{
	private Receiver receiver;
	
	private int a = 1, b = 1;
	
	public AddCommand(Receiver recv)
	{
		this.receiver = recv;
	}
	
	public AddCommand(Receiver recv, int a, int b)
	{
		this.receiver = recv;
		this.a = a;
		this.b = b;
	}
	
	 @Override
	 public void execute()
	 {
		 receiver.AddCommand(a, b);
	 }
}
