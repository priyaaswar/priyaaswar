package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {

	public static void main(String[] args) {
		
		//get method use to open appl. or to enter URL on web browser
		
		//1. step 
		
		System.setProperty("webdriver.crome.driver","\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
		//2.step 2
		
	WebDriver driver = new ChromeDriver();
	
	//3. step
	
	driver.get("https://www.irctc.co.in");
		
	}
	
}
