package algorithmProgramm;

import java.util.Scanner;

public class Anagram {
	public static int[] count(String s) {
		s = s.toLowerCase();
		int[] c = new int[25];
		for (int i = 0; i < s.length(); i++) {
			c[s.charAt(i) - 97]++;
		}
		return c;
	}
	public static boolean anagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		int[] s1count = count(s1);
		int[] s2count = count(s2);
		for (int i = 0; i < s2count.length; i++) {
			if (s2count[i] != s1count[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {

		System.out.println("enter first String :");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		System.out.println("enter second String :");
		Scanner s2;
		String str2 = sc.next();
		boolean result;
		if(result= anagram(str1, str2)) {
			System.out.println("strings are anagram");
		}else {
			System.out.println("Not anagram");
		}

	}
}
