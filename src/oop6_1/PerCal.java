package oop6_1;

public class PerCal {

	// field
	String modelName;	// 모델명
	String comName;		// 회사명

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	// method (더하기, 빼기 구현)
	public int calAdd(int firstNum, int secNum) {	
		return firstNum + secNum;
	}
	
	public int calMinus(int firstNum, int secNum) {
		return firstNum - secNum;
	}
	
	
	public static void main(String[] args) {
		
		PerCal cal = new PerCal();
	
		System.out.println(cal.calAdd(10, 20));
		System.out.println(cal.calMinus(10, 20));
	}

}
