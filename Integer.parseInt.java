package serin_java_practice;

public class MainClass {
		
	public static void main(String[] args) {
		
		// 문자열을 정수로 변환하여 연산하기!!
		
		// [1]: 숫자끼리의 연산
		int a = 1;
		int b = 2;	
		int c = a + b;
		
		System.out.println("정수 연산 : a  + b  = " + c);
		
		// [2]: 문자열끼리의 연산
		String a_ = "1";
		String b_ = "2";	
		String c_ = a_ + b_;
		
		System.out.println("문자열 연산: a_ + b_ = " + c_);
		
		
		int a1 = Integer.parseInt(a_);
		int b1 = Integer.parseInt(b_);
		int c1 = a1 + b1;
		
		System.out.println("정수로 변환: a1 + b1 = " + c1);
		
		
		
		// 진수 지정하기
		
		System.out.println("10진수 2002   : " + Integer.parseInt("2022", 10));
		System.out.println("2진수  1010001: " + Integer.parseInt("1010001", 2));
		System.out.println("8진수  1004   : " + Integer.parseInt("1004", 8));
		System.out.println("16진수 D      : " + Integer.parseInt("D", 16));
		System.out.println("16진수 1BF    : " + Integer.parseInt("1BF", 16));
	}
	
}