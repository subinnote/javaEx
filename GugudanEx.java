package forWhile;

public class GugudanEx {
	public static void main(String[] args) {

		for (int dan = 2; dan < 10; dan++) {
			System.out.println(dan + "단");
			for (int i = 9; i > 0; i--) {
				// System.out.println("i =" + i);
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
			System.out.println();
		}
	}
}
