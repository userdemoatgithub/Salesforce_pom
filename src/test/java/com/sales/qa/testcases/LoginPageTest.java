package com.sales.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sales.qa.base.TestBase;
import com.sales.qa.pages.HomePage;
import com.sales.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	 LoginPage loginPage;
     HomePage homepage;
	
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public  void setUp(){
		initialization();
		loginPage = new LoginPage();  
	}
	
	@Test
	public void loginValidCredentialsTest(){
		
		homepage = loginPage.Login(prop.getProperty("user"), prop.getProperty("pwd"));
		
	}
	
	@Test
	public void LoginInvalidCredentialsTest(){
	loginPage.Login(prop.getProperty("user_invalid"), prop.getProperty("pwd_invalid"));
	System.out.println( loginPage.getErrorMsg());
	}
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
