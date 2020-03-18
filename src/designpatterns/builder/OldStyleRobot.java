package designpatterns.builder;

public class OldStyleRobot implements RobotBuilder {

	Robot robot;

	public OldStyleRobot() {
		this.robot = new Robot();
	}

	@Override
	public void buildRobotHead() {

		robot.setRobotHead("tin head");
	}

	@Override
	public void buildRobotTorso() {

		robot.setRobotTorso("tin torso");
	}

	@Override
	public void buildRobotArms() {

		robot.setRobotArms("tin arms");
	}

	@Override
	public void buildRobotLegs() {

		robot.setRobotLegs("tin legs");

	}

	@Override
	public Robot getRobot() {
		return robot;
	}

}
