package oop_method;

public class Calculator {

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);		// 11 --> 5 호출
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(10, 7);		// 17 --> 10 호출
		println("실행결과: " + result);	// 18 --> 21 호출
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
