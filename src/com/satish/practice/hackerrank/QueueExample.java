package com.satish.practice.hackerrank;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		
		
		Queue<Integer> a =new PriorityQueue<Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		System.out.println(a.peek());
		System.out.println(a);
		System.out.println(a.poll());
		System.out.println(a);
	}
}
