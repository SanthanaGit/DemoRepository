package com.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void browserlaunch() {
		System.setProperty("webDriver.chrome.driver",
				"C:\\Users\\Santhanam\\eclipse-workspace\\Maven_Sample\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void url(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}

	public static WebElement findElementById(String id) {
		return driver.findElement(By.id(id));

	}

	public static WebElement findElementByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));

	}

	public static WebElement findElementByXpath(By ab) {
		return driver.findElement(ab);

	}

	public static void typedata(WebElement element, String data) {
		element.sendKeys(data);
	}
	public static void main(String[] args) {
	
}
}