/**
���ϸ�: RandomNum.java
�ۼ���: ������
�ۼ���: 2018. 9. 4
����: ���� �ѹ� ������ �ݺ����� ����
     1~4 ������ ���� �ѹ� 10���� �����Ͽ� �� �ѹ��� ��� �����Ǿ��°��� ���� ���α׷�
 */

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_3: ������\n");
		System.out.print("���� �ѹ� = ");
		
		int[] arr = new int[10]; // 10���� ������ ������ �迭 ����
		int i;
		for(i=0; i<arr.length; i++) {
			arr[i] = (int)((Math.random()*4)+1);
			System.out.print(arr[i]+" ");
		} // ���� �ѹ� ���� �� ���
		
		int[] count = new int[4]; // ������ ������ ������ �迭 ����
		for(i=0; i<arr.length; i++)
			count[arr[i]-1]++; // ������ ���� ���
		System.out.println("");
		for(i=0; i<count.length; i++)
			System.out.println(i+1+"�� ���� = "+count[i]); // �� ������ ���� ���
	}

}