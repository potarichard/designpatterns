package observer_pattern;

public class BetterObserver implements IObserver
{
	@Override
	public void update(int i)
	{
		System.out.println("Observer1: myValue in Subject is now: "+i);
	}
}
