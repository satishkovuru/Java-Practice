package com.satish.practice.hackerrank;

import java.util.Stack;

public class Paranthesismatching {

	static boolean stackchec(String a) {

		Stack<Character> stack = new Stack<Character>();
		char[] m = a.toCharArray();

		for (int i = 0; i < m.length; i++) 
		{

			if (m[i] == '{' || m[i] == '(' || m[i] == '[')
			{

				stack.push(m[i]);
			}
			else if(m[i] == ']') {
                if(stack.isEmpty()) return false;
                if(stack.pop() != '[') return false;

            }else if(m[i]== ')') {
                if(stack.isEmpty()) return false;
                if(stack.pop() != '(') return false;

            }else if(m[i]== '}') {
                if(stack.isEmpty()) return false;
                if(stack.pop() != '{') return false;
            }

		}
		return stack.isEmpty();

	}

	public static void main(String[] args) {
		String str = "{}";

		boolean a=stackchec(str);
		System.out.println(a);
	}
}
