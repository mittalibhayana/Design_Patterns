package corejava;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverloadingConcepts {

	public static void main(String[] args) throws Exception {
A an = new A();

	an.a(20, 20);}
	
}
class A{
	  double a(int a,int b) throws IOException{
		System.out.println("in A");
		return 0;
	}
	
	 double a(int a, double b) {
		System.out.println("in a"+a);
		return 0;
	}
}

class b extends A{
	 static void a() throws FileNotFoundException {
		System.out.println("in b");
	}
}