package oop6_1;

public class OriginPerCal {

	// field
	int firstNum;
	int secNum;
//	int add;
//	int minus;
	
	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecNum() {
		return secNum;
	}

	public void setSecNum(int secNum) {
		this.secNum = secNum;
	}

//	public int getAdd() {
//		return add;
//	}
//
//	public void setAdd(int add) {
//		this.add = add;
//	}
//
//	public int getMinus() {
//		return minus;
//	}
//
//	public void setMinus(int minus) {
//		this.minus = minus;
//	}



	// method
	public int calAdd(int firstNum, int secNum) {
		
		return firstNum + secNum;
	}
	
	public int calMinus(int firstNum, int secNum) {
		
		return firstNum - secNum;
	}
	
	
	public static void main(String[] args) {
		
		OriginPerCal cal = new OriginPerCal();
		
//		cal.calAdd(10,20);
//		cal.calMinus(10, 20);
		
		System.out.println(cal.calAdd(10, 20));
		System.out.println(cal.calMinus(10, 20));
	}

}
