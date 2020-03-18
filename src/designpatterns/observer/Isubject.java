package designpatterns.observer;

public interface Isubject {

	
	public void register(StockObserver stockObserver);
	public void deregister(StockObserver stockObserver);
	public void notifyObserver();
	
	
}
