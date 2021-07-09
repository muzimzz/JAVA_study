package serin_java_practice;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("    ========== 상속이란? ==========");
		System.out.println("부모 클래스가 가지고 있는 속성(변수)과 기능(메서드)을 그대로 물려받아 새로운 클래스를 만드는 것");
		System.out.println("물려받은 것들은 그대로 사용하고, 새로운 것만 만들면 된다.");
		System.out.println("부모 클래스(Parent Class)를 슈퍼 클래스(Super Class)라고도 한다.");
		System.out.println("자식 클래스(Child Class)를 서브/하위 클래스(Sub Class)라고도 한다.");
		System.out.println("extends 키워드를 사용한다.");
		System.out.println("부모 클래스의 멤버와 메서드는 상속이 가능하나 생성자는 상속 불가능");
		System.out.println("부모 클래스의 접근 제한자가 private면 상속을 받아도 접근 불가능\n\n\n\n");

		Person p1 = new Person(20, "강아지");
		p1.walk();	
		// p1.run();
		// p1.get_info();   ---> Person클래스에 run(), get_info() 메서드 없음
		
		Hero h1 = new Hero(22, "고양이", "투명망토");
		h1.walk();
		h1.run();
		h1.get_info();
		
		Expert game = new Expert(450, 700);
		game.stage_info();	// Basic에서 초기화된 stage1~stage3이 그대로 출력
	}

}

class Person {
	
	int age;
	String name;
	
	Person() { }
	
	Person(int age, String name) {
		this.age = age;
		this.name = name;		
	}
	
	void walk () {
		System.out.println(name + "은(는) 10의 속도로 걷습니다.");
	}
	
}

class Hero extends Person {
	
	String ability;
	
	Hero() { }
	
	Hero(int age, String name, String ability) {	
		this.age = age;
		this.name = name;
		this.ability = ability;
	}
	
	void walk () {
		System.out.println(name + "은(는) 30의 속도로 걷습니다.");
	}
	
	void run() {
		System.out.println(name + "은(는) 50의 속도로 달립니다.");
	}
	
	void get_info() {
		System.out.println("====Hero Info====");
		System.out.println("이름: " + name + "\n나이: " + age + "\n능력: " + ability);
	}
	
}

class Basic {
	int stage1 = 100;
	int stage2 = 200;
	int stage3 = 300;
	
	Basic() { };
	
}

class Expert extends Basic {
	int stage4;
	int stage5;
	
	Expert() { };
	
	Expert(int s4, int s5) {
		this.stage4 = s4;
		this.stage5 = s5;
	}
	
	void stage_info() {
		System.out.println("스테이지    난이도    ");
		System.out.println("stage1   " + stage1);
		System.out.println("stage2   " + stage2);
		System.out.println("stage3   " + stage3);
		System.out.println("stage4   " + stage4);
		System.out.println("stage5   " + stage5);
	}
}