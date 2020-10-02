package flyweight_pattern;

// Use sharing to support large numbers of fine-grained objects efficiently.
// A flyweight is an object through which we try to minimize memory usage by sharing data as much as
// possible.
// lenyegeben gyartas, de singletono szeru, tehat ha valmibol mar van egy 
// akkor azt adja vissza, nem gyart ujat ennyi

// pelda: ha sok negyzetet akarok rajzolni random a screenre, es
// mondjuk kek mar van akkor nem csinalok uj keket hanem ugyanazt a kek objectet
// teszem fel csak mas pozicioba ? errol van szo ? igen


// its a factory pattern combined with a hashmap, if a object already created just give back the same instead of 
// creating a new one.
public class FlyweightPatternEx 
{

	public static void main(String[] args) throws Exception
	{
		 RobotFactory myfactory = new RobotFactory();
		 
		 System.out.println("\n***Flyweight Pattern Example***\n");
		 IRobot shape = myfactory.GetRobotFromFactory("small");
		 shape.Print();
		 
		 for (int i = 0; i < 2; i++)
		 {
			 shape = myfactory.GetRobotFromFactory("small");
			 shape.Print();
		 }
		 
		 int NumOfDistinctRobots = myfactory.TotalObjectsCreated();
		 
		 System.out.println("\nDistinct Robot objects created till now= "+ NumOfDistinctRobots);
		 
		 for (int i = 0; i < 5; i++)
		 {
			 shape = myfactory.GetRobotFromFactory("large");
			 shape.Print();
		 }
		 
		 NumOfDistinctRobots = myfactory.TotalObjectsCreated();
		 
		 System.out.println("\n Finally no of Distinct Robot objects created: "+ NumOfDistinctRobots);
	}

}
