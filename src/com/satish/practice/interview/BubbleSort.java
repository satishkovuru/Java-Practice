package com.satish.practice.interview;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		
	

		int[] arr = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = (int) (Math.random() * 100);
		}

		System.out.println("Here are the unsorted numbers:");
		for (int i = 0; i < 100; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	int temp = 0;
	int j=0;
	boolean swaped=true;
	
	while(swaped){
		swaped = false;
		j++;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1] = temp;
				swaped = true;

				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
