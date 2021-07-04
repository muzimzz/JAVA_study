package serin_java_practice;

import java.util.Scanner;

public class MainClass {
		
	public static void main(String[] args) {
		
		// CBR();  --> 에러: 메인 메서드는 static 메서드만 호출할 수 있다.
		
		
		MainClass main = new MainClass(); 
		int[] a = new int[5];	
			
		System.out.println("main()메서드 안에서 --> " + main + " , " + a);
		CBR(main, a);	

	}
	
	public static void CBR(MainClass m, int[] a) {
		
		System.out.println("CBR()메서드 안에서  --> " + m + " , " + a);	

	}
	
}