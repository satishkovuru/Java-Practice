package com.satish.practice.hackerrank;

import java.util.Arrays;

public class Brute {

	
	   public static int[] getProductOfElementsExceptIndex(int[] numbers) {
		   
		   
		      int[] ans = new int[numbers.length];

		      
		      
		      int product = 1;
		      for (int i = 0; i < numbers.length; i++) {
		         ans[i] = product;
		         product *= numbers[i];
		      }
		      
		      product = 1;
		      for (int i = numbers.length - 1; i >= 0; i--) {
		         ans[i] *= product;
		         product *= numbers[i];
		      }
		      
		      // ans = [ 56, 42]
		      
		      
		      return ans;
		   }

	   
	   public static void main(String[] args) {
		      int[] numbers = new int[] {2, 7, 3, 4};
		      int[] ans = getProductOfElementsExceptIndex(numbers);
		      System.out.println(Arrays.toString(getProductOfElementsExceptIndex(ans)).toString());
		   }
}
