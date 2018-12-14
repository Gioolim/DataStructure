/*
파일명: MyArrayStack.java
작성자: 진영
작성일: 2018. 10. 29
주제	: 스택을 순차 자료구조로 구현
       정수 자료를 저장하기 위해, 순차 자료구조로 구현한 정수 스택 클래스(MyArrayStack)를 정의하고 이용하는 프로그램
 */
package hw7_1;

import java.util.EmptyStackException;

public class MyArrayStack {
	int[] arr;
	int top = -1;

	public MyArrayStack() {
		this.arr = new int[5];
	}
	
	public MyArrayStack(int size) {
		this.arr = new int[size];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == arr.length;
	}
	
	public void push(int n) {
		arr[++top] = n;
	}

	public int pop() {
		if (top == -1)
			throw new EmptyStackException();
		int d = arr[top];
		top--;
		return d;
	}
	
	public int peek() {
		if (top == -1)
			throw new EmptyStackException();
		return arr[top];
	}

}

/*
 - MyArrayStack 클래스 - 강의 자료 참고할 것
  필드:
       정수 배열을 가리킬 변수, top 등
  메소드:
        생성자1 - 배열 크기를 5로 초기화 하는 생성자
        생성자2 - 배열 크기를 매개변수로 받는 생성자
        isEmpty
        isFull
        push
        pop
        peek
 */
