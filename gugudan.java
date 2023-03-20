package forWhile;

public class gugudan {
	public static void main(String[] args) {
		// 구구단 출력하기
		// for(초기식; 조건식; 증감식){}
		// i 를 1~9까지 출력해보기
		
		// dan : 2 ~ 9
//		Outter :
		for(int dan = 2; dan<10; dan++) {
			System.out.println(dan + "단");
			for(int i=1; i<10; i++) {
				if(dan==2) {
//					break Outter;
				}
				//System.out.println("i =" + i);
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			}
			System.out.println();
			// 6단을 출력한 후 반복문을 탈출합니다.
			System.out.println("===== 짝수의 합 구하기 ===== ");
			int sum = 0;
			for(int i=1; i<11; i++) {
				// 홀수이면 증감식으로 넘어갑니다
				// %: 나머지연산자
				// 2로 나눈 나머지가 1이면 홀수 0이면 짝수
				if(i%2==1) {//2로 나눈 나머지값이 1이면 홀수
					continue; // 증감식으로 이동해
				}
				System.out.println("i="+i);
				sum += 1; 
			}
		}
	}
}
