package demo_maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Samsung_mvn {
	public static void Sample () throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Santhanam\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.samsung.com/in/");
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		WebElement A = driver.findElement(By.xpath("//a[@data-engname='tv and av']"));
		a.moveToElement(A).perform();
		
		Thread.sleep(2000);
		WebElement B = driver.findElement(By.xpath("//a[@data-engname='tv and av:tvs']"));
		a.moveToElement(B).perform();
		
		Thread.sleep(2000);
		WebElement C = driver.findElement(By.xpath("//a[@an-ac='mobile:featured:galaxy z fold3 5g']"));
		a.moveToElement(C).perform();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='cookie-bar__close cookie-bar__main-close']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='product-card-v2__name-link']")).click();
	
		Thread.sleep(2000);
		WebElement b = driver.findElement(By.id("delivery-zipcode"));
		b.sendKeys("600031");
		b.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		WebElement c = driver.findElement(By.xpath("(//a[@data-sku-code='65QN700A'])[1]"));
		c.click();
		
	}
		public static void main(String[] args) throws InterruptedException, IOException {
			Sample ();
	}
}










