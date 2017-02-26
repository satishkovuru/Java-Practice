package com.satish.practice.hackerrank;

import java.util.Arrays;

public class ArrayProduct {

	public static void main(String[] args) {

		int[] a = { 2,7,3,4 };
		System.out.println(Arrays.toString(arrayProduct(a)).toString());

	}

	private static int[] arrayProduct(int[] a) {

		int[] b = new int[a.length];

		int result = 1;

		for (int i = 0; i < a.length; i++) {

			result *= a[i];
		}

		for (int j = 0; j < a.length; j++) {

			b[j] = result / a[j];
		}

		return b;
	}

}

