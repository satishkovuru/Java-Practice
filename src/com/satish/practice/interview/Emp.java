package com.satish.practice.interview;

import java.util.HashMap;
import java.util.Map;

public class Emp {

	
	public static void main(String[] args) {
		
	}
	
	static Map<Employee,String > loadEmpCache(){
	//	Employee ee=new Employee("100", "sss");
		
		Map<Employee,String > cache = new HashMap<>();
		return cache;
		
	}
	
	
	class Employee{
	String id;
	String name;
	
	Employee(String Eid,String Ename){
		
		Eid=id;
		Ename=name;
		
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (!getOuterType().equals(other.getOuterType()))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	private Emp getOuterType() {
		return Emp.this;
	}
	
	
	
	}
}
