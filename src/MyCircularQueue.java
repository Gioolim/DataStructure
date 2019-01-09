/*
 * 파일명 : MyCircularQueue.java
 * 작성일: 2018년 11월 1일
 * 작성자: 진영
 * 내용:  배열을 이용한 원형 큐 구현을 연습
 */
package hw8_1;

import java.util.NoSuchElementException;

public class MyCircularQueue {
	private int[] array;
	private int arraySize;
	private int count;
	private int front;
	private int rear;

	public MyCircularQueue(int size) {
		array = new int[size];
		arraySize = size;
		count = 0;
		front = 0;
		rear = 0;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public boolean isFull() {
		return count == arraySize;
	}

	public void enQueue(int n) {
		if(isFull())
			System.out.println("Inserting fail! Circular Queue is full!");
		else {
			rear = (rear+1)%arraySize;
			array[rear] = n;
			count++;
		}
	}

	public int deQueue() {
		if(isEmpty())
			throw new NoSuchElementException();
		else {
			front = (front + 1)%arraySize;
			count--;
			return array[front]; // front는 무엇을 출력하나? => 삽일할 때 rear을 증가시키기 때문에 front 역시 1 증가해야 한다.
		}
	}

	public int peek() {
		if(isEmpty())
			throw new NoSuchElementException();
		return array[(front+1)%arraySize];
	}

	public int size() {
		return count;
	}
}

/*
인스턴스 변수:
  int형 배열을 가리킬 변수
  큐의 용량(배열 크기)
  큐에 저장된 원소 수
  front
  rear

메소드:
  생성자 - 배열 크기를 매개변수로 받고, 인스턴스 변수 초기화
  isEmpty
  isFull
  enQueue - 배열이 가득차서 저장할 수 없을 때는 에러 메시지를 출력함. 예외 발생할 필요 없음
  deQueue - 배열이 비어서 삭제할 수 없을 때는 예외 발생(java.util 패키지의 NoSuchElementException 예외를 발생시킬 것)
  peek - 배열이 비어서 조회할 수 없을 때는 예외 발생(java.util 패키지의 NoSuchElementException 예외를 발생시킬 것)
  size - 큐에 저장된 원소 수를 리턴
 ** 이 외의 public 메소드는 두지 말 것
 */
