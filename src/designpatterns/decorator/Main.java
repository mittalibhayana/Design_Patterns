package designpatterns.decorator;

public class Main {

	
	public static void main(String[] args) {
		IPizza pizza = new ToppingDecorator(new MozarellaTopping(new TomatoSauceTopping( new PlainPizza())));
		System.out.println(pizza.getDesc());
		System.out.println(pizza.getCost());
	}
}
