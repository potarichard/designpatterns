package strategy_pattern;

// Define a family of algorithms, encapsulate each one, and make them interchangeable. The
// strategy pattern lets the algorithm vary independently from client to client.

// We can select the behavior of an algorithm dynamically at runtime.
public class StrategyPatternEx 
{
	public static void main(String[] args)
	{
		System.out.println("***Strategy Pattern Demo***");
		int selector = 1;
		
		IChoice ic = null;
		Context cxt = new Context();		
		String input1 = "5", input2 = "32";
		
		if(selector == 1)
		{
			ic = new FirstChoice();
		}
		else
		{
			ic = new SecondChoice();
		}
		
		cxt.SetChoice(ic);
		cxt.ShowChoice(input1,input2);
	}
	
}
