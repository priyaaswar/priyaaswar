   package ListBox;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotLogo {

   public static void main(String[] args) throws IOException {
	
	   System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
    WebElement Facebooklogo	= driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	String Random = "Facebooklogo";
	File Dest = new File("C:\\Users\\gaura\\eclipse-workspace\\March 11\\Screenshot");
	
	FileHandler.copy(source, Dest);
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 
	
	
