package Rediff;

import org.testng.annotations.Test;

public class VerifyHomePageTitle {

	@Test(priority=1)
	public void openBrowser()
	{
		System.out.println("Launch Application");
		System.out.println("Welcome to Git Repository...");
	}
	@Test(priority=2)
	public void checkTitle()
	{
		System.out.println("Check Title");
	}
	@Test(priority=3)
	public void closeBrowser()
	{
		System.out.println("Close Application.");
	}
}
