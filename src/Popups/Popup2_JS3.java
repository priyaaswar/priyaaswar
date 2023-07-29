package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2_JS3 {

	public static void main(String[] args) throws InterruptedException {
	
		// Javascript alert & confirmation popups
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	  WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Thread.sleep(4000);
		
	   Alert text = driver.switchTo().alert();
		
		System.out.println(text.getText());
		Thread.sleep(4000);

	   text.sendKeys("Velocity");
		Thread.sleep(2000);
		text.accept();
	}
}
	
	