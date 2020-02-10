package com.sales.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sales.qa.util.TestUtil;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase(){
			
			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/sales/qa/config/config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
	}
	
	public static void initialization(){
//		String browserName = prop.getProperty("browser");
//		
//		if (browserName.equals("chrome")){
//			System.setProperty("webdriver.chrome.driver", "/Users/trups/Downloads/chromedriver");
//			driver = new ChromeDriver();
//		}
//		else if (browserName.equals("ff")){
//			System.setProperty("webdriver.gecko.driver", "/Users/trups/Documents/workspace/JavaStudy19/Salesforce_POM/drivers/geckodriver");
//			driver = new FirefoxDriver();
//		}
//		
//		
//		driver.manage().window().maximize();
//		driver.get(prop.getProperty("url"));
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/trups/Downloads/chromedriver");
     	driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://login.salesforce.com/");
		
		
	}
	
	
	

}
