package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopus {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	  WebDriver driver = new ChromeDriver();

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//admin: admin1 is a value of pass and id(anything we can put)
		
		driver.manage().window().maximize();
		
	String Text	=driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials')]")).getText();
	System.out.println(Text);	
		Thread.sleep(3000);
		driver.quit();	
	}
	
}
