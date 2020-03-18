package datastructure;

public class RainTrappingProblem {

	public static void main(String[] args) {
		// int[] arr = { 3, 0, 0, 2, 0, 4 };
		int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		findTotalUnitsOfWaterStored(arr);
	}

	private static void findTotalUnitsOfWaterStored(int[] arr) {
		int n = arr.length;
		int[] leftArr = new int[arr.length];
		int[] rightArr = new int[arr.length];

		int totalWaterStored = 0;
		leftArr[0] = arr[0];
		rightArr[n-1] = arr[n - 1];
		for (int i = 1; i < arr.length; i++) {
			leftArr[i] = Math.max(leftArr[i - 1], arr[i]);
		}

		for (int i = n - 2; i >= 0; i--) {
			rightArr[i] = Math.max(rightArr[i + 1], arr[i]);
		}

		
		for(int i=0;i< n;i++) {
			totalWaterStored += Math.min(leftArr[i], rightArr[i]) - arr[i] ;
		}
		
		System.out.println(totalWaterStored);
	}

}
