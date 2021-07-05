package serin_java_practice;

public class MainClass {
		
	public static void main(String[] args) {
		
		// [1]: 객체 생성
		FarmMachine f1 = new FarmMachine();
		System.out.println("======FarmMachine f1======");
		
		// [2]: 객체에 속성 값 입력하기
		f1.price = 10000000;
		f1.year = 2020;
		f1.color = "red";
		
		// [3]: 속성 값 출력하기
		f1.getInfo();
	
		// [4]: 동작 수행하기
		f1.move();
		f1.dig();
		f1.grind();			
		
		
		FarmMachine f2 = new FarmMachine();
		System.out.println("======FarmMachine f2======");
		
		f2.price = 7000000;
		f2.year = 2018;
		f2.color = "yellow";
		
		f2.getInfo();
		
		f2.move();
		f2.dig();
		f2.grind();	
	}
	
}

class FarmMachine {	// 클래스: 속성+동작
	
	// [1]: 속성
	int price;		// 가격
	int year;		// 연식
	String color;	// 색상
	
	// [2]: 동작
	void move() {
		System.out.println("FarmMachine is moving...");
	}
	
	void dig() {
		System.out.println("FarmMachine is digging...");
	}
	
	void grind() {
		System.out.println("FarmMachine is grinding...");
	}
	
	void getInfo() {
		System.out.println("가격: " + this.price);
		System.out.println("연식: " + this.year);
		System.out.println("색상: " + this.color);
	}
		
}