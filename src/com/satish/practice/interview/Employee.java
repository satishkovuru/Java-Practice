package com.satish.practice.interview;

import java.io.Serializable;

public class Employee implements Serializable {

		   public String name;
		   public String address;
		   public transient int SSN;
		   public int number;
		   
		   public void mailCheck() {
		      System.out.println("Mailing a check to " + name + " " + address);
		   }
		   
		   public static void main(String[] args) {
			  TestPrivate t= new TestPrivate();
			System.out.println(t.address);    
		   }
		}

