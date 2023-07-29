package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement input1 = driver.findElement(By.id("email"));
		WebElement input2 = driver.findElement(By.id("pass"));
		Thread.sleep(2000);
		input1.sendKeys("Velocity");

		Actions act = new Actions(driver);

		// CTRL+A
		// act.KeyDown(Keys.CONTROL); for windowusers
		act.keyDown(Keys.COMMAND);
		act.sendKeys("Demo");
		act.keyUp(Keys.COMMAND);
		act.build().perform();
		// same for ctrl-c and ctrl-v

		// compare text
		if (input1.getAttribute("value").equals(input2.getAttribute("value"))) {
			System.out.println("correct copied");
		} else {
			System.out.println("Incorrect copied");
		}

	}

}
