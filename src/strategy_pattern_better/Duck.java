package strategy_pattern_better;

// Idea is to be able to choose new strategies runtime for alternate behaviors.

public class Duck {

	private FlyBehavior flybehavior;
	private QuackBehavior quackbehavior;
	private RunBehavior runbehavior;
		
	public Duck(FlyBehavior flybehavior, QuackBehavior quackbehavior, RunBehavior runbehavior) {
		super();
		this.flybehavior = flybehavior;
		this.quackbehavior = quackbehavior;
		this.runbehavior = runbehavior;
	}


	public void fly() {
		flybehavior.fly();
	}
	
	public void quack() {
		quackbehavior.quack();
	}
	
	public void run() {
		runbehavior.run();
	}



	public void setFlybehavior(FlyBehavior flybehavior) {
		this.flybehavior = flybehavior;
	}


	public void setQuackbehavior(QuackBehavior quackbehavior) {
		this.quackbehavior = quackbehavior;
	}


	public void setRunbehavior(RunBehavior runbehavior) {
		this.runbehavior = runbehavior;
	}		
}
