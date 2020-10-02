package adapter_pattern;

// Convert the interface of a class into another interface that clients expect. The adapter
// pattern lets classes work together that couldn’t otherwise because of incompatible interfaces.

public class AdapterPatternEx 
{

	public static void main(String[] args) 
	{
		 System.out.println("***Adapter Pattern Demo***");
		 
		 CalculatorAdapter cal = new CalculatorAdapter();
		 Triangle t = new Triangle(20,10);
		 double area = cal.getArea(t);
		 
		 System.out.println("\nArea of Triangle is: " + area);
	}

}
