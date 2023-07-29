package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
		
	driver.manage().window().maximize();
		
//  driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
	driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
  Thread.sleep(10000);
		
   driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("Priyanka");
		
  driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Aswar");
		
  driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("Priyanka@1234");
		
  driver.findElement(By.xpath("//input[@type=\"password\" and @class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("gggggg");
	
  WebElement Day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		
  WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));	
		
  WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));	
		
		String DOB = "10/Oct/2022";
		
		String [] Date = DOB.split("/");
		// 0=10, 1=10, 2=2022 
		
		ListBox(Day,Date[0]);
		ListBox(month,Date[1]);
		ListBox(year,Date[2]);
			
	Thread.sleep(4000);	
	driver.close();	
	}

	private static void ListBox(WebElement element, String Text) {
	
		Select select1 = new Select(element);
		select1.selectByVisibleText(Text);
		
	}
	
}
