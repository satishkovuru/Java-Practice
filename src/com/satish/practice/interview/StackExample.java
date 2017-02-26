package com.satish.practice.interview;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {

		String str = "{((((((((()))))))))}";

		stackchec(str);

	}

	public static boolean stackchec(String str) {
		Stack<Character> stack = new Stack<>();
		char c;
		for (int i = 0; i < str.length(); i++) {

			c = str.charAt(i);

			if (c == '(' || c == '{') {
				stack.push(c);
			} else if (c == '}') {
				if (stack.empty()) {
					return false;
				} else if (stack.peek() == '{') {
					stack.pop();
				}
			} else if (c == ')') {
				if (stack.empty()) {
					return false;
				} else if (stack.peek() == '(') {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.empty();
	}
}
