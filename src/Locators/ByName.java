package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByName {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.crome.driver",
		           "\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.name("username")).sendKeys("student");
		
		driver.findElement(By.name("password")).sendKeys("Password123");
		
		driver.findElement(By.id("submit")).click();
		
	Thread.sleep(6000);	
	driver.quit();	
	}
	
}
