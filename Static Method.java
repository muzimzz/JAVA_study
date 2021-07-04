package serin_java_practice;

import java.util.Scanner;

public class MainClass {
		
	public static void main(String[] args) {
		
		// helloWorld();  --> 에러: 메인 메서드는 static 메서드만 호출할 수 있다.
		
		MainClass main = new MainClass(); 
		main.helloWorld();	// 객체 생성 후 메서드 호출
		
	}
	
	public void helloWorld() {
		
		System.out.println("Hello Wolrd");	

	}
	
}