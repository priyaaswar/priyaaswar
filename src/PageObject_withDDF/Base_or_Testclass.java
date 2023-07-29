package PageObject_withDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject_WithoutDDF.DashboardPage;
import PageObject_WithoutDDF.LoginPage;

public class Base_or_Testclass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		LoginPage LP = new LoginPage(driver);
	// to fatch data from excelsheet
		
		String path = "C:\\Users\\gaura\\eclipse-workspace\\Selenium\\ReadData\\FrameWork1.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
		
            LP.GoTo();
           String userID = data.getRow(1).getCell(1).getStringCellValue();
           LP.username(userID);
           
           String pass = data.getRow(1).getCell(1).getStringCellValue();
           LP.password(pass);
           LP.login();
           
           DashboardPage DP = new	DashboardPage(driver);
   	     	DP.Namevalidation();
   	     	DP.TimeAt();
   	       
	}

}
