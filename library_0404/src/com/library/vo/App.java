package com.library.vo;



public class App {
	public static void main(String[] args) {
		
		Library lib = new Library(); // 초기화
		System.out.println(lib.toString()); // 리스트 불러오기
		lib.insert(1, "오늘도", "우리는", false);
		System.out.println("오늘도 우리는 추가 테스트 =============");
		System.out.println(lib.toString()); // 출력하기
		

		
	}
}
