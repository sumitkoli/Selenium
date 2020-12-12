package SeliniumJava;

	import org.openqa.selenium.chrome.ChromeDriver;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.concurrent.TimeUnit;
	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;
	import atu.testrecorder.ATUTestRecorder;
	import atu.testrecorder.exceptions.ATUTestRecorderException;
	 
	public class RtrSelenium {
	 
	    WebDriver driver;
	    ATUTestRecorder recorder;
	 
	    
	    public void setUp() throws Exception {
	        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
	        Date date = new Date();
	 
	        //create an object of ATUTestRecorder class and pass 3 parameters explained above.
	        recorder = new ATUTestRecorder("D:/Recordings/","Script_Video_" + dateFormat.format(date), false);
	 
	        //To start video recording.
	        recorder.start();
	    }
	 
	    
	    public void testApp() throws InterruptedException {
	        driver = new ChromeDriver();
	        driver.get("http://automate-apps.com/how-to-select-an-option-from-a-drop-down-using-selenium-web-driver/");
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        WebElement element = driver.findElement(By.id("month"));
	        Select select = new Select(element);
	        select.selectByIndex(5);
	        Thread.sleep(3000);
	        select.selectByVisibleText("Feb");            
	    }
	 
	   
	    public void tearDown() throws ATUTestRecorderException {
	         //close browser
	         driver.quit();
	        //Stop the recording
	          recorder.stop();
	    }
	 
	}

