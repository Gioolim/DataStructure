/*
파일명: MyCharacterStack.java
작성자: 진영
작성일: 2018. 10. 29
주제	: 괄호 검사 - 스택 활용을 이해
 */
package hw7_3;

import java.util.EmptyStackException;
import java.util.Scanner;

public class MyCharacterStackTest {

	public static void main(String[] args) {
		System.out.println("hw7_3: 임진영\n");
		Scanner input = new Scanner(System.in);

		System.out.print("수식을 입력하세요 : ");
		String test = input.nextLine();
		if (bktest(test) == true)
			System.out.println("올바른 괄호 수식입니다.");
		else
			System.out.println("잘못된 괄호 수식입니다.");
	}

	public static boolean bktest(String test) { // String은 배열 형태로 저장된다. => charAt() 사용 가능
		MyCharacterStack stack = new MyCharacterStack();
		char open_pair;

		try {
			for(int i=0; i<test.length(); i++) {
				if (test.charAt(i) == '(' || test.charAt(i) == '<') { // character는 작은 따옴표 , == 기호 사용 가능
					stack.push(test.charAt(i));
					//System.out.println("push된 값 "+stack.peek());
				}
				else if (test.charAt(i) == ')' || test.charAt(i) == '>') {
					open_pair = stack.pop();
					//System.out.println("open pair "+open_pair);
					if ((test.charAt(i) == ')' && open_pair != '(') || (test.charAt(i) == '>' && open_pair != '<'))
						return false;
				}
			}
			if (stack.isEmpty() == true)
				return true;
			else
				return false;
		} catch(EmptyStackException e) {
			return false;
		}
	}
}

/*
스택 클래스에 괄호 검사 메소드를 두지 마세요.

스택 클래스(MyCharacterStack)는 일반적인 문자 스택으로 사용하도록 기본 연산(isEmpty, push, pop, peek 등)만 제공하고,  메인 클래스 main 메소드에서 이 스택을 활용하여 괄호 검사를 해야 합니다.

----------------------------------------------------------
스택을 이용하여 수식의 괄호를 검사하는 프로그램을 작성하시오.

  괄호의 종류는 두가지만 허용 : (), <>
  나머지 문자는 모두 무시하면 됨

- MyCharacterStack 클래스 작성 

   연결리스트를 이용하여 구현한 문자 스택 클래스

- 메인 클래스의 main 메소드는 다음을 수행

(1) 한 줄의 수식을 입력받는다.
(2) 스택(MyCharacterStack)을 이용하여 수식의 괄호가 올바르게 사용되었는가를 검사하여 결과를 알려준다.
    (잘못된 괄호 수식이더라도 오류 발생하고 끝내면 안됨)
 */
