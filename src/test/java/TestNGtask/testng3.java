package TestNGtask;

import org.testng.annotations.Test;

public class testng3 {
int a=30;
@Test
public void maven1() {
if (a<28) {
	System.out.println("good day");
}else
{
	System.out.println("bad day");
}
}
}