package forWhile;

public class Examples {
	public static void main(String[] args) {
		System.out.println("2번문제");
		// 1-100까지 정수 중 3의 배수의 총합
		int sum = 0;
		for(int i = 1; i<101; i++) {
						// 3의 배수인지 판단
			if(i%3 != 0) {
				// != 아니면 (! = 부정연산자)
				// == 같으면 != 같지 않으면
				// 3의 배수가 아니면 증감식으로 이동
				continue;
			}
			System.out.println("i= "+i);
			sum += i;
		}
		 System.out.println("\n3번문제");
		 // 두개의 주사위를 던져서 나온 수
		 // 1~6까지 6개의 수가 나올 수 있다
		 // 0.000...1 <= Math.randome() < 1
		 // 0.000...1 <=          <0.000...9
		 // 0.000...6 <=          <5.4... *6을 했을 때
		 // 0보다 크거나 같고 5보다 작은 값을 추출 0,1,2,3,4,5
		 // 초기값 지정(+) + 1
		 // i, j 합이 5이면 (i,j) 출력후 종료
		 // 아니면 계속 주사위를 굴립니다.
		 while(true) {
				
		 int i = (int)(Math.random()*6+1);
		 int j = (int)(Math.random()*6+1);
		 System.out.println("i=" +i);
		 System.out.println("j=" +j);
		 if(i+j == 5) {
			 System.out.printf("(%d,%d)",i,j);
			 break;
		 }
		 }
		 System.out.println("\n\n5-1번문제");
		 for(int i = 1; i < 5; i++) {
			 for(int j = 1; j <= i; j++){
			 System.out.print("*");
			 if(j == i) {
				 System.out.println();
			 }
		 }
	}
		 System.out.println("\n5-2번문제");
		 for(int i = 5; i > 0; i--) {
			 for(int j = 1; j < i; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
			 continue;
		 }
		 
		 System.out.println("\n6번문제");
		 // i = 1,2,3,4
		 for(int i = 1; i<5; i++) {
			 // j = 4,3,2,1
			for(int j=4; j>0; j--) {
				if(i >= j){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
			
		 }
	}
}