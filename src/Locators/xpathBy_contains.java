package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathBy_contains {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
		           "\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();

		driver.get("https://facebook.com/");
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("piu342@gamil");
		
		driver.findElement( By.xpath("//input[@name=\"pass\"]")).sendKeys("236548699");
		
		driver.findElement( By.xpath("//a[text()=\"Forgot password?\"]")).click();
		
		//driver.findElement( By.xpath("//input[contains(@ name,'mail')]")).click();
				
	Thread.sleep(4000);
	driver.close();
}	
}
