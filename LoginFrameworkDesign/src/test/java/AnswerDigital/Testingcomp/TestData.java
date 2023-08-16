package AnswerDigital.Testingcomp;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import AnswerDigital.pageobjects.LoginPage;

public class TestData{



	public WebDriver driver;
	public LoginPage loginpage;
	
	public WebDriver initializedriver()	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}		
		
		public  LoginPage launchbroswerapplication()
		{
			driver=initializedriver();
			 loginpage =new LoginPage(driver);
			 loginpage.gotourl();
			return loginpage;
		}
		
		

		@DataProvider                          // DataProvider is used to Provide Multiple data in one Shot in form of Array. 
		public Object[][] logincredetials(){
		
			Object[][] data=new Object[3][2];
			data[0][0]="standard_user";
			data[0][1]="secret_sauce";
			
			data[1][0]="problem_user";
			data[1][1]="secret_sauce";
			
			data[2][0]="performance_glitch_user";
			data[2][1]="secret_sauce";
			
			return data;
						
		}
		
		
		
		
}




