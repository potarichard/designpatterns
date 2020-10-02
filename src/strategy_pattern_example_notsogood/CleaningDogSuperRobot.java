package strategy_pattern_example_notsogood;

// it is strategy pattern without interfaces, but with concrete objects.
// it should inherit from cleaning and dog classes, but instead it has that and do like them
public class CleaningDogSuperRobot {

	// no inheratance, use these "compositions" instead, and have functionalities what we want!
	
	// strategy pattern is quite similar, it instead have interface fields, and in the contructor we set those interfaces with concrete impl
	// implementations, could be functional interface, and just add the lamda to it.
	private Robot robot_source = new Robot();
	private CleaningRobot cleaning_source = new CleaningRobot();
	private Dog dog_source = new Dog();
	
	void move() {
		robot_source.move();
	}
	
	void clean() {
		cleaning_source.clean();
	}
	
	void bark() {
		dog_source.bark();
	}
	
	void detectFaces() {
		System.out.println("As an artifical Intellect, I can detect faces");
	}
}
