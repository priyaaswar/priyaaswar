package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2_JS {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	  WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
	// Javascript alert & confirmation popup
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();  //used to click on 'OK' button
		
	  Boolean text = driver.findElement(By.xpath("//p[@style=\"color:green\"]")).isDisplayed();
		
		System.out.println(text);
		driver.quit();	
	}
	
}
