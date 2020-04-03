package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	String obj;

	public Test(String obj) {
		super();
		this.obj = obj;
	}

	private static void display(Object s) {
		System.out.println("obj" + s);
	}

	private static void display(String s) {
		System.out.println("string" + s);
	}

	public static void main(String[] args) {
		// display(null);
		
		String s = "m";
		String s1 = new String("m");
		String s2 = new String("m");
		
		Set<String> setMap = new HashSet<String>();
		setMap.add(s);
		setMap.add(s1);
		setMap.add(s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("value:" + (6  ^ 3));
		TreeMap<String, List<Integer>> sorted = new TreeMap<>();
		int[][] arr = {{2,3},{4,5}};
} 
		long startTime = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(10);
		ArrayList<Test> list = new ArrayList<>();
		while (true) {
			try {
				Integer[][] arr = new Integer[100000][100000];
			} catch (OutOfMemoryError e) {
				System.out.println(e);
			}
		}

	}
}
