package com.satish.practice.interview;

public class BinarySearchRecursive {

	public static int Search(int[] arr, int i, int j, int target) {

		int mid;

		if (i <= j) {
			mid = (i+j)/2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				return Search(arr, mid + 1, j, target);
			} else {
				return Search(arr, i, mid - 1, target);
			}

		}

		return -1;

	}

	public static void main(String[] args) {

		int[] arr = { 0, 5, 13, 19, 22, 41, 55, 68, 72, 81, 98 };
		int i = 0;
		int j = arr.length;
		int target = 72;
		int binarySearch = Search(arr, i, j, target);
		System.out.println(arr[binarySearch]);

	}
}
