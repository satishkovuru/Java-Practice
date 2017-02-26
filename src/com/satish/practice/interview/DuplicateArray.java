package com.satish.practice.interview;

import java.util.*;

public class DuplicateArray {

	public static void main(String[] args) {

		int[] arr = new int[102];

		for (int i = 1; i <= 100; i++) {
			arr[i - 1] = i;
		}

		arr[101] = 89;
		removeDuplicatesforSumofNumbers(arr);
		bruteforce(arr);
		usingHashSet(arr);
		effectiveMethod(arr);//this is the most effective way cheking duplicate arrays.
	}

	private static void effectiveMethod(int[] arr) {

		for (int bb = 0; bb < arr.length; bb++) {

			if (arr[bb] > 0) {
				arr[bb] = -arr[bb];
				System.out.println("Duplicate Value is "+arr[bb]);

			} else {
				System.out.println("No Duplicates");
			}
	}
	}

	private static void usingHashSet(int[] arr) {

		HashSet<Integer> a = new HashSet<>();

		for (int num : arr) {
			if (!a.add(num)) {
				System.out.println("Duplicate value is" + num);
			}

		}
	}

	private static void bruteforce(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++)
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate value is " + arr[j]);
				}
		}

	}

	public static boolean removeDuplicatesforSumofNumbers(int[] arr) {

		int j = 0;

		for (int a : arr) {
			j += a;
		}
		if (j != (5050)) {
			int duplicate = j - 5050;
			System.out.println("Duplicate value is" + duplicate);

		}

		return true;
	}

}
