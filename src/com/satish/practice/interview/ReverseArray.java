package com.satish.practice.interview;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		int j = 0;
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println(a);
		int[] arr = new int[a];
		while (j <= arr.length - 1) {
			for (int i = 0; i <= arr.length - 1; i++) {
				arr[i] = in.nextInt();
				j++;
			}
			System.out.print(arr.toString());

		}

		int[] out = reverseArray(a, arr);
		for (int ii = 0; ii < out.length; ii++) {
			System.out.print(out[ii] + " ");

		}

	}

	private static int[] reverseArray(int a, int[] arr) {

		int[] rev = new int[a];
		int jj = 0;
		int temp = 0;
		for (int k = a - 1; k >= 0; k--) {
			temp = arr[k];
			rev[jj] = temp;
			jj++;

		}
		return rev;
	}
}