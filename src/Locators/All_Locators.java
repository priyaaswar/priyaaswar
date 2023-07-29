package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Locators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/?.intl=in");

		driver.manage().window().maximize();

		// 1. X-path
	   driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Priya@12345");
	   driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

		// 2. ID
//		driver.findElement(By.id("login-username")).sendKeys("Priya@12345");
//		driver.findElement(By.id("login-signin")).click();		

		// 3.Name
//		driver.findElement(By.name("username")).sendKeys("Priya@12345");
//		driver.findElement(By.name("signin")).click();

		// 4.Classname
//		driver.findElement(By.className("phone-no")).sendKeys("Priya@1234");
//		driver.findElement(By.className("pure-button")).click();		

		// 5.CssSelector
//		driver.findElement(By.cssSelector("#login-username")).sendKeys("Priya@1234");
//		driver.findElement(By.cssSelector("#login-signin")).click();

		// 6.LinkText
//		driver.findElement(By.linkText("Forgotten username?")).click();

		// 7.partialLinkText
//		driver.findElement(By.partialLinkText("Forgotten")).click();

		// 8. Tagname

		Thread.sleep(2000);
		driver.close();
	}

}
