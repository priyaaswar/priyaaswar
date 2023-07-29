package ListBox;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
        Thread.sleep(4000);
        
	 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Desti =new File("\"C:\\Users\\gaura\\Desktop\\Screenshots\".jpg");
		
		FileHandler.copy(source, Desti);
		
		driver.quit();	
	}
}
