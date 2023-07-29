package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownAndUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/");

		driver.manage().window().maximize();
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		//ScrollDown
		Js.executeScript("window.scrollBy, (0,9000)","");
		
		Thread.sleep(3000);
		
		//ScrollUp
		Js.executeScript("window.scrollBy, (0,-2000)","");
	
	}
	
}
