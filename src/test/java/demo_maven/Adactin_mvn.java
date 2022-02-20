//package demo_maven;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.text.SimpleDateFormat;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.DateUtil;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Adactin_mvn {
//
//	public static String readExcel(int a, int b) throws Exception {
//		String value = null;
//		File f = new File("C:\\Users\\Santhanam\\eclipse-workspace\\Maven_Sample\\Excel\\New Excel.xlsx");
//		FileInputStream fis = new FileInputStream(f);
//		Workbook wb = new XSSFWorkbook(fis);
//		Sheet sh = wb.getSheet("Sheet1");
//		Row row = sh.getRow(a);
//		Cell cell = row.getCell(b);
//		int cellType = cell.getCellType()
//		if (cellType == 1) {
//			value = cell.getStringCellValue();
//			System.out.println(value);
//			
//		}
//		if (cellType == 0) {
//			
//			if (DateUtil.isCellDateFormatted(cell)) {
//				
//				SimpleDateFormat fs = new SimpleDateFormat("dd-MM-YYYY");
//				 value = fs.format(cell.getDateCellValue());
//				System.out.println(value);
//			} else {
//				double numericCellValue = cell.getNumericCellValue();
//				
//				long l = (long) numericCellValue;
//				 value = String.valueOf(l);
//				System.out.println(value);
//			}
//		}
//		return value;
//	}
//
//	public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Santhanam\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://adactinhotelapp.com/");
//		driver.manage().window().maximize();
//		
//		Thread.sleep(3000);
//		WebElement user = driver.findElement(By.id("username"));
//		user.sendKeys("santhana1");
//		
//		Thread.sleep(2000);
//		WebElement pass = driver.findElement(By.id("password"));
//		pass.sendKeys("1234567890");
//		
//		Thread.sleep(2000);
//		WebElement login = driver.findElement(By.id("login"));
//		login.click();
//		
//		Thread.sleep(3000);
//		WebElement Location = driver.findElement(By.id("Sydney"));
//		SelectByVisibleText("readExcel(0,1)");
//		
//		
//		
//	}
//
//	private static void SelectByVisibleText(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//		
//}
//
//
//
//
