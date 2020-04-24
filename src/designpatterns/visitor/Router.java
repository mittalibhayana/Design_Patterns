package designpatterns.visitor;

public interface Router {

	public void send(String data);
	public void receive(String data);
	
	public void accept(RouterVisitor visitor);
	
}
