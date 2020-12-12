package SeliniumJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

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
		
		int rowcount=sheet1.getLastRowNum();
		//row count
		
		//System.out.println("The excle value : " +rowcount);
		
		for(int i=0;i<=rowcount;i++)
		{
			String data1=sheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("The excle value : " +data1);
			
		}
		
		
	}
}