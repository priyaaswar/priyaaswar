package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups2_JS4 {

	public static void main(String[] args) throws InterruptedException {
		
		// Javascript alert & confirmation popups
				System.setProperty("webdriver.crome.driver",
						"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

			  WebDriver driver = new ChromeDriver();

				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				
				driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("Welcome");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		String Expectedmsg = "Please enter your password";
		
	   Alert alert=driver.switchTo().alert();
		
		String Alertmsg = alert.getText(); 
		
		if(Expectedmsg.equals(Alertmsg))
			System.out.println("correct alert msg");
		else
		System.out.println("Incorrect alert msg");
		
		Thread.sleep(3000);
	    alert.accept();
	}
	
}
