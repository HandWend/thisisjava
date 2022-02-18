package oop_method;

public class ElecCalc {

	int first;
	int second;

	
	 void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	
	 double divide(int x, int y) {
		return (x/y);
		}
	
	public static void main(String[] args) {
		
		new ElecCalc().powerOn();
		double result = new ElecCalc().divide(20,10);
		System.out.println(result);
	}
}
