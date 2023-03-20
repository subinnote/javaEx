package forWhile;

public class ContinueBreak {
	public static void main(String[] args) {

		System.out.println("===== 짝수의 합 구하기 ===== ");
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			// 홀수이면 증감식으로 넘어갑니다
			// %: 나머지연산자
			// 2로 나눈 나머지가 1이면 홀수 0이면 짝수
			if (i % 2 == 1) {// 2로 나눈 나머지값이 1이면 홀수
				continue; // 증감식으로 이동해
			}
			System.out.println("i=" + i);
			sum += i;
		}
		System.out.println("1부터 10까지의 짝수의 합은 " + sum + "입니다");
	}
}
