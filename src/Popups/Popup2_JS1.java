package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2_JS1 {

	public static void main(String[] args) throws InterruptedException {
	
		// Javascript alert & confirmation popup
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	  WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		Thread.sleep(4000);
		
//		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();  //used to click 'Cancel' button
		Thread.sleep(3000);
		
	  Boolean text = driver.findElement(By.xpath("//p[@style=\"color:green\"]")).isDisplayed();
		
		System.out.println(text);
		driver.quit();	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
