/*
파일명: CircleTest.java
작성자: 임진영
작성일: 2018. 9. 4
주제: 클래스 작성, 객체 생성과 사용을 연습
      반지름 속성을 갖는 Circle 클래스를 작성하고 사용하는 프로그램
 */

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_5: 임진영");
		Circle circle1 = new Circle();
		circle1.setRadius(2);
		
		Circle circle2 = new Circle((int)(Math.random()*4+1));
		
		System.out.println("circle1: " + circle1.toString());
		System.out.println("circle2: " + circle2.toString());
		
		System.out.println(circle1.equals(circle2));
		
		System.out.println(circle1.hashCode());
		System.out.println(circle2.hashCode());
		
      	System.out.println(String.format("%.2f", circle1.getVolume()));
      	System.out.println(String.format("%.2f", circle2.getVolume()));
	}
	
}

/*
(1) 원 객체를 생성(circle1)
(2) circle1의 반지름을 2로 수정
(3) 원 객체를 생성하되, 1~4 범위의 랜덤 정수값으로 반지름을 초기화하도록 생성(circle2)
(4) circle1를 출력 - toString 호출
(5) circle2를 출력 - toString 호출
(6) circle1과 circle2가 동일한지를 알아보아 결과를 출력 - equals 호출   
(7) circle1의 hashCode를 출력 - hashCode 호출
(8) circle2의 hashCode를 출력 - hashCode 호출
(9) circle1의 면적을 출력 - 면적계산 메소드 호출
(10) circle2의 면적을 출력 - 면적계산 메소드 호출
*/