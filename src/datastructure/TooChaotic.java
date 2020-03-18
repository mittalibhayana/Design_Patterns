package datastructure;

public class TooChaotic {

	static void minimumBribes(int[] q) {
		int n = q.length;

		int bribe = 0;
		boolean chaotic = false;
		for (int i = 0; i < n; i++) {
			System.out.println("index " + i + ", and value q[i]: " + q[i]);
			if (q[i] - (i + 1) > 2) {
				chaotic = true;
				break;
			}
			for (int j = Math.max(0, q[i] - 2); j < i; j++) {
				System.out.println("index j: " + j + "and value q[j]" + q[j]);
				if (q[j] > q[i])
					bribe++;
			}
		}
		if (chaotic)
			System.out.println("Too chaotic");
		else
			System.out.println(bribe);
	}

	public static void main(String[] args) {
		int[] q = { 1, 2, 5, 3, 4 };
		minimumBribes(q);
	}

}
