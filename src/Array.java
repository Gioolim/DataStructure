/*
 * ���ϸ�: Array.java
 * �ۼ���: 2018.8.28
 * �ۼ���: ������
 * ����:  ������ �ڷᱸ���� ����
 */

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("lab1_2: ������");

		int[] array = new int[10]; // ũ�Ⱑ 10�� �迭 ����
		int i, f, index;
		System.out.print("������ 10�� �Է�: ");
		for(i=0; i<array.length; i++) {
			array[i] = scan.nextInt();
		} // ����ڷκ��� 10���� �������� �Է¹޾� �迭�� ����

		System.out.print("�˻��� ������ �Է�: ");
		f = scan.nextInt(); // 

		for(index=0; index<array.length; index++) {
			if(array[index] == f)
					break;
		}
		// ������ �ϳ��� �Է¹޾� �� �������� �迭�� ��� ��ġ�� ����Ǿ� �ִ��� �迭 ���Ҹ� �ϳ��� ���ʴ�� �˻�
		
		if(index==10 && array[index-1] != f)
			index = -1;
		// ���� ã�� �������� �迭�� ������ -1�� ���

		System.out.println("�ε��� = " + index);
		// �ε����� ���
	}

}