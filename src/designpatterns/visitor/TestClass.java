package designpatterns.visitor;

public class TestClass {

	
	public static void main(String[] args) {
		
		RouterVisitor macVisitor = new MacOperatingEnv();
		RouterVisitor windowsVisitor = new WindowsOsEnv();
		
		
		Router dLinkRouter = new DLinkRouter();
		Router tendaRouter = new TendaRouter();
		
		dLinkRouter.accept(macVisitor);
		dLinkRouter.accept(windowsVisitor);
		
		tendaRouter.accept(macVisitor);
		
	}
}
