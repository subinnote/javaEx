package com.objectEx;

import java.util.HashMap;

public class ObjectEx3 {
	public static void main(String[] args) {
		HashMap<Key,String> map = new HashMap<>(); 
		Key key = new Key(1);
		Key key2 = new Key(2);
		Key key3 = new Key(1);
		
		System.out.println("키 == 키3" + key.equals(key3));
		map.put(key, "베를린");
		map.put(key2, "프라하");
		map.put(key3, "런던");
		
		System.out.println(map.get(key));
		System.out.println(map.get(key2));
		System.out.println(map.get(key3));
		
		
		
	}
	
	public void checkEquals() {
		Key key1 = new Key(1);
		Key key2 = new Key(1);
		
		
		System.out.println("key1");
		System.out.println(key1.hashCode());
		System.out.println(Integer.toHexString(key1.hashCode()));
		System.out.println(key1.toString());
		System.out.println("********************************");
		System.out.println("key2");
		System.out.println(key2.hashCode());
		System.out.println(Integer.toHexString(key2.hashCode()));
		System.out.println(key2.toString());
		System.out.println("********************************");
		System.out.println("key1.equals(key2) : " + key1.equals(key2));
	}
}
