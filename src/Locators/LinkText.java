package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.crome.driver",
	           "\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
	
	WebDriver driver = new ChromeDriver();
	 
	      driver.get("https://www.facebook.com/");
	
	    driver.manage().window().maximize();
	
	//driver.findElement(By.linkText("Forgot password?")).click();
	
	driver.findElement(By.linkText("Create a page")).click();
	
	Thread.sleep(4000);
	driver.close();
}
}
