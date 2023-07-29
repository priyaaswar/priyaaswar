package WindowHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	  WebDriver driver = new ChromeDriver();

		driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
		
		driver.manage().window().maximize();
			
		String WindowID = driver.getWindowHandle();
		// used to get the ID of browser Window
		// FEC233BB4163BB12C88C939F2E1BFF04
         System.out.println(WindowID);	
           
	}
	
}
