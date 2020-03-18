package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
class ArrayIndices{
	int a;
	int b;
	public ArrayIndices(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
}
public class SubArrayWithZeroSum {

	
	public static void main(String[] args) {
		
		int[] arr = {6,1,3,-4,8,2};
		ArrayList<ArrayIndices> list = new ArrayList<>();
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		int sum=0;
		for(int i=0;i< arr.length;i++) {
			
			ArrayList<Integer> al = new ArrayList<>();
			sum+=arr[i];
			
			if(sum ==0) {
				list.add(new ArrayIndices(0, i));
			}
			
			
			if(map.containsKey(sum)) {
				al = map.get(sum);
				for(int j=0;j< al.size();j++) {
					list.add(new ArrayIndices(al.get(j)+1,i));
				}
			}
			al.add(i);
			map.put(sum, al);
			
		}
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println("Sub Array from : "+ list.get(i).a +","+list.get(i).b);
		}
	}	
	
}
