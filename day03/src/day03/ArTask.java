package day03;

import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
		//5칸 빈 배열 생성 후 / 1부터 5까지 넣어준 후 / 각 방에 있는 값들 순서대로 출력
		int[] arr1 = new int[5];
//		arr1[0] = 1;
//		arr1[1] = 2;
//		arr1[2] = 3;
//		arr1[3] = 4;
//		arr1[4] = 5;
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i+1;
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		//1, 100, 7, 35, 22, 78, 17, 89, 3, 9 반복문 사용해서 출력
		int[] arr2 = {1, 100, 7, 35, 22, 78, 17, 89, 3, 9};
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		//5칸 빈 배열 생성 후 10, 7, 4, 1, -2 넣어준 후 순서대로 출력	
		int[] arr3 = new int[5];
//		arr3[0] = 10;
//		arr3[1] = 7;
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = -3*i+10;
		}
		
		//사용자에게 정수 3개 입력받아서 순서대로 출력 후 총 합도 출력
		Scanner sc = new Scanner(System.in);
		int[] arr4 = new int[3];
		int sum = 0;
		for (int i = 0; i < arr4.length; i++) {
			System.out.print("정수 : ");
			arr4[i] = sc.nextInt();
			sum += arr4[i];
		}
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		System.out.println("총 합 : "+sum);
		
		//20칸 빈 배열 생성 후 홀수번째 방은 -2, -4, -6, -8, ... 넣고 짝수번째 방은 1, 3, 5, 7, .. 넣기
		int[] arr5 = new int[20];
		for (int i = 0; i < arr5.length; i++) {
			if(i%2 == 0) {
				arr5[i] = i+1;
			}
			else {
				arr5[i] = -i-1;
			}
		}
		for (int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}

		//20칸 빈 배열 생성 후 홀수번째 방은 -1, -4, -7, -10, ... 넣고 짝수번째 방은 2, 7, 12, 17, ... 넣기
		int[] arr6 = new int[20];
		//i		넣을 값					i		넣을 값
		//0		2						1		-1
		//2		7						3		-4
		//4		12						5		-7
		for (int i = 0; i < arr6.length; i++) {
			if(i%2 == 0) {
				arr6[i] = (int)((double)i*5/2+2);
			}
			else {
				arr6[i] = (int)((double)i*-3/2+0.5);
			}
		}
		for (int i = 0; i < arr6.length; i++) {
			System.out.println(arr6[i]);
		}
		
		//사용자에게 국어점수, 수학점수, 영어점수 입력받은 후 전체 점수 출력하고
		//총점과 평균 출력하기
		//입력
		//국어 점수 :
		//수학 점수 : 
		//...
		//출력
		//국어 점수 : 100점
		//수학 점수 : 80점
		//영어 점수 : 90점
		//총점 : 270점
		//평균 : 90.00점
		
		String[] arSubject = {"국어","수학","영어","JAVA"};
		int[] arScore = new int[arSubject.length];
		//입력
		for (int i = 0; i < arScore.length; i++) {
			System.out.print(arSubject[i]+"점수 : ");
			arScore[i] = sc.nextInt();
		}
		
		//처리
		int tot = 0;
		for (int i = 0; i < arScore.length; i++) {
			tot += arScore[i];
		}
		double avg = (double)tot/arScore.length;
		
		//출력
//		System.out.println(arSubject[0]+"점수 : "+arScore[0]+"점");
//		System.out.println(arSubject[1]+"점수 : "+arScore[1]+"점");
//		System.out.println(arSubject[2]+"점수 : "+arScore[2]+"점");
		for (int i = 0; i < arScore.length; i++) {
			System.out.println(arSubject[i]+"점수 : "+arScore[i]+"점");
		}
		System.out.println("총 점 : "+tot+"점");
		System.out.printf("평균 : %.2f점\n",avg);
		
		//위의 문제에서 사용자에게 과목 수와 과목 명 먼저 입력 받고 똑같은 과정 하기
		
	}
}





