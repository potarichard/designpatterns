package adapter_pattern2;

import java.util.Random;

// o az aki nem tudja az EnemyAttacker interfacet, ezert kell majd kompatibilissa tenni
// ugy h a fireWeapon() -> smashWithHands()-t hivja stb. ertelem szerint adaptaljuk
public class EnemyRobot implements HumanLikeEnemy
{
	Random generator = new Random();
	
	public void smashWithHands() 
	{		
		int attackDamage = generator.nextInt(10) + 1;		
		System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Hands");		
	}

	public void walkForward() 
	{		
		int movement = generator.nextInt(5) + 1;		
		System.out.println("Enemy Robot Walks Forward " + movement + " spaces");		
	}

	public void reactToHuman(String driverName) 
	{		
		System.out.println("Enemy Robot Tramps on " + driverName);		
	}
}
