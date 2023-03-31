package com.objectEx;

import java.util.HashMap;

public class ObjectEx2 {
	public static void main(String[] args) {
		/**
		 *         타입, 타입
		 * HashMap<key, value>
		 * 
		 * 해쉬맵 선언부
		 * HashMap<String, String> hashMap = new HashMap<>();
		 * 동일한 키가 저장될 수 없다
		 * 이미 존재하는 키를 이용해 데이터를 담을 경우 덮어쓰기
		 * 
		 * 1.	홍길동
		 * 2.	나몰라
		 * 3.	나잘난
		 */
		HashMap<String, String> hashMap = new HashMap<>();
		// 데이터를 담는 방법
		hashMap.put("키", "value");
		hashMap.put("키1", "value1");
		hashMap.put("키", "newValue");
		hashMap.put(new String("pp1"), "홍길동");
		hashMap.put("pp2", "나몰라");
		hashMap.put("pp3", "나잘난");
		
		// 데이터를 꺼내는 방법
		// System.out.println("키1 : " hashMap.get("키1"));
		String str = hashMap.get("키");
		System.out.println("키 : " + str);
		System.out.println("키1 : "+ hashMap.get("키1"));
		System.out.println("키2 : "+ hashMap.get("키2"));
		System.out.println("pp1 : "+ hashMap.get("pp1"));
		String pp2 = hashMap.get("pp2");
		System.out.println(pp2);
		
		HashMap<Integer, String> hashMap1 = new HashMap<>();
		hashMap1.put(1, "베를린"); // Integer 사용하면 숫자도 사용가능
		System.out.println(hashMap1.get(1));
		
		
	}	
}
