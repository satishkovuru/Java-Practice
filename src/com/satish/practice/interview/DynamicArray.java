package com.satish.practice.interview;

public class DynamicArray {

	private static void increaseTheSizeOfArray(int[] a) {
		int[] dynamic = new int[a.length * 2];
		for (int _i = 0; _i < dynamic.length; _i++) {
			dynamic[_i] = a[_i];
		}
	}

	public static void main(String[] args) {

		int[] a = new int[5];

		for (int i = 0; i < a.length; i++) {

			if (i < a.length) {
				a[i] = i + 1;
			} else {
				increaseTheSizeOfArray(a);
			}
		}

	}

}
