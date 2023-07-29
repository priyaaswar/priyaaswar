package Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	  WebDriver driver = new ChromeDriver();

		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String WindowID = driver.getWindowHandle();
		
		System.out.println(WindowID);
		
		driver.findElement(By.xpath("//a[@target=\"_blank\"]")).click();
		Thread.sleep(3000);
		
		Set<String> Window = driver.getWindowHandles();
		
		Iterator <String> It = Window.iterator();
		
		String ParentWindow = It.next();
		String ChildWindow = It.next();
		
		System.out.println(ParentWindow);
		System.out.println(ChildWindow);
		
		driver.switchTo().window(ParentWindow);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(ChildWindow);
		System.out.println(driver.getTitle());
	
	driver.quit();	
	}
	
}
