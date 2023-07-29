package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	WebDriver driver = new ChromeDriver();

	driver.get("https://demo.automationtesting.in/Frames.html");
		
	driver.manage().window().maximize();
		
		driver.switchTo().frame("singleframe");
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Automation");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		
		Thread.sleep(4000);
		
		
		
		
		
		
	driver.close();	
	}
	
}
