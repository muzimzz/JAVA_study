package serin_java_practice;

public class MainClass {
		
	public static void main(String[] args) {
		
		// [1]: 숫자끼리의 연산
		int a = 1;
		int b = 2;	
		int c = a + b;
		
		System.out.println("a + b = " + c);
		
		// [2]: 문자열끼리의 연산
		String a_ = "1";
		String b_ = "2";	
		String c_ = a_ + b_;
		
		System.out.println("a_ + b_ = " + c_);
		
		
		int a1 = Integer.parseInt(a_);
		int b1 = Integer.parseInt(b_);
		int c1 = a1 + b1;
		
		System.out.println("a1 + b1 = " + c1);
	}
	
}