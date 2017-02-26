package com.satish.practice.interview;

import java.util.LinkedList;
import java.util.List;



public class ReverseLinkedList {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);

		for (Integer item : list) {
			System.out.println(item);
		}
		
		reverseList(list);
	}
	
	

	private static void reverseList(List<Integer> list) {
		
		
	}
}
