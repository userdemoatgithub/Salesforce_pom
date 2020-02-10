package com.sales.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sales.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(linkText= "Home")
	WebElement home ;
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public static String validateHomepageTitle(){
		return driver.getTitle();
	}
}
