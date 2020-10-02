package visitor_pattern;

public class Liquor implements Visitable 
{
	
	private double price;
	public double getPrice() { return price; }

	Liquor(double item) 
	{
		price = item;
	}

	@Override
	public double accept(Visitor visitor) 
	{	
		return visitor.visit(this);	
	}	

}
