/*
파일명: MyLinkedListTest.java
작성자: 진영
작성일: 2018. 9. 27
주제	: 단순 연결리스트 구현을 준비
      내부적으로 단순 연결리스트를 사용하여 정수 리스트를 관리하는 MyLinkedList 클래스를 작성하고 사용하는 프로그램
 */

package lab6_1;

public class MyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_1: 임진영\n");
		
		MyLinkedList list = new MyLinkedList();
		System.out.println(list.toString());
		list.addFirst(2);
		list.addFirst(-3);
		list.addFirst(0);
		System.out.println(list.toString());
	}

}

/*
(1) MyLinkedList 객체를 생성(list라고 하자)
(2) list를 출력
(3) list에 2를 맨앞삽입
(4) list에 -3을 맨앞삽입
(5) list에 0을 맨앞삽입
(6) list를 출력
*/
