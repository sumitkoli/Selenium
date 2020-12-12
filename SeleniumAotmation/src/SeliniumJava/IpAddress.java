package SeliniumJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IpAddress {

	public static void main(String[] args)throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\ChromeDriver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		//fetching the chrome driver
		
		WebDriver d=new ChromeDriver();

		File src=new File("C:\\Excel data\\Testdata.xlsx");
		//access the file to eclipse
		
		FileInputStream fis=new FileInputStream(src);
		//converted file into bytes
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//loaded the file into the eclipse
		
		wb.getSheetAt(0);
		//sheet number in excel
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		//naming the sheet
		
		//String data=sheet1.getRow(1).getCell(0).getStringCellValue();
		//Getting the cell data from excel by row and column value
		
	//	System.out.println("The excle value : " +data);
		
		int rowcount=sheet1.getLastRowNum();
		//row count
		
		//System.out.println("The excle value : " +rowcount);
		
		for(int i=0;i<rowcount;i++)
		{
			String data1=sheet1.getRow(i).getCell(0).getStringCellValue();
			//get the cell data
			
			//System.out.println("The excle value : " +data1);
			
		
		//web source
			d.get("https://bgp.he.net/ip/");
			Thread.sleep(3000);
			
			d.findElement(By.name("search[search]")).sendKeys(data1);

			
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
		
		wb.close();
		
	}

}
