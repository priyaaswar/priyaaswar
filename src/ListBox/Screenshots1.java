package ListBox;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots1 {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		// take screenshot and copy object

		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File Destination = new File("C:\\Users\\gaura\\Desktop\\Screenshots\\.jpg");

		FileHandler.copy(source,Destination);
		driver.quit();

	}

}
