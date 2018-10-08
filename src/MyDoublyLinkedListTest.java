/*
파일명: MyDoublyLinkedListTest.java
작성자: 진영
작성일: 2018. 10. 04
주제	: 이중 연결리스트 구현을 준비
      내부적으로 이중 연결리스트를 사용하여 정수 리스트를 관리하는 MyDoublyLinkedList 클래스를 작성하고 사용하는 프로그램
 */
package lab6_2;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_2: 임진영\n");

		MyDoublyLinkedList list = new MyDoublyLinkedList();
		System.out.println(list.toString());
		list.addFirst(2);
		list.addFirst(-3);
		list.addFirst(0);
		System.out.println(list.toString() + "\n");
		list.printList();
	}

}

/*
(1) MyDoublyLinkedList 객체를 생성(list라고 하자)
(2) list를 출력(toString 호출)
(3) list에 2를 맨앞삽입
(4) list에 -3을 맨앞삽입
(5) list에 0을 맨앞삽입
(6) list를 출력(toString 호출)
(7) list를 왕복하며 출력(printList 호출)
 */
