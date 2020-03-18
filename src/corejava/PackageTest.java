package corejava;

import java.lang.ref.SoftReference;

public class PackageTest {
public static void main(String[] args) {
	PackageTest test = new PackageTest();
	
	SoftReference<PackageTest> ref = new SoftReference<PackageTest>(test);
	
	

	while(true) {
		System.out.println("obj --"+ref.get());
		int[][] arr = new int[1000000][100000];
		try {
		}catch(OutOfMemoryError e) {
			System.out.println("exception "+e);
		}finally {
			System.out.println("object ??"+ref.get());
		}
	}
}
}
