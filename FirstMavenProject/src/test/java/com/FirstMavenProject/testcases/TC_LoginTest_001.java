package com.FirstMavenProject.testcases;

import org.testng.annotations.Test;

import com.FirstMavenProject.pageObject.loginpage;

public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws InterruptedException
	{
		driver.get("https://brandlock.io/");
		Logger.info("URL is open");
		
		Thread.sleep(3000);
		loginpage lp=new loginpage(driver);
		
		lp.setRbutton();
		Thread.sleep(3000);
		
		lp.setUsername(username);
		Logger.info("Enter Usernmae");
		Thread.sleep(3000);
		
		
		lp.setEmailid(emailid);
		Logger.info("Enter Password");
		Thread.sleep(3000);
		
		lp.setUrl(usersurl);
		Logger.info("Enter User URL");
		Thread.sleep(3000);
		
		lp.setButton();
		Thread.sleep(3000);
		
	}
}
