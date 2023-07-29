package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement username =driver.findElement(By.id("email"));
		WebElement password =driver.findElement(By.id("pass"));
	
		JavascriptExecutor Js = (JavascriptExecutor)driver;	
		
		
		//2nd way
			Js.executeScript("arguments[0].value='"+"Priya"+"';", username);
			Js.executeScript("arguments[0].value='"+"123456"+"';", password);
		
          WebElement loginbutton = driver.findElement(By.xpath("//button[@name=\"login\"]"));		
		
		Js.executeScript("arguments[0].click()", loginbutton);
	
	}

}
