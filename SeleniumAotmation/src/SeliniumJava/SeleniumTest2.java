package SeliniumJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest2 {
	
	 WebDriver driver;
	    ATUTestRecorder recorder;
	    
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromeDriver\\\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 JavascriptExecutor jse= (JavascriptExecutor)driver;
	        driver.get("http://automate-apps.com/how-to-select-an-option-from-a-drop-down-using-selenium-web-driver/");
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        jse.executeScript("scroll(0,2000)","10");
	        WebElement element = driver.findElement(By.id("month"));
	        Select select = new Select(element);
	        select.selectByIndex(5);
	   //     Thread.sleep(3000);
	      
	        select.selectByVisibleText("Feb");
	        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
	        Date date = new Date();
	 
	        //create an object of ATUTestRecorder class and pass 3 parameters explained above.
	       ATUTestRecorder recorder = new ATUTestRecorder("D:/Recordings/","Script_Video_" + dateFormat.format(date), false);
	 
	        //To start video recording.
	        recorder.start();
	}
}