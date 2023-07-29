package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("WebDriver.chrome.Driver", "\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.switchTo().frame("frame1");
		
		String text=driver.findElement(By.xpath("//h1[contains(text(),'This is a sample page')]")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		Thread.sleep(4000);

	}	
}
