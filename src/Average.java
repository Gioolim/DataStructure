/*
���ϸ�: Average.java
�ۼ���: ������
�ۼ���: 2018. 9. 4
����: �޼ҵ� �ۼ��� ȣ���� ����
      ����ڰ� ���ϴ� ������ �������� �Է¹޾� �� ���������� ����� ���ϴ� ���α׷�
 */
import java.util.Scanner;

public class Average {

	public static double getAverage(int[] array) {
		int all = 0;
		for(int i=0; i<array.length; i++)
			all+=array[i];
		return ((double)all/(array.length));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("lab1_4: ������");

		System.out.print("\n���� ���� �Է�: ");
		int n = scan.nextInt();
		int[] array = new int[n];
		System.out.print(n+"���� ���� �Է�: ");
		for(int i=0; i<array.length; i++)
			array[i] = scan.nextInt();
		System.out.println("��� = "+getAverage(array));
	}

}

/*
- ���� �迭 ������ ����� ���ϴ� �޼ҵ�(���� ��� getAverage)�� �ۼ��Ѵ�.
 * �Ű����� : ���� �迭
 * ���ϰ� : ���� �迭 ��ü ������ ��հ�
   ���� �迭�� null�̰ų� �迭 ũ�Ⱑ 0�� ���� ������� �ʾƵ� ��
   main �޼ҵ�� ������ Ŭ������ static �޼ҵ�� �ۼ��ϸ� ��

- main �޼ҵ�� ������ ���� ����� �����ϵ��� �ۼ��Ѵ�.
(1) ����ڷκ��� ���� ����(n�̶�� ����)�� �Է¹޴´�.
(2) ����ڷκ��� n���� �������� �Է¹޾� ũ�Ⱑ n�� �迭�� �����Ѵ�.
(3) getAverage �޼ҵ带 ȣ���Ͽ� ��հ��� �˾Ƴ���.
(4) ��հ��� ����Ѵ�.

- Ű����� �Է��� ���������� white space(newline, blank, tab)���� ���е�

- �� ������ �ڷᱸ���� ���� ������ ������ ������ �����Դϴ�.
���� ������ Ư���� '..�� ����Ͻÿ�'��� ������� ������
�ڹ� API���� �����ϴ� ��� �ڷᱸ��(ArrayList ��), �޼ҵ��(sort ��)�� �̿����� ����
 */