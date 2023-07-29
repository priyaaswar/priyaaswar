package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyIndex {
	
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.crome.driver",
	           "\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
	
	WebDriver driver = new ChromeDriver();
	 
	driver.manage().window().maximize();

	driver.get("https://www.amazon.in/");
	
	//syntax for index-- driver.findelement(By xpath("expresion[index]"));
	
	driver.findElement(By.xpath("//a[@class=\"nav-a  \"][3]")).click();
	
	
	
	Thread.sleep(5000);
	driver.quit();
}
}
