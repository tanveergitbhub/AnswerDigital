package AnswerDigital.LoginFrameworkDesign;

import static org.testng.Assert.assertEquals;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import AnswerDigital.Testingcomp.TestData;
import AnswerDigital.pageobjects.LoginPage;

           
public class LoginTest extends TestData {
  
	/*This class will run 2 Test Cases. ONE with Correct Login Details , 2ND with Locked/Blocked user Details
	and will apply Assertions to verify the Test Validation.*/
	
	
	@Test(dataProvider="logincredetials")//This Method will Rung THREE Times with Correct Valid User Details
	public void succesful_login_ids(String username, String password){				
		LoginPage lp= launchbroswerapplication();		
		lp.loginpage(username, password);
		String newurl=lp.currenturl();
		 //Assertions to Check the validity of test pass
		Assert.assertEquals(newurl, "https://www.saucedemo.com/inventory.html");   
	}
	
	@Test	
	public void locked_out_user(){
		//This Method will run with Lock-out-User Details This negative test will pass to ensure user is blocked.
	
		LoginPage lp= launchbroswerapplication();		
		lp.loginpage("locked_out_user", "secret_sauce");
	    String newurl=lp.currenturl();
	    Assert.assertEquals(newurl, "https://www.saucedemo.com/"); 
	    	    
		}
		
	

}
