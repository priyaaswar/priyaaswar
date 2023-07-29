package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	  WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/simple-context-menu.html");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
         WebElement Double=driver.findElement(By.xpath("//button[@ondblick=\"myFunction()\"]"));
		
	    Actions act = new Actions(driver);
		
		act.moveToElement(Double).build().perform();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
	
		driver.quit();
		System.out.println();
	}
	
}
