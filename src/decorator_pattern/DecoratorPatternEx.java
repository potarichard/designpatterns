package decorator_pattern;

// Attach additional responsibilities to an object dynamically!!!
public class DecoratorPatternEx 
{

	public static void main(String[] args) 
	{
		System.out.println("***Decorator pattern Demo***\n");
		Component component = new Component();
		
		ConcreteDecoratorEx_1 cd_1 = new ConcreteDecoratorEx_1(component);
		cd_1.doJob();
		
		System.out.println();
		
		ConcreteDecoratorEx_2 cd_2	= new ConcreteDecoratorEx_2(cd_1);
		cd_2.doJob();
	}

}
