package serin_java_practice;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		
		int[] arr1 = {1, 2, 3, 4, 5};
		//�迭�� �ʱ�ȭ�� ������ ���ÿ� ��
		int[] arr2 = new int[5]; 
		//ũ�Ⱑ 5�� �迭 ����� 0���� �ʱ�ȭ
		int[] arr3 = null;
		//�迭�� null�� �ʱ�ȭ
		int[] arr4 = null;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		//Arrays.toString(arr): arr�� ��� ���
		arr3 = Arrays.copyOf(arr1, 3);
		//Arrays.copyOf(arr, n): arr�� ����� n������ ����
		arr4 = arr1;
		//arr1 = arr2: arr2�� ���۷��� = arr1�� ���۷���
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(arr4);
		
		
	}
	
}