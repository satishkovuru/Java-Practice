package com.satish.practice.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MthToLastElement {

	public static void MthNumberinArray(int m, int[] a) {

		int[] rev = new int[a.length];
		int j = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			rev[j] = a[i];
			j++;
		}

		System.out.println(rev[m - 1]);

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		List<Integer> a = new ArrayList<>();
		while (s.hasNext()) {
			a.add(s.nextInt());
		} 

			int[] arr = new int[a.size()];
			int k = 0;
			for (int d : a) {
				arr[k] = d;
				k++;
			}
			MthNumberinArray(m, arr);

		
	}

}
