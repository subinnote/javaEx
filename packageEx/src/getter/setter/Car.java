package getter.setter;

public class Car {
	private int speed; // 직접 접근하지 못하게 제한
	private boolean stop;
	
	
	public int getSpeed() {
		// 필드값을 반환
		return speed;
	}
	public void setSpeed(int speed) {
		// 필드의 값을 변경
		// 검증후 값을 변경합니다
		if(speed>0) {
			this.speed = speed;
		}else {
			this.speed = 0;
		}
		
	}
	// is로 시작하면 반환 타입이 boolean 인 경우가 많음
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		
		if(stop) {
			this.setSpeed(0);;
		}
		this.stop = stop;
	}
}
