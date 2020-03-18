package designpatterns.observer;

public class Main {

	public static void main(String[] args) {
		StockGrabber grabber = new StockGrabber();

		StockObserver observer = new StockObserver(grabber);

		grabber.setApplePrice(100.00);
		grabber.setGooglePrice(20);
		grabber.setIbmPrice(90.99);

		StockObserver observer2 = new StockObserver(grabber);

		grabber.setApplePrice(100.00);
		grabber.setGooglePrice(20);
		grabber.setIbmPrice(90.99);

	}
}
