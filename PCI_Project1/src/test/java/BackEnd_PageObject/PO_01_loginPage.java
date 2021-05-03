package BackEnd_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_01_loginPage {

	
WebDriver driver;
	 
	
	public PO_01_loginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div/div[2]/div/form/div[1]/input") 
	WebElement userName;
	
	@FindBy(how=How.XPATH, using="/html/body/div/div[2]/div/form/div[2]/input")
	WebElement password;
	
	@FindBy(how=How.XPATH, using="/html/body/div/div[2]/div/form/div[3]/div/button")
	WebElement loginButton;
	
	public void enterUserId(String Username) {
		userName.sendKeys(Username);
	}
	
	public void enterPassword(String passWord) {
		password.sendKeys(passWord);
	}
	
	public void clickSubmitButton() {
		loginButton.click();
	}
}
