package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		//1. contains by attribute
//		driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")).click();
		
		//2.start-with
		//id="u_0_5_y9"
		
		driver.findElement(By.xpath("//button[start-with(@id,'u_0_5_')]")).click();	
		
		//3.ends-with
//		driver.findElement(By.xpath("//button[ends-with(@id,'u_0_5_')]")).click();	
		
	Thread.sleep(3000);	
	driver.close();	
	}
}
