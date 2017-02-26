package com.satish.practice.interview;


import java.util.Scanner;

public class ArrayTwoDImensional {

	//Hour Glasses
	public static void main(String[] args) {

		int[][] a = new int[6][6];

		Scanner in = new Scanner(System.in);
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				a[i][j] = in.nextInt();
			}
		}
		for (int _i = 0; _i < 4; _i++) {
			for (int _j = 0; _j < 4; _j++) {

				int sum = a[_i][_j] + a[_i][_j + 1] + a[_i][_j + 2] +
										a[_i + 1][_j + 1] 
						+ a[_i + 2][_j] + a[_i + 2][_j + 1] + a[_i + 2][_j + 2];

				if (maxSum < sum) {
					maxSum = sum;
				}
			}

		}

		System.out.println(maxSum);

		
	}

}
