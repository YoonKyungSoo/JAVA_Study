package day02;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
	
		//입력 파트
		Scanner sc = new Scanner(System.in);
			System.out.println("첫번째 정수 : ");;
			String num1 = sc.nextLine();
			System.out.println("두번째 정수 : ");
			String num2 = sc.nextLine();
			
		//처리
			//두개의 입력받은 정수??를 더하기(+)
			//1. 입력받은 문자열(num1, num2) 을 정수로 바꾸기
//			Integer.parseInt("정수로 이루어진 문자열") " 문자열을 정수로 형변환"
//			Double.parseDouble("실수로 이루어진 문자열): 문자열을 실수로 형변환
			 int realNum1 = Integer.parseInt(num1);
			 int realNum2 = Integer.parseInt(num2);
			//2. 바뀐 정수들로 더하기 연산(+)
			 int result = realNum1 +realNum2;
		//출력
		System.out.println("결과는 "+result+" 입니다.");
}
}
