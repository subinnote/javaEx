package forWhile;

import java.util.Scanner;

public class Example04_07 {
	public static void main(String[] args) {
		// 입력을 받기위해 스캐너 객체를 생성합니다.
		//boolean run = true;
	
		Scanner scan = new Scanner(System.in);
		
		int money = 0;
		Outter:
		while(true) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");
			// scan.next() 사용자의 입력을 문자열로 반환
			int input = scan.nextInt(); // 사용자의 입력을 숫자로 반환
			// switch(변수){
			//		case 변수의 값:
			// }
			// input : 사용자의 입력값
			switch (input) {
				// input == 1
				case 1:
					// 변수의 값이 1이면 실행
					System.out.print("예금액> ");
					// 반복문, switch 문을 빠져나갑니다.
					money += Integer.parseInt(scan.next());
					System.out.println("현재 잔고는 " + money + "입니다.");
					
					// break문이 없으면 다음 case를 계속해서 실행한다
					break;
				// input == 2
				case 2:
					System.out.print("출금액> ");
					System.out.println("==출금 : " + money);
					int num = scan.nextInt();
					if(money < num) {
						System.out.println("잔액이 부족합니다.");
					} else {
						money -= num; // money = money - num
						System.out.println("잔액은 "+ money + "입니다");
					}
					break;
				// input == 3
				case 3:
					System.out.println("잔고> " + money);		
					break;
				// input == 4
				case 4:
					//System.exit(0);
					break Outter;
				}
			
		
			}
			scan.close();
			System.out.println("프로그램 종료");	
			//System.out.println("money : " + money);
		

			
			
//			if money = 0;
//			if(input == 1) {
//				//예금
//			}else if(input == 2) {
//				//출금
//			}else if(input == 3) {
//				//잔고
//			}if(input == 4) {
//				//종료
//			}
			
		}
	}

