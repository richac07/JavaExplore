package packageFront;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProblemSolving {

	static boolean uniqueString(String str) {
		if (str.length() > 26) {
			return false;
		}
		int[] tracker = new int[26];
		Arrays.fill(tracker, 0);
		String str1 = str.toUpperCase();
		int n = str1.length();
		for (int i = 0; i < n; i++) {
			int index = str1.charAt(i) - 'A';

			if (index < 0) {

			} else {
				tracker[index]++;
				if (tracker[index] > 1) {
					return false;

				}
			}

		}
		return true;
	}

	static String compressStr(String str) {
		int[] tracker = new int[26];
		String s2 = "";
		Arrays.fill(tracker, 0);
		String str1 = str.toUpperCase();
		int n = str1.length();
		for (int i = 0; i < n; i++) {
			int index = str1.charAt(i) - 'A';

			if (index < 0) {

			} else {
				tracker[index]++;
				if (i < n - 1 && (str.charAt(i + 1) != str.charAt(i))) {
					char ch = str.charAt(i);
					int v = tracker[index];
					// s2=s2.concat(Character.toString(ch)).concat(Integer.toString(v));
					s2 = s2 + ch + v;
					tracker[index] = 0;
				} else if (i == n - 1) {
					char ch = str.charAt(i);
					// s2=s2.concat(Character.toString(str.charAt(i))).concat(Integer.toString(tracker[index]));
					s2 = s2 + ch + tracker[index];
				}

			}
		}
		if (str.length() <= s2.length()) {
			return str;
		} else {
			return s2;
		}

	}

	// s1 is small, whether it is a substring of s2
	static boolean isSubstring(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();

		for (int i = 0; i <= n - m; i++) {
			int j;
//			while(j<n) {
//				if(s1.charAt(j)!=s2.charAt(i)) {
//					break;
//				}
//				else {
//					j++;
//					i++;
//				}
			for (j = 0; j < m; j++) {
				if (s2.charAt(i + j) != s1.charAt(j)) {
					break;
				}

				if (j == m - 1) {
					return true;
				}
			}

		}
		return false;
	}

	static boolean isSubstring1(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();

		int count = 0;

		for (int i = 0; i < n; i++) {

			if (s1.charAt(count) == s2.charAt(i)) {
				count++;
			} else {
				count = 0;
			}

		}

		if (count == m) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) throws Exception {
		String str = "abcd-eshfgj";
		boolean val = uniqueString(str);
		if (val) {
			System.out.println("All the character in String - Unique");
		} else {
			System.out.println("Duplicate characters in String");
		}

		String s1 = "aabbbccccdda";
		String s = compressStr(s1);
		System.out.println("Compressed String of aabbbccccdda: " + s);

		// Substring
		String str1 = "abc";
		String str2 = "abdssabc";
		boolean bool = isSubstring(str1, str2);
		// System.out.println("str1 is a substring: " +bool);
		if (bool) {
			System.out.println("str1 is  a substring");
		} else {
			System.out.println("str1 is not a substring");
		}

		boolean bool1 = isSubstring1(str1, str2);
		// System.out.println("str1 is a substring: " +bool);
		if (bool1) {
			System.out.println("String with count: ITS a  substring");
		} else {
			System.out.println("String with count: ITS not a  substring");
		}

		// Input taken from user inside console and use CTRL+D to end the input in
		// console
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> st = new ArrayList<>();

		while (scanner.hasNextLine()) {
			st.add(scanner.nextLine());
		}

		st.stream().forEach(System.out::println);

	}

}
