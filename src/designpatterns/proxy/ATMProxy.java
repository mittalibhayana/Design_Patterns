package designpatterns.proxy;

public class ATMProxy implements GetATMData {

	
	@Override
	public void getCurrentState() {
		ATMMachine machine = new ATMMachine();
		machine.getCurrentState();

	}

	@Override
	public int getCashInMachine() {
		ATMMachine machine = new ATMMachine();
		return machine.getCashInMachine();
	}

}
