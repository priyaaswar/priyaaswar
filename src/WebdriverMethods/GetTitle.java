package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		
	       System.setProperty("webdriver.crome.driver",
			           "\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
			
			WebDriver driver = new ChromeDriver();
			
	driver.get("https://www.amazon.com/");
	
	String Title = driver.getTitle();
	
	System.out.println(Title);
	
	driver.close();
	}	
}
