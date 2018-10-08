/*
파일명: MatrixTest.java
작성자: 진영
작성일: 2018. 9. 25
주제	: 순차 자료구조 사용을 연습
      2차원 정수 배열로 표현된 행렬의 곱을 구하여 출력하는 프로그램
 */
package hw5_2;

public class MatrixTest {

	public static void main(String[] args) {
		System.out.println("hw5_2: 임진영\n");

		// 행렬 x, y의 곱을 구하여 출력
		int[][] x = {
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4}
		};

		int[][] y = {
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2}
		};

		int[][] z = MatrixTestService.multiply(x,  y);     
		MatrixTestService.print(z);
		System.out.println();

		// 행렬 a, b의 곱을 구하여 출력
		int[][] a = {
				{1, 1, 1},
				{2, 2, 2},
				{1, 2, 3},
				{4, 5, 6}
		};

		int[][] b = {
				{1, 1, 1, 1, -3},
				{1, 2, 3, 4, 5},
				{-2, 0, 6, 9, 12}
		};

		int[][] c = MatrixTestService.multiply(a,  b);     
		MatrixTestService.print(c);
	}

}
