package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
		           "\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	 WebElement username = driver.findElement(By.id("email"));
		
		username.sendKeys("piu@2346");
		Thread.sleep(3000);
		username.clear();
		Thread.sleep(3000);
		
	WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("gau3456");
		Thread.sleep(3000);
		password.clear();
		Thread.sleep(3000);
		
		
		
		
		
	}
	
}
