package com.satish.practice.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IncreaseArrayListSize {

	//Not working
	
	
	static void increaseSizeofArray(List<Integer> list) {

		List<Integer> newlist = new ArrayList<Integer>((list.size() * 2));

		for (int a : list) {
			newlist.add(a);
		}

	}

	public static void main(String[] args) {

		List<Integer> list =Arrays.asList(new Integer[10]);

		for (int i = 0; i <= 12; i++) {

			if (i<list.size()) {
				list.add(i+1);
			} else {
				increaseSizeofArray(list);
			}
		}

	}
}
