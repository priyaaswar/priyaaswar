package FindElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	  WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		//1.
	List<WebElement> SearchBox = driver.findElements(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
			
	 driver.findElements(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		//2.
	 List<WebElement> Links = driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));
		System.out.println(Links.size());
		
		for(WebElement ele : Links) {
			System.out.println(ele.getText());
		}
		//3.
		List<WebElement> Links1 = driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));
		
	driver.close();	
	}	
}
