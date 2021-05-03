package Functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class BaseTest {
	public static WebDriver driver;
	
	@BeforeSuite
	public void intialize() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Driver\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
			driver.get("https://pci-revamp.convstaging.com/admin/dashboard/login");
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}
}
