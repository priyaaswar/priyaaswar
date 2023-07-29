package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstProgram {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver","\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();	
		
		//system---- class  name
		//setproperty-- method name
		//webdriver-- version of selenium
		//chrome-- name of browser
		//driver -- browser
		// 2. values -- path of chromdriver.exe file
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.manage().window().getSize());
		
		 driver.manage().window().maximize();
		 
		Thread.sleep(7000);
		driver.close();

		
		
		
	}
	
}
