package SeliniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gif {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\ChromeDriver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		
		d.get("https://www.zamzar.com/");
		
		Thread.sleep(4000);
		
		d.findElement(By.name("file_1")).click();
		

	}

}
