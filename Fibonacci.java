/*
2018. 9. 4
재귀함수 공부
 */

public class Fibonacci {
	public static void main(String[] args) {
		int input = 7; // 7개 출력
		for (int i = 1; i <= input; i++) {
			System.out.println(fibo(i));
		}
	}

	public static int fibo(int n) {
		if (n <= 1)
			return n;
		else 
			return fibo(n-2) + fibo(n-1);
	}
}
