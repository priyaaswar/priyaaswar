package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
		           "\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("piu");
		
		 driver.findElement(By.id("pass")).sendKeys("1010199");
		 
		// driver.findElement(By.id("u_0_5_nb")).click(); ----dynamic variable
		
		 driver.findElement(By.xpath("//button[contains(@id,\"u_0_5\")]")).click();
		 
		Thread.sleep(7000);
		driver.quit();
	}

}
