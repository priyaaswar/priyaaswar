package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_WithoutDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		

		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https:opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Enter username
		String path = "C:\\Users\\gaura\\eclipse-workspace\\Selenium\\ReadData\\FrameWork1.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		String username = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
		
		//enter password
		FileInputStream file1 = new FileInputStream(path);
		
		String password = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
      FileInputStream file2 = new FileInputStream(path);
		
		String name = WorkbookFactory.create(file2).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
	String Uname=driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
		
		System.out.println(name);
		if(Uname.equals(name)) {
			System.out.println("correct username");
		}else {
			System.out.println("incorrect username");
		}
			

	}

}
