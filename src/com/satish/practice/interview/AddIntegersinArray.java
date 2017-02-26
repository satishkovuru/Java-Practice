package com.satish.practice.interview;

public class AddIntegersinArray {

	public static void SumofArrayValues(int[] arr) {

		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);
	}

	public static void findDuplicatearray(int[] arr, int b) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == b) {
				count++;
			}

		}
		System.out.println(count);
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9 };

		// integer values sum in array
		SumofArrayValues(arr);
		// find how many times a value is repeated
		findDuplicatearray(arr, 2);
		
		int[] b=arr.clone();
		
		
	}

}
