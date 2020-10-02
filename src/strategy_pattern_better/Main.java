package strategy_pattern_better;

public class Main {

	public static void main(String[] args) {
		
		//1. way lamda way
		Duck duck = new Duck(	()-> System.out.println("simple flying"),
								()-> System.out.println("simple quacking"),
								()-> System.out.println("simple runing, almost walking speed"));

		duck.fly();
		duck.quack();
		duck.run();
		
		//2. way original way
		Duck duck_2 = new Duck(new SimpleFly(), new SuperQuack(), new SimpleRun());
		
		duck_2.fly();
		duck_2.quack();
		duck_2.run();
	}

}
