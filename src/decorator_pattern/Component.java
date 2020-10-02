package decorator_pattern;

public class Component implements IComponent
{

	@Override
	public void doJob() {
		System.out.println("I am the basic component, i can be decorated!");
	}

}
