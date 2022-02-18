package oop_field;

public class Korean {
	
	// field
	String nation = "대한민국";
	String name;
	String birth;
	
	// constructor
	public Korean(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}
	
	
	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "011223-2345678");
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.birth: " + k1.birth);
		Korean k2 = new Korean("김이썬", "001212-1234567");
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.birth: " + k2.birth);
	}
}

