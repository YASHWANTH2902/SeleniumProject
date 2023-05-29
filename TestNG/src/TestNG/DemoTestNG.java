package TestNG;

import org.testng.annotations.Test;

public class DemoTestNG {

@Test(priority=2)
public void add() {
	System.out.println("add  "+(1+2));
}
@Test(priority=1)
public void sub() {
	System.out.println("mul "+(10*20));
}
}
	


