/*
2018. 9. 4
재귀함수 공부
 */

public class Factorial {
	public static void main(String[] args) {
		int input = 7;
		System.out.println(fact(input));
	}
	
	public static int fact(int n) {
		if(n<=1)
			return n;
		else
			return fact(n-1)*n;
	}

}
