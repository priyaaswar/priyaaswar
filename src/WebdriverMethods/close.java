package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class close { 
	
  public static void main(String[] args) throws InterruptedException  {
  //Close -- to close current open browser
	  
	//1. step 
		
			System.setProperty("webdriver.crome.driver","\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
			//2.step 2
			
		WebDriver driver = new ChromeDriver();
		
		//3. step
		
		driver.get("https://www.irctc.co.in");
			
		Thread.sleep(5000);
		driver.close();		
		}
		
	}

	  

	
	
	
	

