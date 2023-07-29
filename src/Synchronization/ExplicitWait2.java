package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	private static final ExpectedConditions ExepectedConditions = null;

	public static void main(String[] args) {
	
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
	    	WebDriver driver = new ChromeDriver();
		
          driver.get("https://www.redbus.in/");
      
          WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(20));
          
          WebElement element=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));
          
          By input1= By.id("src");
          
          Waitforelement(driver,input1,20).sendKeys("pune");
          
          By input2 = By.id("dest");
          
          Waitforelement(driver,input2,10).sendKeys("Mumbai");     
	}

	public static WebElement Waitforelement(WebDriver driver, By Locator, int timout) {
	
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(timout));
		
		mywait.until(ExepectedConditions.presenceOfElementLocated(Locator));
		
		return driver.findElement(Locator);
	}

}
