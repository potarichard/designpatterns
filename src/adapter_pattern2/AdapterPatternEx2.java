package adapter_pattern2;

public class AdapterPatternEx2 {

	public static void main(String[] args) 
	{
		EnemyAttacker  rx7Tank = new EnemyTank();			// "normal" mukodesu tudja az interfacet	
//		EnemyAttacker fredTheRobot = new EnemyRobot();		// neki adapter kell mert nem tudja az interfacet
		HumanLikeEnemy fredTheRobot = new EnemyRobot();		// o a HumanLikeEnemy interfacet tudja
		
		
		// EnemyTank implements EnemyAttacker so i can use fireWeapon(), driveForward(), assignDriver(str) methods
		rx7Tank.assignDriver("Frank");
		rx7Tank.driveForward();
		rx7Tank.fireWeapon();
		
		// EnemyRobot implements HumanLikeEnemy and i cant call the same methods, instead i need to use:
		// smashWithHands(), walkForward(),	reactToHuman(str), which are similar but not the same
		fredTheRobot.reactToHuman("Paul");
		fredTheRobot.walkForward();
		fredTheRobot.smashWithHands();		
		
		// so then HumanLikeEnemy (fredTheRobot), is in an adapter type EnemyAttacker, and can use everything like if it was a EnemyAttacker
		EnemyAttacker fred_normalized = new EnemyRobotAdapter(fredTheRobot);
		
		fred_normalized.assignDriver("Mark");
		fred_normalized.driveForward();
		fred_normalized.fireWeapon();
	}

}
