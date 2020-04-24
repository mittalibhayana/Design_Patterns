package designpatterns.visitor;

public interface RouterVisitor {
	
	public void visit(TendaRouter router);
	public void visit(DLinkRouter router);
	public void visit(TcpLinkRouter router);
}
