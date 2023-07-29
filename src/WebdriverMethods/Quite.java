package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quite {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index/php/auto/login");

		driver.manage().window().maximize();
		Thread.sleep(7000);

		driver.findElement(By.xpath(" //a[]contains(text(),'OrangeHRM,Inc')]")).click();
		Thread.sleep(7000);
		driver.quit();
	}
}
