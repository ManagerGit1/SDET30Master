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
		String BROWSER = System.getProperty("Browser");
		System.out.println(BROWSER);
		String URL = System.getProperty("Url");
		System.out.println(URL);
		String USERNAME = System.getProperty("Username");
		System.out.println(USERNAME);
		String PASSWORD = System.getProperty("Password");

		
		
		
	}

}
