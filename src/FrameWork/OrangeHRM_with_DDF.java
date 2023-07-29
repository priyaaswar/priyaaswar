package FrameWork;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_with_DDF {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https:opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Enter username
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		//password
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String username = "PaulHimnshuJain Collin";
		String name = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
		
		System.out.println(name);
		if(username.equals(name)) {
			System.out.println("correct name");
		}else {
			System.out.println("incorrect username or pass");
		}

	}

}
