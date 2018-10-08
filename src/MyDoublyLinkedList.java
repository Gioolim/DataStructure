/*
파일명: MyDoublyLinkedList.java
작성자: 진영
작성일: 2018. 10. 04
주제	: 이중 연결리스트 구현을 준비
      내부적으로 이중 연결리스트를 사용하여 정수 리스트를 관리하는 MyDoublyLinkedList 클래스를 작성하고 사용하는 프로그램
 */
package lab6_2;

public class MyDoublyLinkedList {
	// 이중 연결리스트의 노드를 표현하는 private 노드 클래스(data, rlink, llink 필드)
	private class Node {
		int data;
		Node rlink;
		Node llink;
		Node(int data) {
			this.data = data;
		}
	}

	private Node head;

	// addFirst - 정수값을 매개변수로 받아 리스트의 맨 앞에 삽입
	public void addFirst(int a) {
		Node t = new Node(a);
		if (head==null) {
			head = t;
		}
		else {
			t.rlink = head;
			head.llink = t;
			head = t;
		}
	}

	// toString 오버라이드 - 리스트에 저장된 항목 전체를 문자열로 리턴
	@Override
	public String toString() {
		String str = new String();
		Node i;
		i = head;
		while (i != null) {
			str += i.data + " ";
			i = i.rlink;
		}
		return "list = " + str;
	}

	// printList - 리스트를 왕복하며 순방향, 역방향으로 원소를 모두 출력
	// 양방향 링크가 제대로 구성되었는지를 확인하기 위해 리스트를 왕복하며 출력하는 메소드
	public void printList() {
		if(head == null) {
			System.out.println("( )( )");
		}
		else {
			Node temp = head;
			System.out.print("( " + temp.data + " ");
			while (temp.rlink != null) {
				System.out.print(temp.rlink.data + " ");
				temp = temp.rlink;
			}
			System.out.print(") ( ");
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.llink;
			}
			System.out.print(")");

		}
	}
}

/*
클래스: 
이중 연결리스트의 노드를 표현하는 private 노드 클래스(data, rlink, llink 필드)

필드(private 인스턴스 변수):
리스트의 첫번째 노드를 가리킬 변수(head) - null로 초기화 됨
 ** 이중 연결리스트 연습을 위해 리스트의 원소 수를 나타내는 변수 등, 다른 필드는 두지 말 것

메소드(public 메소드):
addFirst - 정수값을 매개변수로 받아 리스트의 맨 앞에 삽입
toString 오버라이드 - 리스트에 저장된 항목 전체를 문자열로 리턴
printList - 리스트를 왕복하며 순방향, 역방향으로 원소를 모두 출력 *** 아래 첨부한 코드 참고
            (양방향 링크가 제대로 구성되었는가를 검사하는 메소드로서 이 메소드가 동작하지 않으면 점수 없음)
 */


/* 혼자 짠 코드
	public String printList() {
	String str1 = new String();
	String str2 = new String();
	Node p = head;
	str1 += "( " + p.data + " ";
	str2 += "( ";

	while (p.rlink != null) {
		str1 += p.rlink.data + " ";
		p = p.rlink;
	}
	while (p != null) {
		str2 += p.data + " ";
		p = p.llink;
	}

	str1 += ")";
	str2 += ")";

	return str1 + str2;
 */
