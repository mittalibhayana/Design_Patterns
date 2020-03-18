package designpatterns.decorator;

public class TomatoSauceTopping extends ToppingDecorator {

	public TomatoSauceTopping(IPizza pizza) {
		super(pizza);
		System.out.println("ADDING TOMATO SAUCE TOPPING");
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + "with tomato sauce";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 50;
	}

}
