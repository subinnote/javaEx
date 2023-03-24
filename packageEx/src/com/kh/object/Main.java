package com.kh.object;

import com.kh.object.practice.Person;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("ssgnote9","갤럭시노트9","경기도 수원", 960000, 10.0);
		Person person2 = new Person("lgxnote5","LG스마트폰5","경기도 평택", 780000, 0.7);
		Person person3 = new Person("ktsnote3","KT스마트폰3","서울시 강남", 250000, 0.3);
		
		System.out.println(person1.information());
		System.out.println(person2.information());
		System.out.println(person3.information());
		
		System.out.println("========================");
		person1.setPrice(1200000);
		person2.setPrice(1200000);
		person3.setPrice(1200000);		
			
		System.out.println("========================");
		person1.setTax(0.05);
		person2.setTax(0.05);
		person3.setTax(0.05);
		
		System.out.println(person1.information());
		System.out.println(person2.information());
		System.out.println(person3.information());
		
		System.out.println("========================");
		
		person1.calc();
		person2.calc();
		person3.calc();
		
		
	}
}
