package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait2 {
   
	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      
    	String	URL = "https://www.w3schools.com/";

		driver.manage().window().maximize();
	
	   driver.get(URL);
	
	driver.findElement(By.id("search2")).sendKeys("Automation"); 
	driver.findElement(By.id("learntocode_searchbtn1")).click();  
	
    driver.quit();	
	}
}
