package designpatterns.proxy;

public class TestProxy {

	
	public static void main(String[] args) {
		ATMProxy proxy = new ATMProxy();
		proxy.getCurrentState();
		proxy.getCashInMachine();
	}
}
