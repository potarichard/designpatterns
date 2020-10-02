package command_pattern;

// Encapsulate a request as an object, thereby letting you parameterize clients with different
// requests, queue or log requests, and support undoable operations.

// egy object eltarol minden infot ahhoz, hogy egy methodot késobb meg lehessen hivni
public class CommandPatternEx 
{

	public static void main(String[] args) 
	{
		 System.out.println("***Command Pattern Demo***\n");
		 
		 Receiver receiver = new Receiver();
		 	 
		 Invoke inv = new Invoke();
		 
//		 a konkret kommandnak meg kell adni hogy azt min akarja vegrehajtani
		 UndoCommand unCmd = new UndoCommand(receiver);
		 DoCommand reCmd = new DoCommand(receiver);
		 AddCommand add_command = new AddCommand(receiver, 5, 6);
		 
//		 az invoker az aki tenyleg meg is hivja a kommandot
		 inv.ExecuteCommand(unCmd);
		 inv.ExecuteCommand(reCmd);
		 inv.ExecuteCommand(add_command);
	}
	
}
