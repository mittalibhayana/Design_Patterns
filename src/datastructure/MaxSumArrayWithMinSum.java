package datastructure;

public class MaxSumArrayWithMinSum {

	public static void main(String[] args) {

		int[] arr = { 10, 10, 10, 10 };

		System.out.println(findMinSum(arr, 2, 4));

	}

	private static int findMinSum(int[] arr, int k, int n) {
		int start = 1;
		int end = 0;
		int minSum = 0;
		for (int i = 0; i < n; i++) {
			end += arr[i];
		}

		while (start <= end) {
			int mid = (start + end) / 2;
			if (checkIfSubArray(arr, n, mid, k)) {
				minSum = mid;
				end = mid -1;
			} else {
				start = mid + 1;
			}
		}
		return minSum;

	}

	private static boolean checkIfSubArray(int[] arr, int n, int mid, int k) {
		int count = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] > mid) {
				return false;
			}
			sum += arr[i];

			if (sum > mid) {
				count++;
				sum = arr[i];
			}

		}
		count++;
		if (count <= k) {
			return true;
		}
		return false;
	}

}
