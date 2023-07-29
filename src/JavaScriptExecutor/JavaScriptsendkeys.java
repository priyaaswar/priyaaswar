package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptsendkeys {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement username =driver.findElement(By.id("email"));
		WebElement password =driver.findElement(By.id("pass"));
	
		JavascriptExecutor Js = (JavascriptExecutor)driver;
	//sendkeys	
		Js.executeScript("document.getElementById('email').value='Priya@123';");
		Js.executeScript("document.getElementById('pass').value='123654';");
		
	//2nd way
//		Js.executeScript("arguments[0].value='"+"Priya"+"';", username);
//		Js.executeScript("arguments[0].value='"+"123456"+"';", password);
	
	}
	
}
