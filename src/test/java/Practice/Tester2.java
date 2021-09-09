package Practice;

import org.testng.annotations.Test;

public class Tester2 {
	
	@Test(priority = 1)
	public void orgPage()
	{
		System.out.println("========1========");
	}

	@Test(priority = 2)
	public void orgHello()
	{
		System.out.println("========2========");
	}
}
