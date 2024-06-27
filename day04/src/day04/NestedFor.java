package day04;

import java.util.Scanner;

public class NestedFor {
	public static void main(String[] args) {
		int[][] arData = {
				{10,20,30},
				{40,50,60}
		};
		
//		System.out.println(arData[0][0]);
//		System.out.println(arData[0][1]);
//		System.out.println(arData[0][2]);
//		
//		System.out.println(arData[1][0]);
//		System.out.println(arData[1][1]);
//		System.out.println(arData[1][2]);
		
//		for (int i = 0; i < 6; i++) {
//			System.out.println(arData[i/3][i%3]);
//		}
		
//		for (int j = 0; j < 3; j++) {
//			System.out.println(arData[0][j]);
//		}
//		for (int j = 0; j < 3; j++) {
//			System.out.println(arData[1][j]);
//		}
		
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.println(arData[i][j]);
//			}
//		}
//		System.out.println("------2단------");
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("%d × %d = %d\n",2,i,2*i);
//		}
		
//		for (int i = 2; i <= 9; i++) {
//			System.out.println("------"+i+"단------");
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d × %d = %d\n",i,j,i*j);
//			}
//		}
		
		int[][] arData2 = new int[3][];
		arData2[0] = new int[5];
		arData2[1] = new int[3];
		arData2[2] = new int[2];
		
//		for (int j = 0; j < arData2[0].length; j++) {
//			System.out.println(arData2[0][j]);
//		}
//		for (int j = 0; j < arData2[1].length; j++) {
//			System.out.println(arData2[1][j]);
//		}
//		for (int j = 0; j < arData2[2].length; j++) {
//			System.out.println(arData2[2][j]);
//		}
		
//		for (int i = 0; i < arData2.length; i++) {
//			for (int j = 0; j < arData2[i].length; j++) {
//				System.out.println(arData2[i][j]);
//			}
//		}
		/*
			*****	*		*****	----*		*********
			*****	**		****	---***		 *******
			*****	***		***		--*****		  *****
			*****	****	**		-*******	   ***
			*****	*****	*		*********	    *
			
			국어점수 그거 여러 학생용으로 만들기
			학생수 입력 -> 과목수, 과목명 입력받기 -> 첫번째 학생 ~ n번째 학생까지의 점수 입력받기
			한 사람당 총점, 평균 / 전체 평균
			각 과목별 평균
		*/
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for (int i = 0; i < 1; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 2; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		....
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for (int j = 0; j < 5; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for (int j = 0; j < 4; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for (int j = 0; j < 3; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//i		공백		*		
		//0		4		1
		//1		3		3
		//2		2		5
		//3		1		7
		//4		0		9
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < -i+4; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("================================");
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int stuCnt = sc.nextInt();
		System.out.print("과목 수 : ");
		int subCnt = sc.nextInt();
		//arSubject : 과목 명들이 담길 문자열 배열(과목 수 크기로 생성)
		String[] arSubject = new String[subCnt];
		//arScore : 각 학생들의 점수들이 담길 int타입의 2차원 배열
		//행 수 : 학생 수 / 열 수 : 과목 수
		//각 행이 의미하는 것은 한 학생 / 각 열이 의미하는 것은 한 과목
		int[][] arScore = new int[stuCnt][subCnt];
		
		//과목 수 만큼 반복 돌며 과목 명 입력받기
		for (int i = 0; i < subCnt; i++) {
			System.out.print(i+1+"번째 과목명 : ");
			arSubject[i] = sc.next();
		}
		
		//학생별 총점을 담기 위한 배열
		int[] arSum1 = new int[stuCnt];
		//과목별 총점을 담기 위한 배열
		int[] arSum2 = new int[subCnt];
		
		//학생 수 만큼 반복을 돌며
		for (int i = 0; i < stuCnt; i++) {
			//과목 수만큼 반복을 돌며
			for (int j = 0; j < subCnt; j++) {
				//입력을 받으면 모든 학생의 모든 과목 점수를 입력받게 된다.
				//i : 0, 1, .. ~ 학생수	- 일종의 학생 번호 
				//j : 0, 1, .. ~ 과목수	- 일종의 과목 번호
				System.out.print(i+1+"번째 학생의 "+arSubject[j]+"점수 : ");
				arScore[i][j] = sc.nextInt();
				
				//i 0 / j 0
				//"1번째 학생의 국어 점수 : "
				//arScore[0][0] = 입력
				
				//i 0 / j 1
				//"1번째 학생의 영어 점수 : "
				//arScore[0][1] = 입력
				
				//arSum1[0] : 1번째 학생의 총점을 담을 방
				//arSum1[1] : 2번째 학생의 총점을 담을 방
				//...
				//arSum1[i] : i번째 학생의 총점을 담을 방
				
				//arSum2[0] : 국어점수 총점을 담을 방
				//arSum2[1] : 영어점수 총점을 담을 방
				//...
				//arSum2[j] : 각 과목의 총점을 담을 방
				
				//arSum1 학생별 총점을 구할것이기 때문에 지금 입력받은 점수를 학생의 번호인 i번 방에 누적
				arSum1[i] += arScore[i][j];
				//arSum2 과목별 총점을 구할것이기 때문에 지금 입력받은 점수를 과목의 번호인 j번 방에 누적
				arSum2[j] += arScore[i][j];
			}
			
		}
		
		//학생의 총점과 평균을 출력할 것이기 때문에 stuCnt만큼 반복
		for (int i = 0; i < stuCnt; i++) {
			System.out.println(i+1+"번째 학생의 총점 : "+arSum1[i]);
			//학생 평균은 학생총점 / 과목수 
			System.out.println(i+1+"번째 학생의 평균 : "+arSum1[i]/(double)subCnt);
		}
		//과목의 평균 점수를 출력할 것이기 때문에 subCnt만큼 반복
		for (int i = 0; i < subCnt; i++) {
			//			arSubject[i] : 과목명				  각 과목의 총점 / 학생수
			System.out.println(arSubject[i]+" 과목의 평균 : "+arSum2[i]/(double)stuCnt);
		}
	}
}













