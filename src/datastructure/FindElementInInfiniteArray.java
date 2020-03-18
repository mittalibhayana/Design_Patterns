package datastructure;

public class FindElementInInfiniteArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 10, 20, 30, 40, 50, 60 };
		//int p = isPresent(arr, 0, arr.length - 1, 5);
		// System.out.println(" "+p);
		System.out.println(findInInfiniteArray(arr, 0, 50));
	}

	private static int isPresent(int[] arr, int i, int j, int x) {
		if (j >= i) {

			int mid = i + (j - i) / 2;

			if (arr[mid] == x) {
				return mid;
			}

			if (arr[mid] > x) {
				return isPresent(arr, i, mid - 1, x);
			} else {
				return isPresent(arr, mid + 1, j, x);
			}
		}
		return -1;
	}

	private static int findInInfiniteArray(int[] arr, int left, int val) {

		int key = arr[0];

		int high = left + 1;
		while (val > key) {
			high = high * 2;

			key = arr[high];
		}

		return isPresent(arr, left, high, val);
	}
}
