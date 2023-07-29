package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
	    	WebDriver driver = new ChromeDriver();
		
          driver.get("https://www.redbus.in/");
      
		WebDriverWait MyWait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		WebElement element = MyWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));
		
		element.sendKeys("Nagpur");
		
		WebDriverWait MyWait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
		
	WebElement	element1= MyWait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("dest")));
		
		element1.sendKeys("Mumbai");
	}

}
