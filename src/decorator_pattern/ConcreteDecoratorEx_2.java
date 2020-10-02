package decorator_pattern;

public class ConcreteDecoratorEx_2 extends AbstractDecorator
{
	public ConcreteDecoratorEx_2(Component component) {
		super(component);
	}

	public void doJob()
	{
	 super.doJob();
	 
	 //Add additional thing if necessary
	 System.out.println("Explicitly From DecoratorEx_2" + " shape added");
	}
}
