package com.satish.practice.hackerrank;

import java.util.LinkedList;
import java.util.Random;

public class RandomNumberGeneration {

	public static void main(String[] args) {

		int[] old = new int[50];
		Random ran = new Random();
		ran.setSeed(System.currentTimeMillis());
		
		
		for(int i=0;i<old.length;i++){
			old[i]=ran.nextInt(100);
		}
		
		int[] curr = old.clone();
		
		for(int each:curr){
			System.out.print(each+" ");
		}
		
		//LinkedList<E> i= new LinkedList<>();
	}
}
