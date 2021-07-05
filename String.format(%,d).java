package serin_java_practice;

public class MainClass {
		
	public static void main(String[] args) {
		
		int price1 = 1000000000;		
		int price2 = 280000000;
		String price2_ = String.format("%,d", price2);
		
		System.out.println(String.format("%,d", price1));
		System.out.println(price2_);
		
	}
	
}