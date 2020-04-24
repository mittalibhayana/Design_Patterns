package designpatterns.visitor;

public class TendaRouter implements Router {

	@Override
	public void send(String data) {

	}

	@Override
	public void accept(RouterVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void receive(String data) {
		System.out.println(data);
	}

}
