package com.testng001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple01 {

public static WebDriver driver;
	
	@BeforeSuite
	
	private void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Santhanam\\eclipse-workspace\\Maven_Sample\\Drivers\\chromedriver.exe");
	}
	
	@BeforeTest
	private void browserLaunch() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(3000);
	}	
	@BeforeClass
	private void openUrl() throws InterruptedException {
		
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
	}	
	@BeforeMethod
	private void login() {
		driver.manage().window().maximize();
	}
	
	@Test 
	private void userName() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("raj@gmail.com");
	}
	@Test
	private void password() {
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("raj6666");
	}	
	@AfterMethod
	private void refersh() {
		driver.navigate().refresh();
	}	
	@AfterClass
	private void logout() {
		System.out.println("logout");
	}	
	@AfterTest
	private void close() {
		driver.close();
	}	
	@AfterSuite
	private void clearcookies() {
		driver.manage().deleteAllCookies();
}
	
}

