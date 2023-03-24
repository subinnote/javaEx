package getter.setter;

public class Person {
	
	static final double PI = 3.14159;
	static final double EARTH_RADIUS = 6400;
	
	// 상수: 한번 값이 정해지고 나면 수정이 불가능
	final String nation = "korea"; // 접근제어자 안쓰면 default, 패키지내에서만 사용 가능
	final String ssn;
	String name; 
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		
		// 상수는 값을 변경하는것이 불가능!
		// this.ssn = "123456-1234567";
		this.name = "정찬우";
	}
}
