package day02;

import java.util.Scanner;

public class IfTest {
//	Ctrl + M : 보고있는 창 최대화
//	Ctrl + Shift + F : 들여쓰기 정리

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 :");
		int num = sc.nextInt();

		String result = "";
		if (num > 0) {
			result = "양수입니다.";
		} else if (num < 0) {
			result = "음수입니다";
		} else {
			result = "0입니다.";
		}
		System.out.println(result);
		System.out.println(result);
		System.out.println(result);
		// 출력
//		위에서 만들어진 결과 문자열을 출력 
//		System.out.println(result1);

	}
}
