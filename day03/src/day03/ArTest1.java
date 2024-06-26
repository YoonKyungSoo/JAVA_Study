package day03;

import java.util.Scanner;

public class ArTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int data0 = 10;
		int data1 = 5;
		int data2 = -7;
		int data3 = -17;
		int data4 = 22;
		
//		System.out.println(data0);
//		System.out.println(data1);
//		System.out.println(data2);
//		System.out.println(data3);
//		System.out.println(data4);
		
		//선언 방법 1
		int[] arData1 = {10, 5, -7, -17, 22, 2000};
		System.out.println(arData1);
		
		//배열의 각 방은 변수나 마찬가지(안에 있는 값을 사용)
//		System.out.println(arData1[0]);
//		System.out.println(arData1[1]);
//		System.out.println(arData1[2]);
//		System.out.println(arData1[3]);
//		System.out.println(arData1[4]);
		
		//for문의 반복 횟수를 해당하는 배열의 길이로 해놓으면 유지보수에 편리하다.
		//적절한 상황에 사용해야 함
		for (int i = 0; i < arData1.length; i++) {
			System.out.println(arData1[i]);
		}
		
		//선언 방법 2
		int[] arData2 = new int[3];
		//배열의 각 방은 변수나 마찬가지(공간으로 사용)
//		System.out.print("1번째 정수 : ");
//		arData2[0] = sc.nextInt();
//		System.out.print("2번째 정수 : ");
//		arData2[1] = sc.nextInt();
//		System.out.print("3번째 정수 : ");
//		arData2[2] = sc.nextInt();
		for (int i = 0; i < arData2.length; i++) {
			System.out.print((i+1)+"번째 정수 : ");
			arData2[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arData2.length; i++) {
			System.out.println(arData2[i]);
		}
	}
}











