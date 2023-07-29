package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
		
	driver.manage().window().maximize();
		
  driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
  Thread.sleep(10000);
		
   driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("Priyanka");
		
  driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Aswar");
		
  driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("Priyanka@1234");
		
  driver.findElement(By.xpath("//input[@type=\"password\" and @class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("gggggg");
		
    driver.findElement(By.id("day")).click();
    driver.findElement(By.xpath("//option[@value=\"10\"]")).click();
    Thread.sleep(3000);	
		
    driver.findElement(By.id("month")).click();
    driver.findElement(By.xpath("//option[contains(text(),'Oct')]")).click();
    Thread.sleep(3000);	
		
	driver.findElement(By.id("year")).click();	
    driver.findElement(By.xpath("//option[contains(text(),'2010')]")).click();
	driver.findElement(By.xpath("//lable[@class=\"_9407 _5dba _9hk6 _8esg\"]")).click();	
		
driver.quit();		
	}	
}
