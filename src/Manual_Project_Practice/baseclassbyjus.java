package Manual_Project_Practice;

	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class baseclassbyjus {
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("WebDriver.chrome.driver",
					"\"D:\\INSTALLER FILE\\chromedriver_win32 (1)\\chromedriver.exe\"");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			registerpage rp = new registerpage(driver);
			rp.url();
			rp.user();
			rp.mobile();
			rp.button();
			Thread.sleep(20000);
			rp.email();
			rp.state();
			rp.click1();
			rp.selectclass();
			rp.click1();
			Thread.sleep(5000);
			rp.topic();
			rp.time();
			rp.conform();
			Thread.sleep(10000);
			rp.anil();
			rp.profile();

			byjusprofilepage profilepage = new byjusprofilepage(driver);
			profilepage.date();
			Thread.sleep(8000);
			profilepage.save();

		}

	}
	

