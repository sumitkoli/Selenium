package SeliniumJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class FirstAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		//key create
		WebDriver d = new ChromeDriver();
		
		//navigate to url
		d.get("https://brandlock.io/");
		Thread.sleep(3000);
		
	// clicking on the Shield page
		d.findElement(By.id("menu-item-1377")).click();
			Thread.sleep(3000);
			d.navigate().back();
			Thread.sleep(3000);
			
	// clicking on the Engage page		
		d.findElement(By.id("menu-item-1434")).click();
			Thread.sleep(3000);
			d.navigate().back();
			Thread.sleep(3000);
			
	// clicking on the Resources page
		d.findElement(By.id("menu-item-1968")).click();
			Thread.sleep(3000);
			
			// clicking on the Case Study Option
			d.findElement(By.id("menu-item-1966")).click();
				Thread.sleep(3000);
				d.navigate().back();
				
	// clicking on the Resource Page
		d.findElement(By.id("menu-item-1968")).click();
			Thread.sleep(3000);
			
			// clicking on the Blog Option
			d.findElement(By.id("menu-item-450")).click();
				Thread.sleep(3000);
	// Entering the Email Id		
				d.findElement(By.id("form-field-email")).sendKeys("xyz@gmail.com");
					Thread.sleep(3000);
			
	// clicking on the Clicking on Subscribe Button
		d.findElement(By.className("elementor-button-text")).click();
			Thread.sleep(3000);
				d.navigate().back();
			
	// clicking on the Get A Demo Button
		d.findElement(By.id("menu-item-2317")).click();
			Thread.sleep(3000);
			//Entering the Name
			d.findElement(By.id("nf-field-5_1")).sendKeys("XYZ");
			//Entering the Email Id
			d.findElement(By.id("nf-field-6_1")).sendKeys("xyz@gmail.com");
			//Entering the website url
			d.findElement(By.id("nf-field-9_1")).sendKeys("www.abc.com");
			Thread.sleep(40000);
		
			//CLicking on Submit button
			d.findElement(By.id("nf-field-8_1")).click();
			
			
		
		
	}

}
