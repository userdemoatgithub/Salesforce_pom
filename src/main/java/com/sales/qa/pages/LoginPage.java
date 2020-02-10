package com.sales.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sales.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
    WebElement password;
    
    @FindBy(id = "Login")
    WebElement loginBtn;
    
    @FindBy(id = "logo")
    WebElement companyLogo;
    
    @FindBy(id = "error")
    WebElement loginErrorMsg;
    
    
    // initialize the page objects
    
    public LoginPage(){
    	PageFactory.initElements(driver, this);
    }
    
    //actions
    
    public String validateLoginPageTitle(){
    	return driver.getTitle();
    }
    
    public HomePage Login(String un, String pwd){
    	
    	LoginPage login = new LoginPage();
    	username.sendKeys(un);
    	password.sendKeys(pwd);
    	loginBtn.click();
    	return new HomePage();
    }
    
    public String getErrorMsg(){
    	return loginErrorMsg.getText();
    }

}
