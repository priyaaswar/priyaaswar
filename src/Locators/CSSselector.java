package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.crome.driver",
	           "\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
	
	      WebDriver driver = new ChromeDriver();
		
	     driver.get("https://app.hubspot.com/login");
	
	     driver.manage().window().maximize();
	
	     // 1. ID ---we use # and id value
	  //  driver.findElement(By.cssSelector("#username")).sendKeys("gaurav123@gmail.com"); 
	   // Thread.sleep(4000); 
	    
	  //   driver.findElement(By.cssSelector("#password")).sendKeys("030989");
	     
	   //  driver.findElement(By.cssSelector("#loginBtn")).click();
	     
	    // 2. Tagname and Id ---we use tagname and # Id value 
	     
	     driver.findElement(By.cssSelector("input#username")).sendKeys("priu@123");
	     
	     driver.findElement(By.cssSelector("input#password")).sendKeys("101092");
	     
	     driver.findElement(By.cssSelector("button#loginBtn")).click();
	     
	     // 3. driver.findElement(By.cssSelector("[name=email]")).sendKeys("Test123");
//			driver.findElement(By.cssSelector("[name=pass]")).sendKeys("1234");
//			
	//Tagname and Attribute
//	driver.findElement(By.cssSelector("input[name=email]")).sendKeys("123");
//	driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("1234");
//	Thread.sleep(5000);		
	//tag inputtext and attribute		
//	driver.findElement(By.cssSelector("input.inputtext[data-testid=\"royal_email\"]")).sendKeys("12345");
//	
//	driver.findElement(By.cssSelector("input.inputtext[data-testid=\"royal_pass\"]")).sendKeys("1234");
//	
//	driver.findElement(By.cssSelector("input.inputtext[class=\"inputtext _55r1 _6luy\"]")).sendKeys("12345");
//	
//	driver.findElement(By.cssSelector("input.inputtext[class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("1234");
//			
	driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("RRR@gmail.com");
	
	driver.findElement(By.cssSelector("input.form-control.private-form__control.login-password.m-bottom-3")).sendKeys("1234");

	driver.findElement(By.cssSelector("button.uiButton.private-button.private-button--primary.private-button--default.m-bottom-4.login-submit.private-button--non-link")).click();
	Thread.sleep(3000);	
	driver.close();
}
}
	     
	     
	     
