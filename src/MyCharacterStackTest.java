/*
파일명: MyCharacterStack.java
작성자: 진영
작성일: 2018. 10. 29
주제	: 괄호 검사 - 스택 활용을 이해
*/
package hw7_3;

import java.util.EmptyStackException;

public class MyCharacterStack {
	private class Node {
		char data;
		Node link;
		
		public Node(char data) {
			this.data = data;
		}
	}
	
	private Node top = null;
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(char a) {
		Node p = new Node(a);
		p.link = top;
		top = p;
	}
	
	public char pop() {
		if (top == null)
			throw new EmptyStackException();
		char d = top.data;
		top = top.link;
		return d;
	}
	
	public char peek() {
		if (top == null)
			throw new EmptyStackException();
		return top.data;
	}

}
