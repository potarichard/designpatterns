package command_pattern;

// ennek a klassnak a piszkalasa, ez fogja meghivni a kivant specko kommandot,
// meghivhat barmilyen konkret kommandot aki implementalta az Icommand interfacet
public class Invoke 
{
	 ICommand cmd;
	 
	 public void ExecuteCommand(ICommand cmd)
	 {
		 this.cmd = cmd;
		 cmd.execute();
	 }
}
