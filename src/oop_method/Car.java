package oop_method;

public class Car {

	//필드
	int speed;
	
	//생성자
	
	//메소드
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("시동을 킵니다.");
	}
	void run() {
		for (int i = 10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다. 현재 시속은 " + speed + "입니다.");
			try {// 1초마다 현재 시속이 찍혀 나오게 하기
				Thread.sleep(1000); // 1000 = 1s. 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
