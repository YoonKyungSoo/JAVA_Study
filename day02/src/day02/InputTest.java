package day02;

import java.util.Scanner;

public class InputTest {
public static void main(String[] args) {
//	입력이 준비과정, Scanner 타입의 변수 만들기
	Scanner sc =  new Scanner(System.in);
System.out.print("이름 : ");
	String name = sc.next();
	//이곳 밑으로는 사용자가 이미 입력을 해서 
	//name이라는 변수에 특정 값이 담겨있다고 가정하고 개발한다. 
	System.out.println(name + "님 어서오세요~");
	
	System.out.print("주소 : ");
	sc.nextLine();
//	next가 써져있으면 초기화를 한번 써야함
	String addr =sc.nextLine();
//	엔터키가 기본적으로 들어갔다고 생각하면 됨. 
	System.out.println("사는곳은 \"" + addr+"\" 이네요~");
	
	System.out.print("나이 :");
	int age =sc.nextInt();
	System.out.println("당신은 " + (age+5) + "살입니다.");
}
}
