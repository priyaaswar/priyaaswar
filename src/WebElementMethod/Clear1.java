package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
		           "\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Priu@2345");
		Thread.sleep(4000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(4000);
		
		driver.findElement(By.id("pass")).sendKeys("gau23455");
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		
	Thread.sleep(5000);
	driver.close();
	}
}
