package command_pattern;

// o az aki vegrehajtja a commandokat
public class Receiver 
{
	public void performUndo()
	{
		System.out.println("Executing -MyUndoCommand");
	}
	
	public void performDo()
	{
		System.out.println("Executing -MyRedoCommand");
	}
	
	public void AddCommand(int a, int b)
	{
		int res = a+b;
		System.out.println("Executing - Add, result: " + res);
	}
}
