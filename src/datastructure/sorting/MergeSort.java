package datastructure.sorting;

public class MergeSort {

	public void sort(int[] arr, int l, int r) {
		
if(r > l) {
	int mid = (l + r)/2;
	
	sort(arr,l, mid);
	sort(arr, mid+1,r);
	merge(arr, l , mid, r); 
}		
	
	}
	
	
	private void merge(int[] arr, int l, int mid, int r) {
		// TODO Auto-generated method stub
		int n1 = mid - l+1;
		int n2 = r -mid;
		
		int[] leftArr = new int[n1];
		int[] rightArr = new int[n2];
		
		for(int i=0;i< n1;i++) {
			leftArr[i] = arr[l+i];
		}
		for(int i=0;i< n2;i++) {
			rightArr[i] = arr[mid+1+i];
		}
		int i = 0,j=0,k=l;
		while(i < n1 && j < n2) {
			if(leftArr[i] <= rightArr[j]) {
				arr[k]= leftArr[i];
				i++;
			}else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}



	public static void main(String[] args) {
		int[] arr = {31,12,4,7,90,42};
		
		new MergeSort().sort(arr,0,arr.length-1);
		for(int i=0;i< arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
