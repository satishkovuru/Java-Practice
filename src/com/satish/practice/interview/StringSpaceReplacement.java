package com.satish.practice.interview;

public class StringSpaceReplacement {

	public static void spaceReplace(char[] s, int b) {

		int count = 0;
		int newLength;

		for (int i = 0; i < s.length; i++) {
			if (s[i] == ' ') {
				count++;

			}

		}
		newLength = b + count * 2;

		// s[newLength] = '\0';
		for (int i = b - 1; i >= 0; i--) {
			if (s[i] == ' ') {
				s[newLength - 1] = '0';
				s[newLength - 2] = '2';
				s[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				s[newLength - 1] = s[i];
				newLength = newLength - 1;

			}

		}

	}

	public static void main(String[] args) {

		String a = "Hello how are you?";
		int b = a.length();
		char[] s = a.toCharArray();

		spaceReplace(s, b);
		System.out.println(s);
	}
}
