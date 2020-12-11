package com.FirstMavenProject.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	
	WebDriver ldriver;
	
	public loginpage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(id="menu-item-2317")
	@CacheLookup
	WebElement requestdemobutton;
	
	//testng Annotation
	//PageFactory.initElements(driver, pageObjectClass) implicitly creates the findElement calls behind the scene.
	@FindBy(id="nf-field-5_1")
	
	//PageFactory annotation @CacheLookup is used to mark the WebElements once located so that the same instance in the DOM can always be used
	@CacheLookup
	WebElement username;
	
	@FindBy(id="nf-field-6_1")
	@CacheLookup
	WebElement  emailid;
	
	@FindBy(id="nf-field-9_1")
	@CacheLookup
	WebElement usersurl;
	
	@FindBy(id="nf-field-8_1-wrap")
	@CacheLookup
	WebElement submitbutton;
	
	//Action Method
	
	public void setRbutton()
	{
		requestdemobutton.click();
		
	}
	public void setUsername(String uname)
	{
		username.sendKeys(uname);
		
	}
	
	public void setEmailid(String email)
	{
		emailid.sendKeys(email);
	}
	
	public void setUrl(String weburl)
	{
		usersurl.sendKeys(weburl);
	}
	
	public void setButton()
	{
		submitbutton.click();
	}
}
