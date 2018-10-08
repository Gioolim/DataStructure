/*
파일명: MyArrayListTest.java
작성자: 진영
작성일: 2018. 9. 17
주제	: 순차자료구조 연산 구현을 연습
       정수 리스트를 관리하는 MyArrayList 클래스를 작성하고 사용하는 프로그램
 */
package hw5_1;

import java.util.Scanner;

public class MyArrayListTest extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw5_1: 임진영\n");
		Scanner input = new Scanner(System.in);
		MyArrayList list = new MyArrayList(); // (1) MyArrayList 객체를 생성(list라고 하자)


		// (2) 사용자에게 다음과 같은 메뉴를 반복하여 제공하되 7 입력시 반복 종료
		int menu = 0;
		int index = 0;
		int element = 0;
		do {
			System.out.print(" 1:인덱스조회 2:전체조회 3:길이조회 4:삽입 5:인덱스삽입 6:인덱스삭제 7:종료 ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("인덱스 위치의 원소값을 조회합니다.");
				System.out.print("인덱스 입력: ");
				index = input.nextInt();
				element = list.get(index);
				System.out.println(element);  
				break;
			case 2:
				System.out.println("리스트 전체를 조회합니다.");
				System.out.println(list.toString());
				break;
			case 3:
				System.out.println("리스트 길이를 조회합니다.");
				int size = list.size();
				System.out.println(size);
				break;
			case 4:
				System.out.println("원소를 리스트의 맨 뒤에 삽입합니다.");
				System.out.print("정수값 입력: ");
				element = input.nextInt();    
				list.add(element); 
				break;
			case 5:
				System.out.println("인덱스 위치에 원소를 삽입합니다.");
				System.out.print("인덱스 입력: ");
				index = input.nextInt();    
				System.out.print("정수값 입력: ");
				element = input.nextInt();    
				list.add(index, element); 
				break;
			case 6:
				System.out.println("인덱스 위치의 원소를 삭제합니다.");
				System.out.print("인덱스 입력: ");
				index = input.nextInt(); 
				element = list.remove(index);
				System.out.println(element);
				break;
			case 7:
				System.out.println("종료합니다.");   
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 7);
	}
}

/*
드라이버 클래스(예를 들어 MyArrayListTest 클래스)의 main 메소드는 다음을 수행

(1) MyArrayList 객체를 생성(list라고 하자)
(2) 사용자에게 다음과 같은 메뉴를 반복하여 제공하되 7 입력시 반복 종료
   1:인덱스조회 2: 전체조회 3:길이조회 4:삽입 5:인덱스삽입 6:인덱스삭제 7:종료

1 선택시, 사용자로부터 인덱스를 입력받아 list에서 값을 조회하여 출력(get 호출)
2 선택시, list의 전체 내용을 출력(toString 호출)
3 선택시, list의 길이를 출력(size 호출)
4 선택시, 사용자로부터 정수값을 입력받아 list에 삽입(add 호출)
5 선택시, 사용자로부터 인덱스와 정수값을 입력받아 list에 삽입(add 호출) ** 주의: 반드시 인덱스, 정수값 순서로 입력받을 것
6 선택시, 사용자로부터 인덱스를 입력받아 list에서 값을 삭제하여 출력(remove 호출)


 ** 옵션1: 인덱스가 범위를 벗어났을 때 IndexOutOfBoundsException 예외 발생하도록 해 볼 것
          (배열의 인덱스가 아니라 리스트의 인덱스를 벗어났을 때 예외를 발생시켜야 함)
 ** 옵션2: 내부 정수 배열이 가득찬 경우 false 리턴하는 대신, 정수 배열을 2배로 확장하도록 해 볼 것
          (이 경우 첫번째 add 메소드의 리턴 값은 항상 true이다)
 ** 옵션3: MyArrayList 클래스를 정수값 이외에도 다양한 자료형의 객체 원소를 다룰 수 있도록 제네릭 클래스로 작성해 볼 것
 ** 옵션4: toString 오버라이드 - 배열에 저장된 항목 전체를 문자열로 리턴 -----> StringBuffer로 
 */
