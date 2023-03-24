package getter.setter;

public class PersonMain {
	public static void main(String[] args) {
		
		Person p = new Person("123456-1234567", "홍삼원");
		// 상수 필드의 값을 변경할 수 없다
		// p.nation = "한국"; <-- 상수를 바꾸려고하면 컴파일 오류발생함
		p.name = "홍사원";
		
		System.out.println("파이값 : " + Person.PI);
		System.out.println("지구반지름 : " + Person.EARTH_RADIUS + "km");
		
		//
	}
}
