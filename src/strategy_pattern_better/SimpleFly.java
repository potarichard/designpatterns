package strategy_pattern_better;

public class SimpleFly implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Simple flying");		
	}

	
}
