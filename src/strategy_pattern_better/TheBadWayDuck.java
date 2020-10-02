package strategy_pattern_better;

// the bad idea is to: make a duck interface, and implement diferrent versions, then trying to combinate (implementations)
// (want to use behaviors in an implementation in another implementation...
// behaviors to match our desires (implementation with the desired behaviors, but it wont work, similar why inheritance is bad, and composite pattern solves that
// strategy pattern is similar in that way
public interface TheBadWayDuck {

	public void fly();
	public void quack();
	public void run();
}
