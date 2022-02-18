package oop_method;

public class Unreachable {

	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다."); // 1번
			return false;
		} else {
			System.out.println("gas가 있습니다."); // 2번
			return true;
		}
	}
}
