/*
파일명: MyLinkedStackTest.java
작성자: 진영
작성일: 2018. 10. 16
주제	: 스택을 연결 자료구조로 구현
 	  정수 자료를 저장하기 위해, 단순 연결리스트로 구현한 정수 스택 클래스(MyLinkedStack)를 정의하고 이용하는 프로그램
 */
package hw7_2;

import java.util.Scanner;

public class MyLinkedStackTest {

	public static void main(String[] args) {
		System.out.println("hw7_2: 진영");
		Scanner input = new Scanner(System.in);

		MyLinkedStack stack = new MyLinkedStack();

		int menu = 0;
		int element = 0;		
		int sum;

		do {
			System.out.print(" 1:삽입 2:삭제 3:조회 4:합계 5:종료 ---> ");
			menu = input.nextInt();
			switch(menu) {
			case 1:
				System.out.println("스택에 입력받은 값을 삽입합니다.");
				System.out.print("정수값 입력: ");
				element = input.nextInt();  
				stack.push(element);
				break;
			case 2:
				System.out.println("값을 삭제하고 출력합니다.");
				element = stack.pop();
				System.out.println(element);
				break;
			case 3:
				System.out.println("스택 맨 위의 값을 조회합니다.");
				element = stack.peek();
				System.out.println(element);
				break;
			case 4:
				System.out.println("값을 모두 삭제하고 합계를 출력합니다.");
				sum = 0;
				while (stack.isEmpty() != true) {
					sum += stack.pop();
				}
				System.out.println(sum);
				break;
			case 5:
				System.out.println("종료합니다.");   
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 5);
	}

}

/*
(1) MyLinkedStack 객체 생성(stack이라고 부르자.) 

(2) 메뉴 5를 선택할 때까지 다음과 같은 메뉴를 반복하여 제공

1:삽입 2:삭제 3:조회 4:합계 5:종료

1 선택시 사용자로부터 정수값을 하나 입력받아 스택에 삽입(push)
2 선택시 스택에서 삭제(pop)하여 리턴된 값을 출력
3 선택시 스택에서 조회(peek)하여 리턴된 값을 출력
4 선택시 스택이 텅 빌때(isEmpty)까지 모두 삭제(pop)하여 합을 출력

- 스택이 비어있을 때 합계를 구하면 0이 출력되어야 함 
*/
