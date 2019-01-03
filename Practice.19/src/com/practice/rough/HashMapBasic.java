package com.practice.rough;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		
		hashMap.put(1, "Uday");
		hashMap.put(2, "Ankita");
		hashMap.put(3,"Sachin");
		hashMap.put(4,"Sourav");
		hashMap.put(0, "Bruno");
		
		Set set=hashMap.entrySet();
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry mentry = (Map.Entry)itr.next();
			System.out.println("Key:"+mentry.getKey());
			System.out.println("Value:"+mentry.getValue());
		}
		
	}

}
