package designpatterns.visitor;

public class TcpLinkRouter implements Router{


	@Override
	public void send(String data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receive(String data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(RouterVisitor visitor) {
		visitor.visit(this);		
	}

}
