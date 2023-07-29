package WebdriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPossition {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();

		Thread.sleep(5000);

		driver.get("https://www.amazon.com/");
		// Whight Hight
		Point P1 = new Point(700,300);

		driver.manage().window().setPosition(P1);
		Thread.sleep(5000);
		
		System.out.println(driver.manage().window().getPosition());

		driver.close();

	}
}
