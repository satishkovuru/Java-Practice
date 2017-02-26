package com.satish.practice.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAbstractDataType {

	static List<Integer> a = new ArrayList<Integer>();

	char c = 'a';

	public static void main(String[] args) {

		// In arrays add,remove,set,size,isempty will take O(1) which means it
		// takes
		// from 1 nano second to 3 minutes to do this operation
		// If for insert,remove, it will take O(n) which means if the size
		// increases the time also increases.
		// thus for adding or removing it needs to shift entire arrays so it
		// will take much 4
		// time which is it is worst when the i=0
		// It will throw IndexOutOfBound Exception when it adds,remove,set more
		// values than the size of the array
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.remove(0);
		// a.add(1);
		a.set(0, 5);
		System.out.println(a.get(0));
		System.out.println(a.size());
		// System.out.println(a.clear());
		System.out.println(a.lastIndexOf(1));
		System.out.println(a.indexOf(1));

		for (int b : a) {
			System.out.println(b);
		}
	}

}
