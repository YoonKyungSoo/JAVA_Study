package day02;

public class CastingTest {
public static void main(String[] args) {
	//정수와 정수의 연산 결과는 정수로 나옴
	System.out.println(10/3);
	//정수와 실수의 연산 결과는 정수로 나옴
	System.out.println(10/3.0);
	System.out.println("==================");
	System.out.println(10/(3+0.0));
	System.out.println(10/(3*1.0));
	System.out.println("==================");
//	아스키 코드 : 문자마다 대응되는 정수값
//	'A' : 65 /  'a' : 97  / '0' : 48 외우기!
	
	System.out.println('A' + 5);
	System.out.println((char)('A' + 5));
}
}
