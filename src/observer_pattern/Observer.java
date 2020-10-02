package observer_pattern;

public class Observer implements IObserver
{
	public void update(int i)
	{
	 System.out.println("flag value changed in Subject");
	}
}
