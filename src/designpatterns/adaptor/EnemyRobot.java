package designpatterns.adaptor;

public class EnemyRobot {
	
	public void samshWithHands() {
		System.out.println("Need no weapon, got my hands you nerd!");
	}
	
	public void walkForward() {
		System.out.println("Got no wheels to walk , bitch. Got my own wheels");
	}

	public void reactToHuman(String s) {
		System.out.println("hey there!, best friend"+ s);
	}
}
