package com.satish.practice.interview;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	public static void reverseString(int[] a, int n) {
		
				for (int ri = (a.length)-1; ri >= 0; ri--) {

					int b=a[ri];	
					
					HashMap<Integer, String> hash= new HashMap<>();
					
					hash.put(1, "value");
						}

	}

		    public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        int n = in.nextInt();
		        int arr[] = new int[n];
		        for(int arr_i=0; arr_i < n; arr_i++){
		            arr[arr_i] = in.nextInt();
		        }
		        
		        reverseString(arr,n);
		        
		        
		        
		    }
		}


