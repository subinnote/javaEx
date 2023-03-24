package com.kh.object;

import com.kh.object.practice.Book;

public class Application2 {
	public static void main(String[] args) {
		Book book = new Book();
		Book book1 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		
		System.out.println(book.information());
		System.out.println(book1.information());
		System.out.println("=================================");
		
		book.setTitle("C언어");
		book.setPrice(30000);
		book.setDiscountRate(0.1);
		book.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(book.information());		
		System.out.println("=================================");
		
		book.calc();
		book1.calc();

		
	}
}
