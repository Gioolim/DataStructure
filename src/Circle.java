/*
파일명: Circle.java
작성자: 임진영
작성일: 2018. 9. 4
주제: 클래스 작성, 객체 생성과 사용을 연습
      반지름 속성을 갖는 Circle 클래스를 작성하고 사용하는 프로그램
 */

public class Circle {
	private int radius; // 필드(private 인스턴스 변수): 반지름(radius) - 정수형

	Circle() {
		this.radius = 1;
	} // 매개변수가 없는 생성자(constructor) - 반지름을 1로 초기화

	Circle(int radius) {
		this.radius = radius;
	} // 반지름을 매개변수로 받아 초기화 하는 생성자

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	} // 반지름 getter/setter

	public double getVolume() {
		return this.radius * Math.PI;
	} // 면적을 계산하여 리턴하는 메소드 - 원주율은 3.14 또는 Math 클래스의 상수 이용

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return true;
	} // equals/hashCode 오버라이드 - 반지름이 동일하면 동일한 객체로 간주하도록

	@Override
	public String toString() {
		return "Circle [반지름=" + radius + "]";
	} // toString 오버라이드 - 반지름 정보를 문자열로 리턴
}