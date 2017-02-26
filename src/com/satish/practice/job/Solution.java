package com.satish.practice.job;

import java.util.Arrays;

public class Solution {

	static boolean solution(int[] A) {

		int[] B = Arrays.copyOf(A, A.length);
		
		int temp = 0;
		boolean swaped = true;

		while (swaped) {
			swaped = false;
			for (int i = 0; i < B.length - 1; i++) {
				if (B[i] > B[i + 1]) {
					temp = B[i];
					B[i] = B[i + 1];
					B[i + 1] = temp;
					swaped = true;

				}

			}
		}

		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != B[i])
				count++;
		}

		if (count > 2)
			return false;
		return true;
	}

	

	public static void main(String[] args) {

		int[] unsorted = new int[100];
		for (int i = 0; i < 100; i++) {
			unsorted[i] = (int) (Math.random() * 100);
		}

		System.out.println("Here are the unsorted numbers:");
		for (int i = 0; i < 100; i++) {
			System.out.println(unsorted[i] + " ");
		}
		System.out.println(solution(unsorted));

	}

	static boolean check(int[] A) {
		int count = 0;
		int[] B = Arrays.copyOf(A, A.length);
		Arrays.sort(B);
		for (int i = 0; i < A.length; i++) {
			if (A[i] != B[i])
				count++;
		}

		if (count > 2)
			return false;
		return true;
	}
}
