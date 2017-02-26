package com.satish.practice.interview;

public class StringSort {

	public static String sorting(String s2) {
		char[] c = s2.toCharArray();// converting the string to charracter
									// array and then this is sorting using
									// Java.util.Arrays.sort()

		java.util.Arrays.sort(c);
		return new String(c);

	}

	public static void main(String[] args) {

		String s = "dog";
		String a = "god";

		permutation(s, a);
	}

	public static boolean permutation(String s, String a) {

		if (s.length() != a.length()) {// FIrst checking those two strings
										// length
			return false;
		}

		return sorting(s).equals(sorting(a));// comparing the first string and
												// second string after the
												// sorting
	}
}
