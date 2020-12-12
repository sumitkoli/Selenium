package SeliniumJava;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;


public class Mxtool1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\\\ChromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://bgp.he.net/ip/");
		Thread.sleep(3000);
		
		d.findElement(By.name("search[search]")).sendKeys("195.154");

		
		d.findElement(By.name("commit")).click();
		Thread.sleep(3000);
		try {
			
		
		String g=d.findElement(By.xpath("//*[@id=\"ipinfo\"]/table/tbody/tr/td[3]")).getText();
		//#ipinfo > table > tbody > tr > td:nth-child(3)
		//*[@id="ipinfo"]/table/tbody/tr/td[3]
		System.out.println("Value is : "+g);
		//d.close();
	}
		catch(Exception e)
		{
			System.out.println("no value");
		}
	
	}

}
