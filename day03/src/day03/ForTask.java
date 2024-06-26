package day03;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		//초기식은 int i=0; 증감식은 i++
		
		//1부터 10까지 출력하기
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
		//10부터 1까지 출력하기
		for (int i = 0; i < 10; i++) {
			System.out.println(i*-1+10);
		}
		
		//12부터 3씩 증가하며 13번 출력하기
//		for (int i = 12; i < 51; i+=3) {
//			System.out.println(i);
//		}
		//i			표현할 값
		//0			12
		//1			15
		for (int i = 0; i < 13; i++) {
			System.out.println(i*3+12);
		}
		//100 94 88 ... 28 출력하기
//		for (int i = 100; i>=28 ; i-=6) {
//			System.out.println(i);
//		}
		for (int i = 0; i < 13; i++) {
			System.out.println(i*-6+100);
		}
		
		//1부터 10까지의 총 합 구하기
		int sum = 0;
//		sum += 1;
//		sum += 2;
//		sum += 3;
//		sum += 4;
//		sum += 5;
//		sum += 6;
//		sum += 7;
//		sum += 8;
//		sum += 9;
//		sum += 10;
		for (int i = 0; i < 10; i++) {
			sum += i+1;
		}
		System.out.println("1 ~ 10 총 합 : "+sum);
		
		//n 하나 입력받아서 / 1부터 n까지의 총 합 구하기
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		
		//처리
		//위에서 입력받은 n까지의 총 합 구하기
		sum = 0;
		for (int i = 0; i < n; i++) {
			sum += i+1;
		}
		System.out.println("1 ~ "+n+" 총 합 : "+sum);
		
		//1부터 100까지 중 짝수만 출력하기
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		//A부터 F 출력하기
		//65 ~ 70
		for (int i = 0; i < 6; i++) {
			System.out.println((char)(i+65));		
		}
		
		//n, m 입력받아서 n부터 m까지 출력하기
		System.out.print("n 입력 : ");
		n = sc.nextInt();
		System.out.print("m 입력 : ");
		int m = sc.nextInt();
		
		for (int i = n; i <= m; i++) {
			System.out.println(i);
		}
		//1부터 100까지 중 3과 5의 공배수만 출력하기
		for (int i = 1; i <= 100; i++) {
//			if(i%3 == 0 && i%5==0) {
//				System.out.println(i);				
//			}
			if(i%3 == 0) {
				if(i%5 == 0) {
					System.out.println(i);
				}
			}
		}
		
		//1부터 100까지 중 3의 배수와 5의 배수를 출력하되 공배수는 제외하고 출력하기
		for (int i = 1; i <= 100; i++) {
			if(i%3 == 0 || i%5 == 0) {
				if( !(i%3 == 0 && i%5==0) ) {
					//i%3 != 0 || i%5 != 0
					System.out.println(i);
				}
			}
		}
		//AbCdEf....Yz 출력하기
		//A(65+0)		a(97)
		//C(65+2)		b(97+1)
		//E(65+4)		d(97+3)
		String result = "";
//		System.out.print((char)(65+0));
//		System.out.print((char)(97+1));
//		System.out.print((char)(65+2));
//		System.out.print((char)(97+3));
//		result = "" + 'A';		//"A"
//		result = "A" + 'b';		//"Ab"
//		result = "Ab" + 'C';	//"AbC"
		for (int i = 0; i < 26; i++) {
			result += (char)( (i%2 == 0 ? 65 : 97) +i);
		}
		System.out.println(result);
		
		//중첩반복문 사용하지 않고 구구단 전부 출력하기
		for (int i = 0; i < 81; i++) {
			
		}
		//10진수 숫자 입력받아서 2진수로 출력하기
		
		//ABCD efgh IJKL mnop QRST uvwx YZ 출력하기
		//A b CD ef GHI jkl MNOP qrstUVWXYz 출력하기
		
	}
}







