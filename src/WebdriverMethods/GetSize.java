package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class GetSize {
	
		public static void main(String[] args) throws InterruptedException {
			
	       System.setProperty("webdriver.crome.driver",
			           "\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
			
			WebDriver driver = new ChromeDriver();
			
			Thread.sleep(5000);
			 
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.com/");
			
			Thread.sleep(7000);
			
			System.out.println(driver.manage().window().getSize());
			
			driver.close();
	
		}	
}
