package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
		
	driver.manage().window().maximize();
		
   driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
  Thread.sleep(10000);
		
  driver.findElement(By.xpath("//input[@class=\"inputtext_58mg_5dba_2ph-\"]")).sendKeys("Priyanka");
	
  driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Aswar");
		
  driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("Priyanka@1234");
		
  driver.findElement(By.xpath("//input[@type=\"password\" and @class=\"inputtext_58mg_5dba_2ph-\"]")).sendKeys("gggggg");
		
      WebElement Day = driver.findElement(By.id("day"));
		
       WebElement month = driver.findElement(By.id("month"));
		
       WebElement year = driver.findElement(By.id("year")); 
		
		//Select select1 = new Select(Day);      //object of select cls
		
		// 1.select By Visible Text(String text)
       
		Select select1 = new Select(Day);  
	    select1.selectByVisibleText("10");
		
		Select select2 = new Select(month);
		select2.selectByVisibleText("October");
		
		Select select3 = new Select(year);
		select3.selectByVisibleText("2022");  
		
		// 2. select by value
		Select select4 = new Select(Day);
		select4.deselectByValue("6");
		
		Select select5 = new Select(month);
		select5.deselectByValue("8");
		
		Select select6 = new Select(year);
		select6.selectByValue("2015");   
		
		//3.select by index
		Select select7 = new Select(Day);
		select7.selectByIndex(5);
		
		Select select8 = new Select(month);
		select8.selectByIndex(4);
		
		Select select9 = new Select(year);
		select9.selectByIndex(2011);
		
	driver.quit();
	}
	
}
