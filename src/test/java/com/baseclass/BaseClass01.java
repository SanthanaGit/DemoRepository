package com.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass01 {
	
	public static WebDriver driver;
	
	public static void browserlaunch() {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Santhanam\\eclipse-workspace\\Maven_Sample\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver(); 
			driver.manage().window().maximize();
	}
	
	public static void url(String url) {		
		driver.get(url);		
	}
	
	public static void keys(String xpath, String name) {
		WebElement keyy = driver.findElement(By.xpath(xpath));
		keyy.sendKeys(name);
		
	}
	
	
	

}
