package com.satish.practice.interview;

//comments added
import java.util.Scanner;

public class ReverseString {

	private static Scanner sc;

	public static void usingStringBuilder(String inp) {

		char[] c = inp.toCharArray();
		StringBuilder rev = new StringBuilder();
		for (int i = c.length - 1; i >= 0.; i--) {
			rev.append(c[i]);
		}
		System.out.println(rev);

	}

	public static String usingStringBuffer(String inp) {
		return new StringBuffer(inp).reverse().toString();
	}

	public static String usingSubString(String inp) {

		if (inp.length() < 2) {
			return inp;
		} else {
			return usingSubString(inp.substring(1)) + inp.charAt(0);

		}

	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String inp = sc.nextLine();
		usingStringBuilder(inp);
		String ss = usingSubString(inp);
		String sb = usingStringBuffer(inp);
		System.out.println(ss);

	}

}
