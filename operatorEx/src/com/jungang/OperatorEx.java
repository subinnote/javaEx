package com.jungang;

public class OperatorEx {
	public static void main(String[] args) {
		int x = 5, y = 2;
		// 나머지 연산자 %
		// 두 수의 나눗셈 결과 나머지 값을 반환
		// -> 홀수인지 짝수인지 구분 할 때
		// 연산 결과를 알고싶으면 직접 출력해보기
		System.out.println(x % y);
		if (x % y == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		// 비교연산자의 연산결과는 boolean 타입으로 반환
		boolean b = (x+y) < 5;
		System.out.println("비교연산의 결과 : " + b);
		
	}
}
