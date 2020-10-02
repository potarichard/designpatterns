package facade_pattern;

// Provide a unified interface to a set of interfaces in a system. Facade defines a higher-level
// interface that makes the subsystem easier to use.
public class FacadePatternEx 
{

	public static void main(String[] args) 
	{
		 System.out.println("***Facade Pattern Demo***\n");
		 
		 RobotFacade rf1 = new RobotFacade();
		 rf1.ConstructRobot("Green", "Iron");		// egybefog sok almuveletet, amit nem kell latni, jobbahatterben elrejtve
		 
		 System.out.println();
		 
		 RobotFacade rf2 = new RobotFacade();
		 rf2.ConstructRobot("Blue", "Steel");
	}

}
