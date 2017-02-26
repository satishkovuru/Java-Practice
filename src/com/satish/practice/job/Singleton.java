package com.satish.practice.job;

public class Singleton {

	private static Singleton obj;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (obj == null) {
			obj = new Singleton();
		}

		return obj;

	}
	
	public  void getSomething(){
		System.out.println("Singleton");
	}
	
public static void main(String[] args) {
	//Singleton s= new Singleton();
	///s.getSomething();
}
}
