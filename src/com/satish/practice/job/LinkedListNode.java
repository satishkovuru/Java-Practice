package com.satish.practice.job;

public class LinkedListNode {

	public static void main(String[] args) {

		int[] A = new int[5];
		A[0] = 1;
		A[1] = 4;
		A[2] = -1;
		A[3] = 3;
		A[4] = 2;
		System.out.println(solution(A, A.length));
	}

	static int solution(int A[], int n) {
		
		
		int length = 1;
		int k, i = 0;
		for (int j = 0; j < A.length; j++) {
			k = A[i];
			if (k < 0 || k >= A.length)
				return length;
			else
				length++;
			i = k;
		}

		return length;
	}
}
