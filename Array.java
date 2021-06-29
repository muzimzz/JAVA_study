package serin_java_practice;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		
		int[] arr1 = {1, 2, 3, 4, 5};
		//배열의 초기화와 선언을 동시에 함
		int[] arr2 = new int[5]; 
		//크기가 5인 배열 멤버를 0으로 초기화
		int[] arr3 = null;
		//배열을 null로 초기화
		int[] arr4 = null;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		//Arrays.toString(arr): arr의 멤버 출력
		arr3 = Arrays.copyOf(arr1, 3);
		//Arrays.copyOf(arr, n): arr의 멤버를 n번까지 복사
		arr4 = arr1;
		//arr1 = arr2: arr2의 레퍼런스 = arr1의 레퍼런스
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(arr4);
		
		
	}
	
}