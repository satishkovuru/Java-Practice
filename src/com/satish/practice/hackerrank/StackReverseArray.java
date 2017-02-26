package com.satish.practice.hackerrank;

import java.util.Stack;

public class StackReverseArray {

	@SuppressWarnings("unchecked")
	public static void stackReverse(int[] a) {

		@SuppressWarnings("rawtypes")
		Stack stack = new Stack();

		for (int i = 0; i < a.length; i++) {

			stack.push(a[i]);

		}
		for (int j = 0; j < a.length; j++) {

			a[j] = (int) stack.pop();

		}
		for (int jk = 0; jk < a.length; jk++) {

			System.out.print(a[jk]);

		}
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		stackReverse(a);

	}

}
