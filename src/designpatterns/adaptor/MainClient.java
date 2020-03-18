package designpatterns.adaptor;

public class MainClient {

	
	public static void main(String[] args) {
		
		
		EnemyTank tank = new EnemyTank();
		
		tank.assignDriver("Mitali");
		tank.walkForward();
		tank.fireWeapon();
		EnemyAttacker attack = new EnemyAdaptor(new EnemyRobot());
		attack.fireWeapon();
		attack.assignDriver("Paul");
		attack.walkForward();
		
	}
}
