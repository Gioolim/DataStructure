/*
���ϸ�: CircleTest.java
�ۼ���: ������
�ۼ���: 2018. 9. 4
����: Ŭ���� �ۼ�, ��ü ������ ����� ����
      ������ �Ӽ��� ���� Circle Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷�
 */

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_5: ������");
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
(1) �� ��ü�� ����(circle1)
(2) circle1�� �������� 2�� ����
(3) �� ��ü�� �����ϵ�, 1~4 ������ ���� ���������� �������� �ʱ�ȭ�ϵ��� ����(circle2)
(4) circle1�� ��� - toString ȣ��
(5) circle2�� ��� - toString ȣ��
(6) circle1�� circle2�� ���������� �˾ƺ��� ����� ��� - equals ȣ��   
(7) circle1�� hashCode�� ��� - hashCode ȣ��
(8) circle2�� hashCode�� ��� - hashCode ȣ��
(9) circle1�� ������ ��� - ������� �޼ҵ� ȣ��
(10) circle2�� ������ ��� - ������� �޼ҵ� ȣ��
*/