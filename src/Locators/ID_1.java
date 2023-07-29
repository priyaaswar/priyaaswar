package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.crome.driver",
		           "\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		//syntax (for id)-- driver.findelement(By.id("id value"));
		
		driver.findElement(By.id("email")).sendKeys("Priynka");
		
		driver.findElement(By.id("pass")).sendKeys("priya1234");
		
	
		Thread.sleep(4000);
		driver.quit();
	}
}
