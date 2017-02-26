package com.satish.practice.job;

public class Siblings {

	public static void main(String[] args) {

		System.out.println(Integer.MAX_VALUE);
		System.out.println(solution(9809));
	}

	public static int solution(int N) {
        int[] pointerArray = new int[10];
		while (N != 0) {
			int value = N % 10;
			pointerArray[value]++;
			N /= 10;
		}
		int largestSiblingNumber = 0;
		for (int i = pointerArray.length - 1; i >= 0; i--) {
			for (int j = 0; j < pointerArray[i]; j++) {
				largestSiblingNumber = largestSiblingNumber * 10 + i;
			}
		}
		return largestSiblingNumber;
	}
}
