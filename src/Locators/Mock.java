package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
		           "\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name=\"email\"] ")).sendKeys("kdflkejri");
		
		 driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("123654");
		
		Thread.sleep(4000);
		driver.close();
		
		
	}	
}
