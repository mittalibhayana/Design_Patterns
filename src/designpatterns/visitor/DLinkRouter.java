package designpatterns.visitor;

public class DLinkRouter implements Router{


	@Override
	public void accept(RouterVisitor visitor) {
		visitor.visit(this);		
	}

	@Override
	public void send(String data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receive(String data) {
		System.out.println(data);
	}

}
