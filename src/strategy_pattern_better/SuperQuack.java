package strategy_pattern_better;

public class SuperQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Super quacking...");		
	}

}
