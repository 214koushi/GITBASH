package practice;

import org.testng.annotations.Test;

public class TESTlead {
	@Test
	public void testing() {
		System.out.println("completed ");
	}
	@Test(groups = "smoke")
	public void Testing2() {
		System.out.println("not completed ");
	}
	
}
