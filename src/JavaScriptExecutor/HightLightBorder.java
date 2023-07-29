package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HightLightBorder {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement Element =driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		
		WebElement Element1=driver.findElement(By.id("email"));
		
		Js.executeScript("arguments[0].style.border='15px solod red'", Element);
//		Js.executeScript("argumrnts[0].style.border='5px solid yellow'", Element1);
		
	}

}
