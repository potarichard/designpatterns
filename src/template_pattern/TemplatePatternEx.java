package template_pattern;

//Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. The
//template method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s
//structure

public class TemplatePatternEx 
{

	public static void main(String[] args) 
	{
		System.out.println("***Template Method Pattern Demo***");

		BasicEngineering bs = new ComputerScience();
		System.out.println("\nComputer Sc Papers:");
		bs.Papers();
		
		bs = new Electronics();
		System.out.println("\nElectronics Papers:");
		bs.Papers();
	}

}
