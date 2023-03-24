package com.kh.object;

import com.kh.object.practice.Product;

public class Application {
	

	public static void main(String[] args) {
		Product product1 = new Product("ssgnote9","갤럭시노트9","경기도 수원", 960000, 10.0);
		Product product2 = new Product("lgxnote5","LG스마트폰5","경기도 평택", 780000, 0.7);
		Product product3 = new Product("ktsnote3","KT스마트폰3","서울시 강남", 250000, 0.3);
		
//		System.out.println(product1.getId()
//				+" "+product1.getName()
//				+" "+product1.getSite()
//				+" "+product1.getPrice()
//				+" "+product1.getTax());  // 비효율적인 출력방법
		
		System.out.println(product1.information());
		System.out.println(product2.information());
		System.out.println(product3.information());
		
		System.out.println("======모든 객체의 가격을 변경======");
		
		product1.setPrice(12000000);
		product2.setPrice(12000000);
		product3.setPrice(12000000);
		
		System.out.println("====모든 객체의 부가세율을 변경====");
		
		product1.setTax(0.05);
		product2.setTax(0.05);
		product3.setTax(0.05);
	
		System.out.println(product1.information());
		System.out.println(product2.information());
		System.out.println(product3.information());
		
		System.out.println("=============================");
			
		product1.calc();
		product1.calc();
		product1.calc();
		}
		
	}

