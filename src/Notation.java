/*
파일명: Notation.java
작성자: 진영
작성일: 2018. 10. 29
주제	: 스택을 이용하여 후위표기 수식의 결과를 계산하는 프로그램
 */
package hw7_4;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Notation {

	public static void main(String[] args) {
		System.out.println("hw7_4: 임진영\n");

		Scanner input = new Scanner(System.in);
		Stack<Double> stack = new Stack<Double>();

		String str[] = new String[100];
		System.out.print("후위표기수식 입력: ");
		String str2[] = input.nextLine().split(" "); // str2배열에 값을 넣어 그 값을 str로 옮김
		for(int i=0;i<str2.length;i++){
			str[i]=str2[i];
		}

		double num1, num2;
		double d;

		try {
			for(int i=0;i<str2.length;i++) 	{
				if(str[i].equals("+") || str[i].equals("-") || str[i].equals("*") || str[i].equals("/")) {
					num2 = stack.pop();		
					num1 = stack.pop();

					switch(str[i]){
					case "+":
						stack.push(num1+num2);
						break;
					case "-" :
						stack.push(num1-num2);
						break;
					case "*" :
						stack.push(num1*num2);
						break;
					case "/" :
						stack.push(num1/num2);
						break;
					}
				}
				
				else {
					d = Double.parseDouble(str[i]);
					stack.push(d);
				}
				
			}

			double result = stack.pop();
			if(stack.isEmpty() == false)
				System.out.println("잘못된 수식입니다.");
			else
				System.out.println("결과 = " + result);

		} catch(EmptyStackException e) {
			System.out.println("잘못된 수식입니다.");
		}
	}
}

/*
- 스택 클래스는 java.util.Stack 을 이용하되, 타입 매개변수를 Double로 하여 스택을 생성할 것

- 메인 클래스의 main 메소드는 다음을 수행

(1) 한 줄의 후위표기 수식을 입력받는다.
    모든 토큰(연산자, 피연산자)은 공백으로 분리된다고 가정할 것
    피연산자는 실수형이며, 연산자는 이진 연산자 +, -, *, / 만 고려할 것

(2) 스택을 이용하여 후위표기 수식의 결과를 구하여 출력한다.
    수식 계산에서 오류 발생시 잘못된 수식임을 알릴 것
 */
