package com.satish.practice.interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

	static void email(String emailStr) {

		Pattern regexPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

		Matcher matcher = regexPattern.matcher(emailStr);
		boolean found = matcher.find();
	}

	public static void main(String[] args) {
		email("satishkumar92@yahoo.com");

		int c = -100;
		System.out.printf("%32s%n", Integer.toBinaryString(c >>= 2));
	}
}
