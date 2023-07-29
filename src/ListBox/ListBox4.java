package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox4 {

	private static int i;
	private static int j;
	private static int k;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
//	driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Priyanka");

		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Aswar");

		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("Priyanka@1234");

		driver.findElement(By.xpath("//input[@type=\"password\" and @class=\"inputtext _58mg _5dba _2ph-\"]"))
				.sendKeys("gggggg");

		WebElement Day = driver.findElement(By.xpath("//select[@id=\"day\"]"));

		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));

		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));

		// Que 1.
		// How will u print all values? -- present in the list

		Select S1 = new Select(Day);
		List<WebElement> D1 = S1.getOptions();
		System.out.println("Total days--->" + D1.size());

		// Que 2.
		// How will u print all values?
		for (int i = 0; i < D1.size(); i++) {

			String DV = D1.get(i).getText();

			System.out.println(DV);
		}
		// Que .3
		// How will u select specific value from dropdown?
		if (D1.equals("15")) {
			D1.get(i).click();
		}
		// select month
		// month values
		Select S2 = new Select(month);
		List<WebElement> D2 = S2.getOptions();
		System.out.println("Total month--->" + D2.size());

		System.out.println();

		// month all value print
		for (int j = 0; j < D2.size(); j++) {

			String DV1 = D2.get(j).getText();
			System.out.println(DV1);
		}
		// specific month
		if (D2.equals("oct")) {
			D2.get(j).click();

			// for year
			Select S3 = new Select(year);
			List<WebElement> D3 = S3.getOptions();
			System.out.println("Total year--->" + D3.size());

			// Que 2.
			// How will u print all values?
			for (int k = 0; k < D3.size(); k++) {

				String DV3 = D3.get(k).getText();

				System.out.println(DV3);
			}
			// Que .3
			// How will u select specific value from dropdown?
			if (D3.equals("2021")) {
				D3.get(k).click();

				Thread.sleep(4000);
				driver.close();
			}

		}
	}
}
