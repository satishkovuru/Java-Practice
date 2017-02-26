package com.satish.practice.interview;

public class CheckingTwoStrings {

	public static void main(String[] args) {

		String a = "goat";
		String b = "toga";

		boolean t = permutation(a, b);
		System.out.println(t);

	}

	public static boolean permutation(String a, String b) {

		if (a.length() != b.length()) {// FIrst checking those two strings
										// length
			return false;
		}

		char[] c = a.toCharArray();
		char[] d = b.toCharArray();

		java.util.Arrays.sort(c);
		java.util.Arrays.sort(d);
		return new String(c).equals(new String(d));

	}

}
