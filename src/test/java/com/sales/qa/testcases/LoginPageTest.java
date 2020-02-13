package com.sales.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sales.qa.base.TestBase;
import com.sales.qa.pages.HomePage;
import com.sales.qa.pages.LoginPage;
import com.sales.qa.util.TestUtil;

public class LoginPageTest extends TestBase {
	
	 LoginPage loginPage;
     HomePage homepage;
     String sheetName = "Login";
     
	
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public  void setUp(){
		initialization();
		loginPage = new LoginPage();  
	}
	
	@Test(enabled = false)
	public void loginValidCredentialsTest(){
		
		homepage = loginPage.Login(prop.getProperty("user"), prop.getProperty("pwd"));
		
	}
	
	@Test(enabled = false)
	public void LoginInvalidCredentialsTest(){
	loginPage.Login(prop.getProperty("user_invalid"), prop.getProperty("pwd_invalid"));
	System.out.println( loginPage.getErrorMsg());
	}
	
	
	@DataProvider
	public Object[][] getSalesTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test (dataProvider = "getSalesTestData")
	public void ValidateLoginNuser(String username, String password){
	 homepage =	loginPage.Login(username, password);
	 System.out.println( loginPage.getErrorMsg());	
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
