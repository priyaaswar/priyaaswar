package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class containbyAttribute {
	
 public static void main(String[] args) throws InterruptedException {
	
	 System.setProperty("webdriver.crome.driver",
	           "\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
	
	WebDriver driver = new ChromeDriver();
	 
	driver.manage().window().maximize();

	driver.get("https://facebook.com/");
	
	// contains by attribute
	driver.findElement(By.xpath("//input[contains(@type,\"text\")]")).sendKeys("Priyanka");
	
	driver.findElement( By.xpath("//input[contains(@type,\"password\")]")).sendKeys("23658");
	
	driver.findElement(By.xpath("//button[contains(@class,\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\")]")).click();
	
	Thread.sleep(4000);
	driver.close();
}
}
