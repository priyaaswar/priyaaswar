package Assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Assignment2 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");

		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//randomly store imanges
				String Random = RandomString.make(3);
				String Image = "Login to Kite";
				
				File Desti = new File("C:\\Users\\gaura\\eclipse-workspace\\March 11\\Screenshot\\ "+Image+" "+Random+".jpg");
				
				FileHandler.copy(source, Desti);
				driver.close();
				
	driver.quit();	
	}
	
}
