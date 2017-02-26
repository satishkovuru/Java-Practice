package com.satish.practice.job;

public class PrimesImprovement {

	public static void main(String[] args) {

		// This code should print out the prime numbers.
		// task: Fix and improve the algorithm
		/*
		 * 1. Code fixed by changing the starting value of j to 2 in line 22 
		 * Where I am checking either if a value is equal to itself or 
		 * when divided by some number leaves reminder zero then those are not prime numbers 
		 * and changing the boolean prime check
		 * 
		 */

		System.out.println("Printing primes from 1 to 100");
		int i;
		int j;
		boolean prime;
		for (i = 1; i <= 100; i++) {
			if (i > 1) {
				prime = true;
				for (j = 2; j < i; j++)
					if (i == j || i % j == 0)
						prime = false;
				if (prime)
					System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
