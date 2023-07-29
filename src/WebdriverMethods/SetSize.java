package WebdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		Dimension D1 = new Dimension(800, 700);

		driver.manage().window().setSize(D1);
		Thread.sleep(5000);

		System.out.println(driver.manage().window().getSize());
		
		driver.close();

	}
}
