package strategy_pattern_better;

public class SuperFlying implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("super flying");
	}

}
