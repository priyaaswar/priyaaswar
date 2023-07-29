package Apache_POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Data1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//to fetch data form excel sheet
		FileInputStream file = new FileInputStream("C:\\Users\\gaura\\Downloads\\Untitled spreadsheet (1).xlsx");
		
		String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(3).getCell(0).getStringCellValue();
		
		System.out.println(data);
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
		
	driver.manage().window().maximize();
	
	driver.findElement(By.id("email")).sendKeys(data);
		
    driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
		
	driver.quit();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
