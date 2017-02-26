package com.satish.practice.hackerrank;

public class SumOfArrays {

	public static int sum(int[] a, int n) {

		if ( n == 1) 
			return a[0];
		else 
			return sum(a,n-1) + a[n - 1];
		
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(sum(a,3));
	}
}
