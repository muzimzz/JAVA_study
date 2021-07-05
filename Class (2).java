package serin_java_practice;

public class MainClass {
		
	public static void main(String[] args) {
		
		System.out.println("========클래스 작성 시 주의할 점!!========");
		System.out.println("하나의 파일에 2개 이상의 클래스를 작성할 수 있다.");
		System.out.println("여러개의 클래스가 있다면 public이 붙은 클래스가 자바 파일명이 되어야 한다.");
		System.out.println("하나의 파일에 있는 여러개의 클래스에 모두 public을 붙일 수는 없다.");
		System.out.println("하나의 파일에 있는 여러개의 클래스에 모두 public을 안 붙일 수는 있다.");
		System.out.println("하나의 파일에 있는 여러개의 모든 클래스에 public이 없다면 어느 클래스라도 파일명이 될 수 있다.");
		System.out.println("하나의 파일에 클래스가 한개 있다면 클래스명이 파일명이 되어야 한다.");
		
		
		System.out.println("\n============= 생성자 =============");
		System.out.println("생성자는 new키워드로 클래스의 객체가 생성될 때 제일 먼저 자동적으로 호출되는 특별한 메서드이다.");
		System.out.println("객체의 초기값을 설정하는 등의 용도로 많이 사용된다.");
		System.out.println("생성자명은 클래스명과 동일하게 만든다.");
		System.out.println("생성자는 return되는 반환값이 없다 --> 객체가 생성될 때 호출만 된다.");
		System.out.println("생성자는 overloading이 가능하다.");
		System.out.println("클래스 내에 생성자가 없다면 default생성자가 자동 호출된다.");
		System.out.println("보통 속성과 메서드 사이 (메서드 제일 상단)에 작성한다.");
		
	}
	
}

// 예시

class Person {
	
	String name;	// 속성 (Attribute)
	int age;
	
	Person() {		// 생성자(Constructor)
		
	}
	
	void run() {	// 메서드(Method
		System.out.println(this.name + " is running.");
	}
}