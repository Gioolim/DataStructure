/*
 * 파일명: Array.java
 * 작성일: 2018.8.28
 * 작성자: 임진영
 * 내용:  간단한 자료구조를 연습
 */

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("lab1_2: 임진영");

		int[] array = new int[10]; // 크기가 10인 배열 생성
		int i, f, index;
		System.out.print("정수값 10개 입력: ");
		for(i=0; i<array.length; i++) {
			array[i] = scan.nextInt();
		} // 사용자로부터 10개의 정수값을 입력받아 배열에 저장

		System.out.print("검색할 정수값 입력: ");
		f = scan.nextInt(); // 

		for(index=0; index<array.length; index++) {
			if(array[index] == f)
					break;
		}
		// 정수값 하나를 입력받아 그 정수값이 배열의 어느 위치에 저장되어 있는지 배열 원소를 하나씩 차례대로 검색
		
		if(index==10 && array[index-1] != f)
			index = -1;
		// 만일 찾는 정수값이 배열에 없으면 -1을 출력

		System.out.println("인덱스 = " + index);
		// 인덱스를 출력
	}

}