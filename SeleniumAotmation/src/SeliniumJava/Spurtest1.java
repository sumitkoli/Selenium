package SeliniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spurtest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver w =new ChromeDriver();
		
		//Go to the website
		w.get("https://www.calculator.net/");
		
		//Click on Number 4
		w.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		Thread.sleep(2000);
		
		//Click on Number 2
		w.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		Thread.sleep(2000);
		
		//Click on Number 3
		w.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		Thread.sleep(2000);
		
		//Click on "*"
		w.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]")).click();
		Thread.sleep(2000);
		
		//Click on Number 5
		w.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
		Thread.sleep(2000);
		
		//Click on Number 2
		w.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		Thread.sleep(2000);
		
		//Click on Number 5
		w.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
		Thread.sleep(2000);
		
		//Click on =
		w.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
		Thread.sleep(2000);
		
		//Get the Final Values 
		String i=w.findElement(By.id("sciOutPut")).getText();
		
		System.out.println("Value is : "+i);
	}

}
