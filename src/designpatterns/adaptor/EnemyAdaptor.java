package designpatterns.adaptor;

public class EnemyAdaptor implements EnemyAttacker {

	EnemyRobot robot;

	public EnemyAdaptor(EnemyRobot robot) {
		this.robot = robot;
	}

	@Override
	public void fireWeapon() {
		robot.samshWithHands();
	}

	@Override
	public void walkForward() {
		robot.walkForward();

	}

	@Override
	public void assignDriver(String driver) {
		robot.reactToHuman(driver);
	}
}
