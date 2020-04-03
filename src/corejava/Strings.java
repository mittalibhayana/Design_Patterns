package corejava;

import java.math.BigInteger;

public class Strings {

	public static void main(String[] args) {
		String s = "mittali";
		String s1 = "makkat";
		String s2 = new String("mittali");
		String x = s1.intern();
		String y = s2.intern();
		String s6 = null;

		
		System.out.println(bi.isProbablePrime(1));
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			s= s1 + s;
		}
		System.out.println("+ operator resullt " +s6 +(System.currentTimeMillis() - startTime));
		long time = System.currentTimeMillis();

		String s10 = "mittali";
		for (int i = 0; i < 100000; i++) {
			 s = s1.concat(s);
		}
		System.out.println("concat result"+(System.currentTimeMillis() - time));
		
		long buffer = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("mittali");
		for (int i = 0; i < 100000; i++) {
			String s9 = sb.append("makkar").toString();
		}
		System.out.println("buffer result"+(System.currentTimeMillis() - buffer));
		
		
	}
}
