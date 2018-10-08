/*
파일명: MyArrayList.java
작성자: 진영
작성일: 2018. 9. 18
주제	: 순차자료구조 연산 구현을 연습
       정수 리스트를 관리하는 MyArrayList 클래스를 작성하고 사용하는 프로그램
 */
package hw5_1;

public class MyArrayList {
	private int[] array; // 정수 배열 참조 변수
	private int num; // 정수형 변수 (배열에 저장된 항목수)

	public MyArrayList() {
		array = new int[10];
		num=0;
	} // 매개변수가 없는 constructor - 정수 배열 필드를 크기가 10인 배열로 초기화하고, 항목수 필드는 0으로 초기화

	public boolean add(int e) {
		if (num >=array.length) {
			int[] array2 = new int[array.length*2];
			System.arraycopy(array, 0, array2, 0, array.length);
			array = array2;
		}
		array[num] = e;
		num++;
		return true;
	}
	/*
	원소 삽입 메소드(add) - 정수값을 매개변수로 받아 배열에 삽입
	삽입 순서대로 배열의 앞부분부터 채움 
	삽입에 성공하면 true 리턴
	  옵션 2, 내부 정수 배열이 가득찬 경우 false 리턴하는 대신, 정수 배열을 2배로 확장하도록 해 볼 것
	 */

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		for (int i=0; i<num; i++) {
			str.append(array[i] + " ");
		}
		return "list = " + str;
	}
	// 옵션 4, toString 오버라이드 - 배열에 저장된 항목 전체를 문자열로 리턴 -----> StringBuffer로 

	public int get(int i) {
		return array[i];
	}
	// get - 인덱스를 매개변수로 받아 배열의 해당 정수값을 리턴   O(1)

	public int size() {
		return num;
	}
	// size  - 리스트의 길이를 리턴(배열 크기가 아님)   O(1)

	public void add(int i, int e) {
		/* if (i < num) {
			array[i] = e;
			return true;
		} : 예외처리 조건 */
		int n = num;
		for (;n>i;n--) {
			array[n] = array[n-1];
			if (i > n)
				break;
		}
		array[i] = e;
		num++;
	}
	// add - 인덱스와 정수값을 매개변수로 받아 배열의 해당 위치에 정수값을 삽입   O(n) : void 

	public int remove(int i) {
		if (i >= num) {
			throw new IndexOutOfBoundsException();
		} // 옵션 1, 내부 메소드에 있어야 함
		int d = array[i];
		num--;
		for(;i<num;i++)
			array[i] = array[i+1];
		return d;
	}
	// remove - 인덱스를 매개변수로 받아 배열의 해당 위치 정수값을 삭제하고 그 값을 리턴  O(n)
}
