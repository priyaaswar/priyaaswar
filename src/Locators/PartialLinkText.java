package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
		           "\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		 
		      driver.get("https://www.facebook.com/");
		
		    driver.manage().window().maximize();
		
		//driver.findElement(By.partialLinkText("Create")).click();
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}
}
