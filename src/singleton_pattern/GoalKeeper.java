package singleton_pattern;


public class GoalKeeper 
{
	private static Object lock0 = new Object();
	
	private static GoalKeeper instance = null;
	private GoalKeeper() {}
	
	public static GoalKeeper getInstance() 
	{
		synchronized(lock0)
		{
			if(instance == null) 
		      {
		         instance = new GoalKeeper();
		      }
		      return instance;
		}      
	}
}
