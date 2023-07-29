package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalRight {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://blog.hubspot.com/webside/horizontal-scrolling");
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		//scrolldown
		Js.executeScript("window.scrollBy(1000,0)", "");
		
		Thread.sleep(3000);
		
		//scrollUp
		Js.executeScript("window.scrollBy(-2000,0)", "");
	
	}

}
