package singleton_pattern;

public class SingletonPatternEx 
{
	public static void main(String[] args)
	{
		System.out.println("***Singleton Pattern Demo***\n");
		
		GoalKeeper gk1 = GoalKeeper.getInstance();
		GoalKeeper gk2 = GoalKeeper.getInstance();
		
		if(gk1 == gk2)
		{
			System.out.println("we are equal");
		}
	}
}
