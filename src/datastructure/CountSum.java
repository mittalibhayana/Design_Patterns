package datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSum {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int t = scan.nextInt();
	
	while(t-- > 0) {
		int n = scan.nextInt();int sum = scan.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i< n;i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(findCount(arr, sum));
	}
	scan.close();
	
}

private static int findCount(int[] arr, int sum) {

	Map<Integer,Integer> map = new HashMap<>();
	for(int i=0;i< arr.length;i++) {
		if(map.containsKey(arr[i])) {
			map.put(arr[i],map.get(arr[i]) + 1);
		}else {
			map.put(arr[i],1);
		}
	}
	int count=0;
	for(int i=0;i< arr.length;i++) {
		
		if(map.containsKey(sum - arr[i])) {
			count = count+ map.get(sum- arr[i]);
		}
		
		if(sum - arr[i] == arr[i]) {
			count--;
		}
		
	}
	
	return count/2;
}
}
