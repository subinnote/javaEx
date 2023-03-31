package com.objectEx;
/**
 * 1. API(Application Programming Interface)
 * 
 */
public class ObjectEx {
	public static void main(String[] args) {
		String str = ""; //==> object
		print(str);
		System.out.println("=================");
		
		// 기본타입 : 값 자체가 저장
		// 참조타입 : 주소가 저장
		// . : 주소접근연산자
		
		int num = 0; // ==> Integer => object
		// int 타입은 기본타입이므로 object타입으로 변환되지 못함
		// int 타입을 객체형태로 변환해야 합니다.
		// ==> Wrapper클래스인 Interfere ????
		
		// int -> Integer (자동형변환)
		// double -> Double
		// 기본타입 : 값 자체를 저장
		// 참조타입 : 주소를 저장한다
		
		print(num);
		System.out.println("=================");
		ObjectEx objEx = new ObjectEx();
		print(objEx);
		
		str.toString();
	
		
	}
	
	// 참조타입의 최상위 계층
	// 부모타입으로 자동 형변환
	public static void print(Object obj) {
		// Object 클래스에 toString이 정의되어 있지만
		// 메서드의 오버라이딩에 의해서
		// String 클래스, Integer 클래스에 정의되어 있는 메서드가 호출된다.
		
		// 클래스이름@16진수숫자주소값을 반환
		System.out.println(obj.toString());
		
		// 두 객체가 가지고 있는 주소값을 비교합니다.
		// 주소가 같으면 true. 다르면 false
		obj.equals(new Object());
	}
}

