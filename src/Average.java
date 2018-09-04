/*
파일명: Average.java
작성자: 임진영
작성일: 2018. 9. 4
주제: 메소드 작성과 호출을 연습
      사용자가 원하는 갯수의 정수값을 입력받아 이 정수값들의 평균을 구하는 프로그램
 */
import java.util.Scanner;

public class Average {

	public static double getAverage(int[] array) {
		int all = 0;
		for(int i=0; i<array.length; i++)
			all+=array[i];
		return ((double)all/(array.length));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("lab1_4: 임진영");

		System.out.print("\n정수 개수 입력: ");
		int n = scan.nextInt();
		int[] array = new int[n];
		System.out.print(n+"개의 정수 입력: ");
		for(int i=0; i<array.length; i++)
			array[i] = scan.nextInt();
		System.out.println("평균 = "+getAverage(array));
	}

}

/*
- 정수 배열 원소의 평균을 구하는 메소드(예를 들어 getAverage)를 작성한다.
 * 매개변수 : 정수 배열
 * 리턴값 : 정수 배열 전체 원소의 평균값
   정수 배열이 null이거나 배열 크기가 0인 경우는 고려하지 않아도 됨
   main 메소드와 동일한 클래스에 static 메소드로 작성하면 됨

- main 메소드는 다음과 같은 기능을 수행하도록 작성한다.
(1) 사용자로부터 정수 개수(n이라고 하자)를 입력받는다.
(2) 사용자로부터 n개의 정수값을 입력받아 크기가 n인 배열에 저장한다.
(3) getAverage 메소드를 호출하여 평균값을 알아낸다.
(4) 평균값을 출력한다.

- 키보드로 입력한 정수값들은 white space(newline, blank, tab)으로 구분됨

- 이 과목은 자료구조의 내부 구현과 원리를 익히는 과목입니다.
따라서 앞으로 특별히 '..를 사용하시오'라고 언급하지 않으면
자바 API에서 제공하는 고급 자료구조(ArrayList 등), 메소드들(sort 등)은 이용하지 말것
 */