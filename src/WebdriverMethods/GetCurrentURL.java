package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		String URl = driver.getCurrentUrl();

		System.out.println(URl);

		if (URl.equals("https://www.amazon.com/"))
			System.out.println("correct url");
		else {
			System.out.println("incorrect url");

		}
		driver.close();
	
	}

}
