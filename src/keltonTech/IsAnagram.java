package keltonTech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IsAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("arm", "elbow"));

	}

	private static boolean isAnagram(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		int[] charArr = new int[26];

		for (int i = 0; i < s1.length(); i++) {
			charArr[s1.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s2.length(); i++) {
			if (charArr[s2.charAt(i) - 'a'] == 0) {
				return false;
			}
		}
		return true;
	}
}
