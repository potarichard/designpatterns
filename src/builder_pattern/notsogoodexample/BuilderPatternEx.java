package builder_pattern.notsogoodexample;

// Separate the construction of a complex object from its representation so that the same
// construction processes can create different representations.
//example: We sometimes need to convert one text format to another text format (e.g., RTF to ASCII text).
public class BuilderPatternEx 
{
	public static void main(String[] args) 
	{
		 System.out.println("***Builder Pattern Demo***\n");
		 
		 Director director = new Director();
		 IBuilder carBuilder = new Car();
		 IBuilder motorBuilder = new MotorCycle();
		 
		 // Making Car
		 director.Construct(carBuilder);
		 Product p1 = carBuilder.GetVehicle();
		 p1.Show();
		 
		 //Making MotorCycle
		 director.Construct(motorBuilder);
		 Product p2 = motorBuilder.GetVehicle();
		 p2.Show();
	}

}
