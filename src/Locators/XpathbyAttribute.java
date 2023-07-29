package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathbyAttribute {
	
	public static void main(String[] args) throws InterruptedException {
		
	       System.setProperty("webdriver.crome.driver",
			           "\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
			
			WebDriver driver = new ChromeDriver();
			 
			driver.manage().window().maximize();


			driver.get("https://facebook.com/");
			
			//driver.findElement(By.xpath("//input[@class=\\\"inputtext _55r1 _6luy\"]")).sendKeys("priya@gmail.com");
			
			driver.findElement (By.xpath("//input[@id=\"email\"]")).sendKeys("priya123@gmail.com");
			
			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("12345678");
			
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
					
	Thread.sleep(4000);
	driver.close();
	
	}	
}
