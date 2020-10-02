package decorator_pattern;

public class AbstractDecorator extends Component
{
	protected Component component;
	
	public AbstractDecorator(Component component) { 
		this.component = component;	
	}
	
	public void doJob()	
	{
	 if (component != null)
		 component.doJob();
	}
}
