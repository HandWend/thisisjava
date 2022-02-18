package oop_method;

public class MethodCalExam {

	public static void main(String[] args) {
		MethodCal mc = new MethodCal();
		
		//정사각형의 넓이 구하기
		double result1 = mc.areaRect(10);
		
		// 직사각형의 넓이 구하기
		double result2 = mc.areaRect(10, 20);
		
		System.out.println("정사각형의 넓이는 " + result1);
		System.out.println("직사각형의 넓이는 " + result2);
	}
}
