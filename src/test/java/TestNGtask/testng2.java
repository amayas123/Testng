package TestNGtask;

import org.testng.annotations.Test;

public class testng2{
	int a=10;
			int b=20;
			@Test
			public void add() {
	int sum=a+b;
	System.out.println(sum);
			}
			@Test
			public void subtract() {
				int sub=a-b;
				System.out.println(sub);
			}
			@Test
			public void multiplication() {
				int mul=a*b;
				System.out.println(mul);
			}
			@Test
			public void divition() {
				int div=a/b;
				System.out.println(div);
			}
}
