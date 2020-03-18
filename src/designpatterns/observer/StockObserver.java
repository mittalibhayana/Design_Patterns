package designpatterns.observer;

public class StockObserver implements IObserver {

	private double googlePrice;
	private double applePrice;
	private double ibmPrices;

	private Isubject stockGrabber;
	private int observerId;
private static int observerIdTracker=0;
	public StockObserver(Isubject stockGrabber) {
		this.observerId = ++observerIdTracker;
		this.stockGrabber = stockGrabber;
		stockGrabber.register(this);
	}
	// TODO Auto-generated constructor stub

	@Override
	public void update(double googPrice, double appPrice, double ibmPrice) {

		applePrice = appPrice;
		googlePrice = googPrice;
		ibmPrices = ibmPrice;
		System.out.println("For Observer id : - "+observerId+"apple price: - " + applePrice + "google price: " + googlePrice + "ibmprice: " + ibmPrices);
	}

}
