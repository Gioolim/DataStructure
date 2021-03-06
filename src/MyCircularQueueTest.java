/*
 * 파일명 : MyCircularQueueTest.java
 * 작성일: 2018년 11월 2일
 * 작성자: 진영
 * 내용:  배열을 이용한 원형 큐 구현을 연습
 */
package hw8_1;

import java.util.Scanner;

public class MyCircularQueueTest {
	public static void main(String[] args) {
		System.out.println("hw8_1: 임진영");
		Scanner input = new Scanner(System.in);

		MyCircularQueue queue = new MyCircularQueue(5);

		int menu = 0;
		int element = 0;	
		
		do {
			System.out.print(" 1:삽입 2:삭제 3:조회 4:크기 5:전체삭제 6:종료 ---> ");
			menu = input.nextInt();
			switch(menu) {
			case 1:
				System.out.println("입력받은 값을 큐의 맨 뒤에 삽입합니다.");
				System.out.print("정수값 입력: ");
				element = input.nextInt();  
				queue.enQueue(element);
				break;
			case 2:
				System.out.println("큐의 맨 앞 값을 삭제하고 출력합니다.");
				element = queue.deQueue();
				System.out.println(element);
				break;
			case 3:
				System.out.println("큐의 맨 앞 값을 조회합니다.");
				element = queue.peek();
				System.out.println(element);
				break;
			case 4:
				System.out.println("큐의 저장된 원소 수를 출력합니다.");
				System.out.println(queue.size());
				break;
			case 5:
				System.out.println("값을 모두 삭제하고 출력합니다.");
				while (queue.isEmpty() != true) {
					System.out.print(queue.deQueue() + " ");
				}
				System.out.println();
				break;
			case 6:
				System.out.println("종료합니다.");   
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 6);
	}


}

/*
- MyCircularQueueTest 클래스의 main 메소드는 다음을 수행

(1) 크기가 5인 MyCircularQueue 객체를 생성

(2) 메뉴 6을 선택할 때까지 다음과 같은 메뉴를 반복하여 제공

1:삽입 2:삭제 3:조회 4:크기 5:전체삭제 6:종료

1 선택시, 사용자로부터 정수값을 하나 입력받아 큐의 맨 뒤에 삽입(enQueue)
2 선택시, 큐의 맨 앞 원소를 삭제하여(deQueue) 출력
3 선택시, 큐의 맨 앞 원소를 조회하여(peek) 출력
4 선택시, 큐에 저장된 원소 수를 알아내어(size) 출력
5 선택시, 큐가 텅 빌때까지 원소를 하나씩 삭제하여(deQueue) 모두 출력

 ** 예외 처리할 필요 없음
 ** 이 프로그램에서 최대 5개의 정수를 저장할 수 있어야 함
 */
