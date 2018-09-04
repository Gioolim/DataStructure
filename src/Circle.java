/*
���ϸ�: Circle.java
�ۼ���: ������
�ۼ���: 2018. 9. 4
����: Ŭ���� �ۼ�, ��ü ������ ����� ����
      ������ �Ӽ��� ���� Circle Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷�
 */

public class Circle {
	private int radius; // �ʵ�(private �ν��Ͻ� ����): ������(radius) - ������

	Circle() {
		this.radius = 1;
	} // �Ű������� ���� ������(constructor) - �������� 1�� �ʱ�ȭ

	Circle(int radius) {
		this.radius = radius;
	} // �������� �Ű������� �޾� �ʱ�ȭ �ϴ� ������

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	} // ������ getter/setter

	public double getVolume() {
		return this.radius * Math.PI;
	} // ������ ����Ͽ� �����ϴ� �޼ҵ� - �������� 3.14 �Ǵ� Math Ŭ������ ��� �̿�

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
	} // equals/hashCode �������̵� - �������� �����ϸ� ������ ��ü�� �����ϵ���

	@Override
	public String toString() {
		return "Circle [������=" + radius + "]";
	} // toString �������̵� - ������ ������ ���ڿ��� ����
}