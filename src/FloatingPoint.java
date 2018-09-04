/**
일시 : 2018. 9. 4
주제 : 실수 표현 연습
 */

import java.math.BigDecimal;

public class FloatingPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.0;
		double y = 2.345;
		double z = x + y;
		if ((z-5.345) < 0.00000000001) // (z==5.345)
			System.out.println("합격");
		else
			System.out.println("불합격");
		System.out.println(z);
		
		BigDecimal b1 = new BigDecimal("3.0");
		BigDecimal b2 = new BigDecimal("2.345");
		System.out.println(b1.add(b2));
	}

}
