package corejava;

public class Inheritance extends MapPractise {
	
	static final  void test() {
		System.out.println("hi, i am in test");
	}
	
	static final void test(int a) {
		System.out.println("yippe");
	}
public  Inheritance() {
	System.out.println("yolo");
}

class sub extends Inheritance{
	
	
}
	
	public static void main(String[] args) {
		new Inheritance();
	}
}
