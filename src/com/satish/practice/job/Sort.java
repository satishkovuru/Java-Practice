package com.satish.practice.job;

public class Sort {

	public static void main(String[] args) {
		// This code will sort the numbers in the array.
		// task: Modify the algorithm to reverse the sort, then comment on its
		// efficiency in the space provided below:
		/*
		 * The code given is already sorted in reverse order printing all the
		 * values in descending order there is no need to modify this code for
		 * printing the sorted values Big O Notation O(n^2) would best describe
		 * the efficiency of this algorithm. this code inefficient in sorting as
		 * there is no need to create another for loop inside a for loop which
		 * will lead to several operations ie 100*100 times
		 * 
		 * My approach of this code will be
		 * 
		 * 
		 */

		// fill the array with random numbers
		int[] unsorted = new int[100];
		for (int i = 0; i < 100; i++) {
			unsorted[i] = (int) (Math.random() * 100);
		}

		System.out.println("Here are the unsorted numbers:");
		for (int i = 0; i < 100; i++) {
			System.out.print(unsorted[i] + " ");
		}
		System.out.println();

		int[] sorted = new int[100];
		for (int i = 0; i < 100; i++) {

			int hi = -1;
			int hiIndex = -1;

			for (int j = 0; j < 100; j++) {
				if (unsorted[j] > hi) {
					hi = unsorted[j];
					hiIndex = j;
				}
			}

			sorted[i] = hi;
			unsorted[hiIndex] = -1;

		}
		System.out.println("Here are the sorted numbers: ");
		for (int i = 0; i < 100; i++) {
			System.out.print(sorted[i] + " ");
		}
		System.out.println();
	}
}
