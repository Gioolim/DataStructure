/*
파일명: MyLinkedList.java
작성자: 진영
작성일: 2018. 10. 04
주제	: 단순 연결리스트 연산 구현
      내부적으로 단순 연결리스트를 사용하여 정수 리스트를 관리하는 MyLinkedList 클래스를 작성하고 사용하는 프로그램
 */
package hw6_1;

public class MyLinkedList6 {
	// 단순 연결리스트의 노드를 표현하는 노드 클래스
	private class Node {
		int data;
		Node link;
		Node(int data) {
			this.data = data;
		}
	}

	// 리스트의 첫번째 노드를 가리킬 변수(head) - null로 초기화 됨
	// head는 삽입, 삭제할 때만 변경
	private Node head = null;

	// 맨앞 삽입 메소드(addFirst) - 정수값을 매개변수로 받아 리스트의 맨 앞에 삽입
	public void addFirst(int n) {
		Node t = new Node(n);
		t.link = head;
		head = t;
	}

	// toString 오버라이드 - 리스트에 저장된 항목 전체를 문자열로 리턴
	@Override
	public String toString() {
		String str = new String();
		Node a;
		a = head;
		while (a!=null) {
			str += a.data + " ";
			a = a.link;
		}
		return "list = " + str;
	}

	// size - 리스트의 길이를 리턴
	public int size() {
		int num=0;
		Node p = head;
		while (p != null) {
			p = p.link;
			num++;
		}
		return num;
	}

	// addLast - 정수값을 매개변수로 받아 리스트의 마지막에 삽입     
	public void addLast(int n) {
		Node p = head;
		while (p.link.link != null)
			p = p.link;
		Node pa = new Node(n);
		p.link.link =pa;
		pa.link = null;

	}

	// removeFirst - 리스트의 가장 앞 원소(정수값)을 삭제하여 리턴  
	public int removeFirst() {
		int fd = head.data;
		head = head.link;
		return fd;
	}

	// removeLast - 리스트의 가장 뒤 원소(정수값)을 삭제하여 리턴  
	public int removeLast() {
		Node r = head;
		while (r.link.link != null)
			r = r.link;
		int ld = r.link.data;
		r.link = null;
		return ld;
	}
}
/*
  클래스:
        단순 연결리스트의 노드를 표현하는 노드 클래스

  필드(private 인스턴스 변수):
        리스트의 첫번째 노드를 가리킬 변수(head) - null로 초기화 됨
 ** 연결리스트 연습을 위해 리스트의 원소 수를 나타내는 변수는 두지 말 것

  메소드(public 메소드):
        맨앞 삽입 메소드(addFirst) - 정수값을 매개변수로 받아 리스트의 맨 앞에 삽입
     toString 오버라이드 - 리스트에 저장된 항목 전체를 문자열로 리턴
     size - 리스트의 길이를 리턴
     addLast - 정수값을 매개변수로 받아 리스트의 마지막에 삽입     
     removeFirst - 리스트의 가장 앞 원소(정수값)을 삭제하여 리턴  
     removeLast - 리스트의 가장 앞 원소(정수값)을 삭제하여 리턴  
 ** 위의 메소드들에는 출력문 없음
 */
