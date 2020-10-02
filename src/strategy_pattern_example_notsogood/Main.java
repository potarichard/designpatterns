package strategy_pattern_example_notsogood;


// inheritance kivaltasara van, sok faszsag jon belole
// ehelyett mi rakjuk ossze az objectet darabokbol
// inheritance Dog IS an Animal
// composition HAS a Realationship
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CleaningDogSuperRobot superrobotdog = new CleaningDogSuperRobot();
		
		superrobotdog.bark();
		superrobotdog.clean();
		superrobotdog.move();
		superrobotdog.detectFaces();

	}

}
