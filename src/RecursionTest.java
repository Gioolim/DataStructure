/*
파일명: RecursionTest.java
작성자: 임진영
작성일: 2018. 9. 11
주제:  간단한 재귀 알고리즘(recursive algorithm)을 연습
 */

package lab1_7;

import java.util.Scanner;

public class RecursionTest {
	public static void main(String[] args) {
		System.out.println("lab1_7: 임진영");

		Scanner input = new Scanner(System.in);
		System.out.print("양의 정수 입력: ");
		int n = input.nextInt();

		System.out.println("1부터 " + n + "까지의 합(반복) = " + iterativeSum(n));
		System.out.println("1부터 " + n + "까지의 합(재귀) = " + sum(n));

		System.out.println("1부터 " + n + "까지의 곱(반복) = " + iterativeFactorial(n));
		System.out.println("1부터 " + n + "까지의 곱(재귀) = " + factorial(n));

		System.out.print(n + "부터 1까지 출력 = ");
		f(n);
		System.out.println();

		System.out.print("1부터 " + n + "까지 출력 = ");
		g(n);
		System.out.println();
	}


	// 반복 알고리즘을 이용하여 1부터 n까지의 합을 구하는 메소드
	private static int iterativeSum(int n) {
		int result = 0;
		for(int i=1; i<n+1; i++)
			result += i;
		return result;
	}

	// 재귀 알고리즘을 이용하여 1부터 n까지의 합을 구하는 메소드 
	private static int sum(int n) {
		if(n <= 0)
			return 0;
		else
			return n + sum(n-1);
	} 

	// 반복 알고리즘을 이용하여 1부터 n까지의 곱을 구하는 메소드
	private static int iterativeFactorial(int n) { 
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	// 재귀 알고리즘을 이용하여 1부터 n까지의 곱을 구하는 메소드 
	private static int factorial(int n) {
		if(n <= 1)
			return 1;
		else
			return n * factorial(n-1);
	}

	// 재귀 알고리즘을 이용하여 n부터 1까지 출력하는 메소드
	private static void f(int n) {
		if(n > 0) {
			System.out.print(n + " "); 
			f(n-1);
		}
	}

	// 재귀 알고리즘을 이용하여 1부터 n까지 출력하는 메소드
	private static void g(int n) {
		if(n > 0) {
			g(n-1);
			System.out.print(n + " ");
		}
	}
	
}
