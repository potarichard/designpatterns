package prototype_pattern;

// Specify the kinds of objects to create using a prototypical instance, and create new objects by
// copying this prototype.
// clonable interface használata{{{}

public class PrototypePatternEx 
{

	public static void main(String[] args) 
	{
		 BasicCar ford_basic = new Ford("Ford Yellow");
		 ford_basic.price=500000;
		 
		 BasicCar bc1 = ford_basic.clone();
		 
		 System.out.println("Car is: " + ford_basic.modelname+" and it's price is Rs."+ford_basic.price);
		 System.out.println("Cloned Car is: "+ bc1.modelname+" and it's price is Rs."+bc1.price);
		 
		 System.out.println("Car hash is: " + ford_basic.hashCode());
		 System.out.println("Cloned car hash is: " + bc1.hashCode());
	}

}
