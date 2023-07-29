package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollbyElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/");

		driver.manage().window().maximize();
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		WebElement Name = driver.findElement(By.xpath("//h1[contains(text(),'W3Schools Spaces']"));
		
		//Scrollby element
				Js.executeScript("argument[0].scrollIntoView();", Name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
