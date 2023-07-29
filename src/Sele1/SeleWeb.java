package Sele1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleWeb {
	
public static void main(String[] args) {
	

	
	
	
	System.setProperty("webDriver.chrome.driver","\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
}
}