package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopups {

	public static void main(String[] args) throws InterruptedException {
		
	ChromeOptions option = new 	ChromeOptions();
		
      option.addArguments("--disable-notifications");
	// Javascript alert & confirmation popups
			System.setProperty("webdriver.crome.driver",
					"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		  WebDriver driver = new ChromeDriver(option);

			driver.get("https://www.hdfcbank.com/");
			
			driver.manage().window().maximize();
			
		Thread.sleep(3000);
		
		driver.quit();	
	}
	
}
