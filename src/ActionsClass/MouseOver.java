package ActionsClass;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	  WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
          WebElement Account=driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		
	    Actions act = new Actions(driver);
		
		act.moveToElement(Account).build().perform();
		
		driver.findElement(By.xpath("(//span[contains(text(),'Sign in') and @class=\"nav-action-inner\"])[1]")).click();
		
		driver.findElement(By.xpath("//span[@class=\"nav-action-inner\"]")).click();
		
		driver.findElement(By.id("ap_email")).sendKeys("Velocity@gmail.com");
		
		driver.findElement(By.id("continue")).click();		
		
		driver.findElement(By.id("ap_password")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class=\"a-list-item\"]")).isDisplayed();
		
		System.out.println();
		
	driver.quit();	
	}
}
