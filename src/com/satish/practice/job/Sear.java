package com.satish.practice.job;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sear {

		public static void main(String[] args) {

		SeralizeDemo s = new SeralizeDemo();
		s.name="Satish";
		s.age=25;
		s.SSN=2229;
		try {
			FileOutputStream f = new FileOutputStream("F:/Interview/Interview_emails/sear/employee.ser");
			ObjectOutputStream ob = new ObjectOutputStream(f);
			ob.writeObject(s);
			ob.close();
			f.close();
	         System.out.printf("Serialized data is saved in /tmp/employee.ser");


		} catch (Exception e) {
			System.out.println(e);
		}


	}

}
