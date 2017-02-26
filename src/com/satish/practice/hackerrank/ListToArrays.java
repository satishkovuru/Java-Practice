package com.satish.practice.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListToArrays {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		for (int i = 0; i <= 12; i++) {

			list.add(i + 1);

	
		}
		
		//List to arrays
		System.out.println("Array List"+Arrays.deepToString(list.toArray()));
		//Arrays to list
		
		for(Object d:list.toArray()){
			System.out.print(d+" ");
		}
		int a=6;
		double	 bb=(float) a;
		List<String> l=Arrays.asList(Arrays.deepToString(list.toArray()));
	
		Collections.shuffle(l);
		
		
		for(String a1:l){
			System.out.println(a1);
		}
	}
}
