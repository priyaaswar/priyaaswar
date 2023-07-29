package FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement1 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	  WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		//1.
	WebElement SearchBox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		
		SearchBox.sendKeys("Iphone");
		Thread.sleep(3000);
		
    WebElement Links = driver.findElement(By.xpath("//a[@class=\"nav-a  \"]"));	
	System.out.println(Links.getText());	
		
	
    WebElement Links1 = driver.findElement(By.xpath("//a[@class=\"navv-a  \"]"));	
	System.out.println(Links.getText());	
			
	driver.close();	
	}	
}
