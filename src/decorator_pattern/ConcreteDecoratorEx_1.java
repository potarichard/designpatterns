package decorator_pattern;

public class ConcreteDecoratorEx_1 extends AbstractDecorator
{
	public ConcreteDecoratorEx_1(Component component) {
		super(component);
	}

	public void doJob()
	{
	 super.doJob();
	 
	 //Add additional thing if necessary
	 System.out.println("I am explicitly from Ex_1" + " basic compnenet decorated color added");
	}
}
