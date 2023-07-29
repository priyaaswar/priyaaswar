package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait1 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.crome.driver",
					"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
			
			WebDriver driver = new ChromeDriver();
			
          driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
          
	    	String	URL = "https://www.facebook.com/";

			driver.manage().window().maximize();
		
		   driver.get(URL);
		
		driver.findElement(By.id("email")).sendKeys("Priya@123"); //2 visible - ignore 18 sec
		driver.findElement(By.id("pass")).sendKeys("123456");   //5 -ignore 15 sec
		
	driver.quit();	
	}
}
