package strategy_pattern_better;

public class SimpleQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quacking simply");		
	}

}
