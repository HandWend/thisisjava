package oop_method;

public class ElecCalc2 {

	int first;
	int second;

	
	 static void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	
	 static double divide(int x, int y) {
		return (x/y);
		}
	
	public static void main(String[] args) {
		
		powerOn();
		double result = divide(20,10);
		System.out.println(result);
	}
}
