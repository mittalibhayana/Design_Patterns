package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Isubject {

	private List<IObserver> list;

	private double googlePrice;
	private double applePrice;
	private double ibmPrice;

	public StockGrabber() {
		list = new ArrayList<IObserver>();
	}

	public double getGooglePrice() {
		return googlePrice;
	}

	public void setGooglePrice(double googlePrice) {
		this.googlePrice = googlePrice;
		notifyObserver();
	}

	public double getApplePrice() {
		return applePrice;
	}

	public void setApplePrice(double applePrice) {
		this.applePrice = applePrice;
		notifyObserver();
	}

	public double getIbmPrice() {
		return ibmPrice;
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	@Override
	public void register(StockObserver stockObserver) {
		list.add(stockObserver);

	}

	@Override
	public void deregister(StockObserver stockObserver) {
		list.remove(list.indexOf(stockObserver));
	}

	@Override
	public void notifyObserver() {

		for (IObserver observer : list) {
			observer.update(googlePrice, applePrice, ibmPrice);
		}

	}

}
