package com.satish.practice.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {

	public static void main(String[] args) {

		Map<String, String> a = new HashMap<String, String>();
		System.out.println(a.put("1", "Satish"));
		System.out.println(a.put("1", "Kumar"));
		System.out.println(a.get("1"));
	}

}
