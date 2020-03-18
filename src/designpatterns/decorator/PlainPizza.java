package designpatterns.decorator;

public class PlainPizza implements IPizza {

	@Override
	public String getDesc() {
		return "Plain Pizza";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 200;
	}

}
