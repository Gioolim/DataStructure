/*
파일명: MatrixTestService.java
작성자: 진영
작성일: 2018. 9. 26
주제	: 순차 자료구조 사용을 연습
      2차원 정수 배열로 표현된 행렬의 곱을 구하여 출력하는 프로그램
 */
package hw5_2;

public class MatrixTestService {
	// (1) 정적 메소드 multiply를 작성하시오.
	// 이차원 정수 배열로 표현된 두개의 행렬을 매개변수로 받아 곱을 구해 결과를 이차원 정수 배열로 표현하여 리턴
	// 매개변수로 받은 두 행렬은 곱을 구하기에 타당한 크기라고 가정해도 됨

	public static int[][] multiply(int[][] A, int[][] B) {
		int[][] answer = new int[A.length][B[0].length];
		for(int i=0;i<answer.length;i++){
			for(int j=0;j<answer[0].length;j++){
				for(int k=0;k<A[0].length;k++){
					answer[i][j]+=A[i][k]*B[k][j];
				}	
			}
		}
		return answer;
	}


	// (2) 정적 메소드 print를 작성하시오.
	// 이차원 정수 배열로 표현된 하나의 행렬을 매개변수로 받아 한 줄에 한 행씩 출력
	public static void print(int[][] C) {
		for(int m=0; m<C.length; m++) {
			for(int n=0; n<C[0].length; n++) {
				System.out.print(C[m][n] + " ");
			}
			System.out.println();
		}
	}
}
