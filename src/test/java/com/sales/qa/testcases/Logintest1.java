package com.sales.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest1 {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "/Users/trups/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		 WebElement un = driver.findElement(By.id("username"));
         
         un.sendKeys("userdemotest1-rlq2@force.com");
         
         WebElement pw = driver.findElement(By.id("password"));
         
        pw.sendKeys("i*kC8VprzPLCxGYrfiiB");
         
         WebElement LoginBtn = driver.findElement(By.id("Login"));
         
         LoginBtn.click();

		
	}

}
