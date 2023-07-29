package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownAndUPTilBottom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/");

		driver.manage().window().maximize();
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		//ScrollDown
		Js.executeScript("window.scrollBy, (0,document.body.scrollHight)","");
		
		Thread.sleep(3000);
		
		//ScrollUp
		Js.executeScript("document.documentElement.scrollTop=0","");
		
	}
	
}
