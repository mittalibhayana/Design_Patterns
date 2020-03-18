package designpatterns.builder;

public class TestRobot {

	
	public static void main(String[] args) {
		RobotBuilder robot = new OldStyleRobot();
		RobotDirector director = new RobotDirector(robot);
		
		director.makeRobot();
		Robot robo = director.getRobot();
		System.out.println(robo);
		
	}
}
