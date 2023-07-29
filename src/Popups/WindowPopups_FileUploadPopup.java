package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopups_FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	  WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
	  
		driver.get("https://the-internet.herokuapp.com/upload");
		
	driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("C:\\Users\\gaura\\Downloads\\StudentInfo.xlsx");
		driver.findElement(By.id("file-submit")).click();
	
		Thread.sleep(4000);
	driver.findElement(By.xpath("//h3[contains(text(),'File Uploaded')]")).isDisplayed();	
	driver.quit();
	}
	
}
