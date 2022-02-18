package oop_field;

public class CarThis2 {

	String model;
	String color;
	String company = "Hyundai";
	int maxSpeed;
	
	CarThis2(String model) {
		this(model, "은색", 250); 	// 호출

	}
	
	CarThis2(String model, String color) {
		this(model, color, 250);	// 호출
	}
	
	CarThis2(String model, String color, int maxSpeed) {
		// 공통실행코드
		this.model = model;
		this.color = "은색";
		this.maxSpeed = maxSpeed;
		
	}
	
	
}
