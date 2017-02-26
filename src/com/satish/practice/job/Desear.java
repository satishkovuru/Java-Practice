package com.satish.practice.job;


import java.io.*;
public class Desear {

	
	public static void main(String[] args) {
		
		SeralizeDemo s= null;

			try {
				FileInputStream fin = new FileInputStream("F:/Interview/Interview_emails/sear/employee.ser");
				ObjectInputStream in = new ObjectInputStream(fin);
				s=(SeralizeDemo)in.readObject();
				in.close();
				fin.close();
				System.out.println(s.age+" "+s.name+" "+s.SSN);

			} catch (Exception e) {
				System.out.println(e);
			}
					
		}
	}

