package com.satish.practice.hackerrank;

public class IdenticalCharCounts {
//Identical Chacter count in string
	
	static{
		System.out.println("Hello");
	}
	public static void main(String[] args) {

		String a = "goat";
		String b = "toga";

		boolean t = count(a, b);
		System.out.println(t);

	}

	private static boolean count(String a, String b) {

	
		
		if(a.length()!=b.length()){
			System.out.println("No character counts mached");
			
		}
		
		
		
		
		char[] c = a.toCharArray();
		char[] d = a.toCharArray();

		int count = 0;
		int _count = 0;
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == c[i + 1]) {
				count++;
			}

			if (d[i] == d[i + 1]) {
				_count++;
			}
		}
		System.out.println(count + " " + _count);

		return false;
	}

}
