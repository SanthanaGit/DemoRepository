package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassing {
	static WebDriver driver;

	@BeforeClass
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Santhanam\\eclipse-workspace\\Maven_Sample\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@Parameters({"username","password"})
	@Test
	public void test(String user , String pass) {
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}

	@AfterClass
	public void afterClass() {
	//	driver.quit();

	}

}
