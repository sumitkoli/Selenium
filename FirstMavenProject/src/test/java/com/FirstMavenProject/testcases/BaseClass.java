package com.FirstMavenProject.testcases;


import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.Logger;

public class BaseClass {
	
	public String baseurl="https://brandlock.io/";
	public String username="Pankaj";
	public String emailid="abc@gmail.com";
	public String usersurl="xyz.com";
	public static WebDriver driver;		
	
	public static Logger Logger;

	@BeforeClass
	public void setup()
	{
		//opening the chrome Browser
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit Koli\\eclipse-workspace\\FirstMavenProject\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit Koli\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	
	Logger = Logger.getLogger("Brandlock");
	PropertyConfigurator.configure("log4j.properties");
	}
	
	
	@AfterClass
	public void teardown()
	{
		//Closing the chrome Browser
		driver.quit();
	}
}
