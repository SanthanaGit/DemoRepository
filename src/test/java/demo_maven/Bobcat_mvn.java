package demo_maven;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Bobcat_mvn {
	
		static String y = null; 
		static String z = null; 
	public static void Sample() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhanam\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bobcat.com/in/en/index");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='btn accept']")).click();
//		Actions a = new Actions(driver);
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Backhoe Loaders'])[1]")).click();
		
		Thread.sleep(3000);
		WebElement A = driver.findElement(By.xpath("//div[text()='Bobcat B900 CEV Stage IV Backhoe Loader']"));
		String text = A.getText();
		System.out.println(text);
		
		Thread.sleep(3000);  
		driver.findElement(By.xpath("//a[text()='Loaders'])[1]")).click();
		Thread.sleep(2000);
		List<WebElement> B = driver.findElements(By.xpath("//div[@class='product-family']"));
		for (WebElement webElement : B) {
			y = webElement.getText();
			System.out.println(y);
		}
		
		Thread.sleep(3000);  
		driver.findElement(By.xpath("//a[text()='Compact Excavators'])[1]")).click();
		Thread.sleep(2000);
		List<WebElement> C = driver.findElements(By.xpath("//div[@class='h5 dtm-pro-grp-lst-name']"));
		for (WebElement webElement : C) {
			z = webElement.getText();
			System.out.println(z);	
		}
		
		
		
	}	
		public static void main(String[] args) throws InterruptedException, IOException {
			Sample ();
	
	}
}
