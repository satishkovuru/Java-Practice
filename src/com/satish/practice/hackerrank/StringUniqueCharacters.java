package com.satish.practice.hackerrank;

public class StringUniqueCharacters {

	public static void main(String[] args) {

		String un = "satish";
		System.out.println(unique(un));

	}

	private static boolean unique(String str) {

		if (str.length() > 256) {
			return false;
		}

		boolean[] check = new boolean[256];

		// keeping an array to see which chars have been used

		for (int i = 0; i < str.length(); i++) {

			int val = str.charAt(i);
			if (check[val]) {
				return false;
			}
			check[val] = true;
		}

		return true;

	}
}