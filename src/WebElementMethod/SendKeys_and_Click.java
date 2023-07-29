package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_and_Click {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
		           "\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		// 1. SendKeys
	    driver.findElement(By.id("email")).sendKeys("Gaurav123");
		driver.findElement(By.id("pass")).sendKeys("03091989");
		
		//2. Click
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
			
	Thread.sleep(5000);	
	driver.close();	
	}
	
}
