/*
파일명: MyDoublyLinkedList.java
작성자: 임진영
작성일: 2018. 10. 11
주제	: 이중 연결리스트 구현
       내부적으로 이중 연결리스트를 사용하여 정수 리스트를 관리하는 MyDoublyLinkedList 클래스를 작성하고 사용하는 프로그램
 */
package hw6_2;

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
			t.llink = null;
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
	// size - 리스트의 길이를 리턴
	public int size() {
		int num=0;
		Node p = head;
		while (p != null) {
			p = p.rlink;
			num++;
		}
		return num;
	}

	// addLast - 정수값을 매개변수로 받아 리스트의 마지막에 삽입     
	public void addLast(int a) {
		Node pa = new Node(a);
		if (head==null) {
			head = pa;
		}
		else {
			Node p = head;
			while (p.rlink != null)
				p = p.rlink;
			p.rlink = pa;
			pa.llink = p;
			pa.rlink = null;			
		}
	}

	// removeFirst - 리스트의 가장 앞 원소(정수값)을 삭제하여 리턴  
	public int removeFirst() {
		int fd;
		fd = head.data;
		// 값이 하나일 경우
		if(head.rlink == null && head.llink == null) {
			head = null;
			return fd;
		}
		head = head.rlink;
		head.llink = null;
		return fd;
	}

	// removeLast - 리스트의 마지막 원소(정수값)을 삭제하여 리턴  
	public int removeLast() {
		Node r = head;
		int ld;
		// 값이 하나일 경우
		if(r.llink == null && r.rlink == null) {
			ld = head.data;
			head = null;
			return ld;
		}
		while (r.rlink != null)
			r = r.rlink;
		ld = r.data;
		r.llink.rlink = null;
		return ld;
	}

	// remove - 정수값을 매개변수로 받아 리스트에서 검색하여 있으면 삭제하고 true 리턴, 아니면 false 리턴
	// (정수값이 여러개면 맨 앞의 것을 삭제)
	public boolean remove(int d) {
		Node s = head;
		// 입력받은 정수가 리스트 안에 없을 경우
		while (s.rlink != null) {
			if (s.data == d)
				break;
			s = s.rlink;

			if (s.rlink == null && s.data != d)
				return false;
		}
		// 값이 하나일 경우
		if(s.llink == null && s.rlink == null) {
			head = null;
		}
		// 첫번째 원소일 경우
		else if (s.llink == null) {
			head = head.rlink;
			head.llink = null;
		}
		// 마지막 원소일 경우
		else if(s.rlink == null) {
			s.llink.rlink = null;
		}
		// 중간에 있을 경우
		else{
			s.llink.rlink = s.rlink; //???
			s.rlink.llink = s.llink; //.rlink;					
		}
		return true;
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
			System.out.println();
		}
	}
}

/*
181008 
- 맨뒤 삽입으로 시작하는 경우 ) 두 번 맨뒤 삽입하면 에러 -> link 두 개 써서 에러났던 것
- 삭제 ) 맨 뒤 원소 삭제하면 false 뜸
- 왕복출력 ) 원소가 4개 이상이면 에러 남 -> 역시 

클래스(private 클래스):
이중 연결리스트의 노드 구조를 표현하는 private 노드 클래스

필드(private 인스턴스 변수):
리스트의 첫번째 노드를 가리킬 변수(head) - null로 초기화 됨
 ** 이중연결리스트 연습을 위해 리스트의 원소 수를 나타내는 번수 등, 그 밖의 필드는 두지 말 것

메소드(public 메소드):
addFirst - 정수값을 매개변수로 받아 리스트의 맨 앞에 삽입
toString 오버라이드 - 리스트에 저장된 항목 전체를 문자열로 리턴
printList - 리스트를 왕복하며 순방향, 역방향으로 원소를 모두 출력
            (양방향 링크가 제대로 구성되었는가를 검사하는 메소드로서 이 메소드가 동작하지 않으면 점수 없음)
size - 리스트의 길이를 리턴
addLast - 정수값을 매개변수로 받아 리스트의 마지막에 삽입     
removeFirst - 리스트의 가장 앞 원소(정수값)을 삭제하여 리턴  
removeLast - 리스트의 마지막 원소(정수값)을 삭제하여 리턴
remove - 정수값을 매개변수로 받아 리스트에서 검색하여 있으면 삭제하고 true 리턴, 아니면 false 리턴
(정수값이 여러개면 맨 앞의 것을 삭제)

 ** 위의 메소드들에는 출력문 없음
 */
