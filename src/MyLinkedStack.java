/*
파일명: MyLinkedStack.java
작성자: 진영
작성일: 2018. 10. 16
주제	: 스택을 연결 자료구조로 구현
 	  정수 자료를 저장하기 위해, 단순 연결리스트로 구현한 정수 스택 클래스(MyLinkedStack)를 정의하고 이용하는 프로그램
 */
package hw7_2;

import java.util.EmptyStackException;

public class MyLinkedStack {
	private class Node {
		int data;
		Node link;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	private Node top = null;
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(int a) {
		Node p = new Node(a);
		p.link = top;
		top = p;
	}
	
	public int pop() {
		if (top == null)
			throw new EmptyStackException();
		int d = top.data;
		top = top.link;
		return d;
	}
	
	public int peek() {
		if (top == null)
			throw new EmptyStackException();
		return top.data;
	}

}

/*private 클래스:
    스택 노드 구조
private 필드:
    꼭데기 노드를 가리킬 변수 top
public 메소드:
     isEmpty
     push
     pop   <---- EmptyStackException 발생
     peek  <---- EmptyStackException 발생*/
