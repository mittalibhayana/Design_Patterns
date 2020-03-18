package datastructure;

public class EquilibriumIndex {

	public static void main(String[] args) {
		EquilibriumIndex equi = new EquilibriumIndex();
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
		int arr_size = arr.length;
		System.out.println(equi.equilibrium(arr, arr_size));

	}

	private int equilibrium(int[] arr, int arr_size) {
		int leftSum = 0;
		int sum = 0;

		for (int i = 0; i < arr_size; i++) {
			sum = sum - arr[i];
			if (leftSum == sum) {
				return i;
			}
			leftSum = leftSum + arr[i];
		}
		return -1;
	}
}
