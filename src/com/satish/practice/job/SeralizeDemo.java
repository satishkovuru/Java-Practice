package com.satish.practice.job;

import java.io.Serializable;

public class SeralizeDemo implements Serializable {

	String name;
	int age;
	transient int SSN;

/*	SeralizeDemo(String name, int age, int SSN) {

		name = name;
		age = age;
		SSN = SSN;

	}
*/
}


