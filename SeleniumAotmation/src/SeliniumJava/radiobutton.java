package SeliniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","C:\\\\ChromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver a =new ChromeDriver();
		
		a.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		a.findElement(By.name("firstname")).sendKeys("Sumit");
		
		a.findElement(By.name("lastname")).sendKeys("Koli");
		
		a.findElement(By.id("sex-0")).click();
		
		a.findElement(By.id("exp-0")).click();
		
		a.findElement(By.id("datepicker")).sendKeys("10/05/2020");
		//profession-0   tool-2
		a.findElement(By.id("profession-0")).click();
		
		a.findElement(By.id("tool-2")).click();
		
		Select c =new Select(a.findElement(By.id("continents")));
		c.selectByIndex(2);
		
		Select d =new Select(a.findElement(By.id("selenium_commands")));
		d.selectByIndex(2);
		
		a.findElement(By.id("photo")).sendKeys("C:\\Users\\Sumit Koli\\Downloads\\clickbait_code.txt");
		//control-group btn btn-info
		a.findElement(By.className("control-group")).click();
		
		a.findElement(By.id("submit")).click();
		
		
	}

}
