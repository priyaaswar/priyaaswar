package PageObject_WithoutDDF;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_or_Testclass {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		LoginPage LP = new LoginPage(driver);
		
		LP.GoTo();
		LP.username("Admin");
		LP.password("admin123");
		LP.login();
		
	DashboardPage DP = new	DashboardPage(driver);
		DP.Namevalidation();
		DP.TimeAt();
	}
	
}
