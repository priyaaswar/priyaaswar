package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsolutePath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
		           "\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("/html/body/div//div/div[2]/from/div/[3]/div/div/div/input")).sendKeys("ppppp");
		
		driver.findElement(By.xpath("/html/body/div//div/div[2]/from/div/[4]/div/div/div/input")).sendKeys("123654");
		Thread.sleep(4000);
		driver.close();
	}
	
}
