package adapter_pattern2;

//  so assigning the HumanLikeEnemy into the well know EnemyAttacker methods, so it can be used "normally"
public class EnemyRobotAdapter implements EnemyAttacker
{
	HumanLikeEnemy humanlike_robot;
	
	public EnemyRobotAdapter(HumanLikeEnemy newRobot)	{		
		humanlike_robot = newRobot;		
	}
	
	@Override
	public void fireWeapon() {		
		humanlike_robot.smashWithHands();		
	}
	
	@Override
	public void driveForward() {		
		humanlike_robot.walkForward();		
	}

	@Override
	public void assignDriver(String driverName) {		
		humanlike_robot.reactToHuman(driverName);		
	}

}
