package oop_method;

public class MyCarOilExam {
	public static void main(String[] args) {
		MyCarOil mco = new MyCarOil();
		
		mco.setOil(5);
		
		boolean oilState = mco.isLeftOil();
		if (oilState) {
			System.out.println("출발합니다.");
			mco.run();
		}
		if (mco.isLeftOil()) {
			System.out.println("oil이 넉넉합니다.");
		} else {
			System.out.println("기름을 보충하세요.");
		}
	}
}
