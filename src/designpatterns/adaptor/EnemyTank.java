package designpatterns.adaptor;

public class EnemyTank implements EnemyAttacker {

	@Override
	public void fireWeapon() {
		System.out.println("Firing bullets from my tank!");
	}

	@Override
	public void walkForward() {
		System.out.println("Walking on my wheels!");

	}

	@Override
	public void assignDriver(String driver) {
		System.out.println("my driver is :" + driver);
	}

}
