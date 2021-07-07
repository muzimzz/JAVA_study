package serin_java_practice;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p1 = new Person(23, "윤세린");
		System.out.println("==== Person1 ====");
		p1.getInfo();
		
		Person p2 = new Person(25, "강찬");
		System.out.println("==== Person2 ====");
		p2.getInfo();
		
	}

}

class Person {
	
	int age;
	String name;
	
	Person() {	
		System.out.println("====Default Constructor====");
	}
	
	Person(int a, String n) {
		this.age = a;
		this.name = n;
	}
	
	void getInfo() {
		System.out.println("나이: " + this.age);
		System.out.println("이름: " + this.name);
	}
	
}