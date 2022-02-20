package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exception {

	@Test (expectedExceptions = Exception.class)
	public void except( ) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Santhanam\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://adactin.com/HotelApp/");

		WebElement z = driver.findElement(By.xpath("//input[@type='text']"));
		z.sendKeys("java");
	
	}
}
