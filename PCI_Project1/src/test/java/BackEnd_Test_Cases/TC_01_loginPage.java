package BackEnd_Test_Cases;



import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import BackEnd_PageObject.PO_01_loginPage;
import Functions.BaseTest;

public class TC_01_loginPage extends BaseTest {
	
	@Test
	public void loginValid() throws InterruptedException {
		PO_01_loginPage po_01_loginPage=PageFactory.initElements(driver, PO_01_loginPage.class);
		po_01_loginPage.enterUserId("admin@gmail.com");
		po_01_loginPage.enterPassword("123456");
		po_01_loginPage.clickSubmitButton();
		Thread.sleep(3000);
		
		String expected =driver.getTitle();
		String actual="PCI Admin";
		Assert.assertEquals(actual, expected);
		
	}
	@Test
	public void loginINvalid() throws InterruptedException {
		PO_01_loginPage po_01_loginPage=PageFactory.initElements(driver, PO_01_loginPage.class);
		po_01_loginPage.enterUserId("");
		po_01_loginPage.enterPassword("");
		po_01_loginPage.clickSubmitButton();
		Thread.sleep(3000);
		
		String expected =driver.getTitle();
		String actual="PCI Admin";
		Assert.assertNotEquals(actual, expected);
		
	}
}
