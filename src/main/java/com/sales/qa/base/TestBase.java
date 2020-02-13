package com.sales.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.sales.qa.util.TestUtil;
import com.sales.qa.util.WebEventListener;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static 	EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	
	
	public TestBase(){
			
			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/sales/qa/config/config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
				
	}
	
	public static void initialization(){
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.home")+"/Downloads/chromedriver");
		driver = new ChromeDriver();
     	
//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.home")+"/Downloads/geckodriver");
// 		driver = new FirefoxDriver();
 		
 		
     	e_driver = new EventFiringWebDriver(driver);
     	
     	eventListener = new WebEventListener();
     	
     	e_driver.register(eventListener);
     	
     	driver = e_driver;
     	
		
		driver.manage().window().maximize();
		
		//driver.get(prop.getProperty("url"));
		driver.get("https://login.salesforce.com/");
		
		
	}
	
	
	

}
