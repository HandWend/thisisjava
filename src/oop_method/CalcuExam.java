package oop_method;

public class CalcuExam {

	public static void main(String[] args) {
		// 호출
		Calcu cal = new Calcu();
		cal.powerOn();
		
		int plusRes = cal.plus(10, 5);
		System.out.println(plusRes);
		
		double divideRes = cal.divide(10, 5);
		System.out.println(divideRes);
		
		cal.powerOff();
	}

}
