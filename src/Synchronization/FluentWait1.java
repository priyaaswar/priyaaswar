package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWait1 {

	public static void main(String[] args) {
		//1st step
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
//2nd
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//3rd
		driver.manage().window().maximize();

		String URL = "https://www.facebook.com/";
		driver.get(URL);
		
		//fluent wait 
		
		Wait <WebDriver> MyWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(4)).ignoring(NoSuchElementException.class);
		
		//usages of fluent wait
		WebElement Element = MyWait.until(new Function<WebDriver,WebElement>(){
			
		public WebElement apply(WebDriver driver) {
			
			return driver.findElement(By.id("email"));
		}	
			
		});
		Element.sendKeys("Velo1234");
	}
	
}
