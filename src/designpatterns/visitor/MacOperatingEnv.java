package designpatterns.visitor;

public class MacOperatingEnv implements RouterVisitor{

	@Override
	public void visit(TendaRouter router) {
		router.receive("Tenda router data is sent, mac os");
				
	}

	@Override
	public void visit(DLinkRouter router) {
		router.receive("Dlink router data is sent, mac os");		
	}

	@Override
	public void visit(TcpLinkRouter router) {
		router.receive("TcpLink router data is sent, mac os");		
	}

}
