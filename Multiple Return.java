package serin_java_practice;

import java.util.Arrays;

public class MainClass {
		
	public static void main(String[] args) {
		
		int num1 = 100, num2 = 200, num3 = 300;
		
		int[] result = plusMethod(num1, num2, num3);	
		
		System.out.println("주소값: " + result);
		System.out.println(Arrays.toString(result));
		
		String[] str = capitalMethod("japan", "KOREA");
		
		System.out.println("주소값: " + str);
		System.out.println(Arrays.toString(str));
	
	}
	
	public static int[] plusMethod(int a, int b, int c) {
		
		a += 100;
		b += 200;
		c += 300;
		
		return new int[] {a, b, c};
	}
	
	public static String[] capitalMethod(String a, String b) {
		
		a = a.toUpperCase();
		b = b.toLowerCase();
		
		String[] str = {a, b};
		
		return str;
	}
	
}

