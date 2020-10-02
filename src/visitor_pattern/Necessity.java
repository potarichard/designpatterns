package visitor_pattern;

public class Necessity implements Visitable
{
	private double price;	
	public double getPrice() { return price; }

	Necessity(double item) 
	{
		price = item;
	}

	@Override
	public double accept(Visitor visitor) 
	{	
		return visitor.visit(this);	
	}	
}
