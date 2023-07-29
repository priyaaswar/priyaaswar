package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.crome.driver",
			"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
	Thread.sleep(10000);
	
	driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
	
	
    boolean Button =driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
	
	System.out.println(Button);
	
	Boolean B1 =driver.findElement(By.xpath("//input[@type=\"radio\"])[2]")).isSelected();
	
	System.out.println(B1);
	
	driver.findElement(By.xpath("//input[@type=\"radio\"])[2]")).click();
	
	Boolean B2 =driver.findElement(By.xpath("//input[@type=\"radio\"])[2]")).isSelected();
	
	System.out.println(B2);
	
    driver.quit();	
}
}
