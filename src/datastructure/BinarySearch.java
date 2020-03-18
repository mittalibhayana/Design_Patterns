package datastructure;

public class BinarySearch {

	private static int first(int[] arr, int left, int right, int x) {
		if (right >= left) {
			int mid = left + right - left / 2;

			if (mid == 0 || arr[mid] == x && arr[mid - 1] < x) {
				return mid;
			}

			else if (arr[mid] < x) {
				return first(arr, mid + 1, right, x);
			} else {
				return first(arr, left, mid - 1, x);
			}
		}
		return -1;
	}

	private static int last(int[] arr, int left, int right, int x) {
		int n=arr.length-1;
		if (right >= left) {
			int mid = left + (right - left) / 2;
		
			if(mid == n-1 || arr[mid] == x && arr[mid+1] > x ) {
				return mid;
			}
			
			else if(arr[mid] > x){
				return last(arr,left,mid-1,x);
			} {
				return last(arr,mid+1,right,x);
				
			}
		}		
		return -1;
	}

	
	private static boolean isPresent(int[] arr, int i, int j,int x) {
		if(j>=i) {
			
			int mid = i + (j-i)/2;
			
			if(arr[mid] == x) {
				return true;
			}
			
			if(arr[mid] > x) {
				return isPresent(arr, i, mid-1, x);
			}
			return isPresent(arr, mid+1, j, x);
		}
		return false;
	}
	
	
	private static int binarySearch(int[] arr2, int left, int right, int x) {
		if (right >= left) {

			int mid = left + (right - left) / 2;
			if (arr2[mid] == x) {
				return mid;
			}

			if (arr2[mid] > x) {
				return binarySearch(arr2, left, mid - 1, x);
			}

			return binarySearch(arr2, mid + 1, right, x);
		}
		return -1;
	}

	public static void main(String[] args) {

		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 10, 10, 10, 30, 30, 30, 30, 40, 40,99 };

		int n = arr.length;
		int x = 10;
		//System.out.println(findCount(arr, 0, n - 1, x));
		
		 int result = ob.binarySearch(arr, 0, n - 1, 99);
		  boolean p = isPresent(arr, 0, n-1, 99);  
		  System.out.println(p);
		  if (result == -1) System.out.println("Element not present"); else
		  System.out.println("Element found at index " + result);
		 
	}

	private static int findCount(int[] arr, int i, int j, int x) {
		i = first(arr, 0, j, x);

		if (i == -1) {
			return i;
		}
		j= last(arr, i, j, x);
return j - i+1;	}
}
