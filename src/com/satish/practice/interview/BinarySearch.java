package com.satish.practice.interview;

public class BinarySearch {

	// Iterative
	public static void main(String[] args) {
		int[] arr = { 0, 5, 13, 19, 22, 41, 55, 68, 72, 81, 98 };
		int index = search(arr, 55);
		System.out.println(index);

	}

	static int search(int[] arr, int a) {

		int i = 0, j = arr.length, med;
		while (i <= j) {
			med = (i + j) / 2;

			if (arr[med] == a) {
				return med;
			}
			if (arr[med] < a) {
				i = med + 1;
			} else {
				j = med - 1;
			}
		}

		return 0;

	}
}

