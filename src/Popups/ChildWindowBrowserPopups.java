package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class ChildWindowBrowserPopups {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	  WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
	  
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'click')])[2]")).click();
		
	    String ParentWindow =driver.getWindowHandle();
		System.out.println(ParentWindow);
       
	String SetChildWindow = driver.getWindowHandle();
		
		
		
		
		
	driver.close();	

         
	}      
}
