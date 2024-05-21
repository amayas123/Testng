package TestNGtask;

import org.testng.annotations.Test;

public class dowhile {
	@Test
	public void maven() {
		int i=0;
		do {
			System.out.println(i);
			i++;
		}
while(i<5);
}
}