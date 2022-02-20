package demo_maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Cloud_BankIN {

	public static void Loan() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Santhanam\\eclipse-workspace\\Maven_Sample\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://salesdemo.habiletechnologies.com/#/");

		Thread.sleep(2000);

		Actions a = new Actions(driver);

		driver.findElement(By.id("uid")).sendKeys("qatest@habile.in");

		driver.findElement(By.id("pwd")).sendKeys("Qatest123$");

		driver.findElement(By.id("login-button")).click();

		Thread.sleep(3000);
		WebElement b = driver.findElement(By.xpath("//a[@id='client-dropdown']"));
		a.moveToElement(b).build().perform();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Clients'])[1]")).click();

		Thread.sleep(3000);
		driver.findElement(By.id("client_createbutton")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Santhana prabu");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("R");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("8610420990");

		Thread.sleep(2000);
		driver.findElement(By.id("dateofbirth")).sendKeys("12 July 1991");

		driver.findElement(By.xpath("(//span[text()='12'])[1]")).click();

		Thread.sleep(2000);
		WebElement c = driver.findElement(By.xpath("//option[@label='Male']"));
		Select s1 = new Select(c);
		s1.selectByValue("number:51");

		Thread.sleep(2000);
		WebElement d = driver.findElement(By.xpath("//option[@label='Merchant']"));
		Select s2 = new Select(d);
		s2.selectByValue("number:202");

	}

	public static void main(String[] args) throws InterruptedException, IOException {
		Loan();

	}
}
