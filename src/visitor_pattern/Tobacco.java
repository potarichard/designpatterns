package visitor_pattern;

public class Tobacco implements Visitable
{
	private double price;	
	public double getPrice() { return price; }

	Tobacco(double item) 
	{
		price = item;
	}

	@Override
	public double accept(Visitor visitor) 
	{	
		return visitor.visit(this);	
	}	

}
