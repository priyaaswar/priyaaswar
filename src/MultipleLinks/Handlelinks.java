package MultipleLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlelinks {

public static void main(String[] args) {
	
	System.setProperty("webdriver.crome.driver",
			"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();

	driver.get("https://www.amazon.in/");
	
	List <WebElement> Links = driver.findElements(By.tagName("a"));
	System.out.println("No. of links--->"+Links.size());
	
	for(WebElement link : Links) {
		
		System.out.println(link.getText());
		System.out.println(link.getAttribute("href"));
	}
	driver.quit();
}	
	
}
