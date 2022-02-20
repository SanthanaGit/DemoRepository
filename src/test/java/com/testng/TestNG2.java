package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG2 {
	static WebDriver driver;
	@BeforeClass
	public void browserLaunch() {
	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Santhanam\\eclipse-workspace\\Maven_Sample\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();	
	driver.get("https://www.facebook.com");
	}
	
	@Test
		public void test() {
		driver.findElement(By.id("email")).sendKeys("aiite");
	}

	@AfterClass
	public void afterClass() {
		driver.findElement(By.id("pass")).sendKeys("123456789");
		
	}
}
