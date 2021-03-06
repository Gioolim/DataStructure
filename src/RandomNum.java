/**
파일명: RandomNum.java
작성자: 임진영
작성일: 2018. 9. 4
주제: 랜덤 넘버 생성과 반복문을 연습
     1~4 범위의 랜덤 넘버 10개를 생성하여 각 넘버가 몇개씩 생성되었는가를 세는 프로그램
 */

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_3: 임진영\n");
		System.out.print("랜덤 넘버 = ");
		
		int[] arr = new int[10]; // 10개의 난수를 저장할 배열 선언
		int i;
		for(i=0; i<arr.length; i++) {
			arr[i] = (int)((Math.random()*4)+1);
			System.out.print(arr[i]+" ");
		} // 랜덤 넘버 생성 및 출력
		
		int[] count = new int[4]; // 난수의 개수를 저장할 배열 선언
		for(i=0; i<arr.length; i++)
			count[arr[i]-1]++; // 난수의 개수 계산
		System.out.println("");
		for(i=0; i<count.length; i++)
			System.out.println(i+1+"의 갯수 = "+count[i]); // 각 난수의 개수 출력
	}

}