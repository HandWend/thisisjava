package oop_method;

public class MyCarOil {
	
	//필드
	int oil;
	
	//생성자
	
	//메소드
	void setOil(int oil) {
		this.oil = oil;
	}
	boolean isLeftOil() {
		if (oil == 0) {
			System.out.println("기름이 모두 소진되었습니다.");
			return false;
		} 
		System.out.println("아직 기름이 남아있습니다.");
		return true;
	}
	void run() {
		while(true) {
			if (oil > 0) {
				System.out.println("주행 중입니다. (oil잔량: " + oil + ")");
				oil-=1;
			} else {
				System.out.println("기름이 다 떨어졌습니다. 시동을 끕니다. (oil잔량: " + oil + ")");
				return;
			}
		}
	}
}
