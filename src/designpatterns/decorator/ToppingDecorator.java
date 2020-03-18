package designpatterns.decorator;

public class ToppingDecorator implements IPizza {

	IPizza pizza;

	public ToppingDecorator(IPizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return "with toppings";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 20;
	}

}
