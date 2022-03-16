package Demomodule;

import org.testng.annotations.Test;

public class demo2 {
	
	@Test
	public void demo2()
	{
		System.out.println("hi sreejith");
	}
	@Test
	public void demo3()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
	}

}
