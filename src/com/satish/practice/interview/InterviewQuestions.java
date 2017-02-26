package com.satish.practice.interview;

import java.util.Arrays;

public class InterviewQuestions {

	int a;
	String s;

	public InterviewQuestions(int a, String s) {

		this.a = a;
		this.s = s;
	}

	public static void main(String[] args) {

		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		InterviewQuestions a= new InterviewQuestions(5,"satish");
		
		
		
	/*	Interview Questions
	 * 1.What will happen if you put return statement or System.exit () on try or catch block? Will finally block execute?
	 * the application will exit and doensnt go to the finally block.
	 * 2.Question: Can you override a private or static method in Java?
	 * No we cannot override any static members and private because the memory allocation for static is class level 
	 * which cannot be changes
	 * 3.Tricky Question in Java when a double number is divided by a double 0
	 * then it will not throw any ARTHAMATIC EXCEPTION insted it will PRINT INFINITY
	 * 4.Does Java support multiple inheritances?
	 * Yes through interface but not through extends as it is ambiguous
	 * What will happen if we put a key object in a HashMap which is already there?
	 * It will take that key as Hashmap doesnt allow duplicates it will replace the existing key with this one 
	 * 5.If a method throws NullPointerException in the superclass, can we override it with a method which throws RuntimeException?
	 * One more tricky Java questions from the overloading and overriding concept. 
	 * The answer is you can very well throw superclass of RuntimeException in overridden method,
	 * but you can not do same if its checked Exception.
	 * 
	 * 
	 **/
		System.out.println(1.0/0.0);//Prints INFINITY
		
		
		char[] chars = new char[] {'\u0097'};
		String str = new String(chars); 
		byte[] bytes = str.getBytes();
		System.out.println(Arrays.toString(bytes));//Prints 63 in US Local systems with Windows OS 


	}

}
