package AnswerDigital.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) //Constructor for Initialisation 
	{				
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}	
	
	@FindBy(id="user-name")
	WebElement userEmail;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement login;	
	
	public void loginpage(String username, String passcode)
	{
		gotourl();
		userEmail.sendKeys(username);
		password.sendKeys(passcode);
		login.click();	
		
	}
	
	public String currenturl()
	{
		return driver.getCurrentUrl();
	}	


	public void gotourl()
	{
		driver.get("https://www.saucedemo.com");
	}

}
