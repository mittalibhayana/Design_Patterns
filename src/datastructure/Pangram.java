package datastructure;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Pangram {

	static String pangrams(String s) {
		if (isPanagram(s)) {
			return "pangram";
		} else {
			return "not pangram";
		}

	}

	static boolean isPanagram(String s) {

		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				continue;
			} else {
				arr[s.charAt(i) - 'a']++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1) {
				return false;
			}
		}

		return true;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String s = scanner.next();
		System.out.println(pangrams(s.toLowerCase()));

	}
}
