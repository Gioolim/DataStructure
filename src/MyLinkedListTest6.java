/*
파일명: MyLinkedListTest6.java
작성자: 임진영
작성일: 2018. 10. 04
주제	: 단순 연결리스트 연산 구현
      내부적으로 단순 연결리스트를 사용하여 정수 리스트를 관리하는 MyLinkedList 클래스를 작성하고 사용하는 프로그램
 */
package hw6_1;

import java.util.Scanner;

public class MyLinkedListTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw6_1: 임진영\n");
		Scanner input = new Scanner(System.in);
		MyLinkedList list = new MyLinkedList(); // (1) MyArrayList 객체를 생성(list라고 하자)

		// (2) 사용자에게 다음과 같은 메뉴를 반복하여 제공하되 7 입력시 반복 종료
		int menu = 0;
		int index = 0;
		int element = 0;
		do {
			System.out.print(" 1:전체조회 2:길이조회 3:맨앞삽입 4:맨뒤삽입 5:맨앞삭제 6:맨뒤삭제 7:종료 ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("리스트 전체를 조회합니다.");
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println("리스트 길이를 조회합니다.");
				int size = list.size();
				System.out.println(size);
				break;
			case 3:
				System.out.println("원소를 리스트의 맨 앞에 삽입합니다.");
				System.out.print("정수값 입력: ");
				element = input.nextInt();    
				list.addFirst(element); 
				break;
			case 4:
				System.out.println("원소를 리스트의 맨 뒤에 삽입합니다.");
				System.out.print("정수값 입력: ");
				element = input.nextInt();    
				list.addLast(element); 
				break;
			case 5:
				System.out.println("리스트의 맨 앞에 원소를 삭제합니다.");
				System.out.println(list.removeFirst()); 
				break;
			case 6:
				System.out.println("리스트의 맨 뒤에 원소를 삭제합니다.");
				System.out.println(list.removeLast()); 
				break;
			case 7:
				System.out.println("종료합니다.");   
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 7);
	}
}

/*
(1) MyLinkedList 객체를 생성(list라고 하자)
(2) 사용자에게 다음과 같은 메뉴를 반복하여 제공하되 7 입력시 반복 종료
   1:전체조회 2:길이조회 3:맨앞삽입 4:맨뒤삽입 5:맨앞삭제 6:맨뒤삭제 7:종료

1 선택시, list의 전체 내용을 출력(toString 호출)
2 선택시, list의 길이를 출력(size 호출)
3 선택시, 사용자로부터 정수값을 입력받아 list 맨 앞에 삽입
4 선택시, 사용자로부터 정수값을 입력받아 list 맨 뒤에 삽입
5 선택시, list 맨 앞에서 정수값을 삭제하고 그 정수를 출력
6 선택시, list 맨 뒤에서 정수값을 삭제하고 그 정수를 출력
 */
