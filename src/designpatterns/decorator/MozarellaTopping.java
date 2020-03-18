package designpatterns.decorator;

public class MozarellaTopping extends ToppingDecorator {

	public MozarellaTopping(IPizza pizza) {
		super(pizza);
		System.out.println("ADDING MOZ CHEESE");
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + "with moz cheese";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 40;
	}

}
