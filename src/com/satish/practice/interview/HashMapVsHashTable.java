package com.satish.practice.interview;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapVsHashTable {

	
	public static void main(String[] args) {
		
		
	    Hashtable<String,String> ht = new Hashtable<String, String>();
        ht.put("Alive is ", "awesome");
      //  ht.put(null, null);
        ht.put("Love", "yourself");
        System.out.println("Hashtable object output :"+ ht);
 
         
 
        HashMap hm = new HashMap();
        hm.put("Alive is ", "awesome");  
        hm.put("Love", "yourself"); 
        ht.put("", "aa");

        System.out.println("HashMap object output :"+hm); 
	}
}
