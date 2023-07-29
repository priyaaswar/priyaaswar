package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		String ExpectedText = "Create a Page";
		
		String Expected = "Connect with friends and the world around you on Facebook.";
		
	String Text = driver.findElement(By.xpath("//a[@class=\"_8esh\"]")).getText();
		if(ExpectedText.equals(Text)) {
			System.out.println("correct text");
		}
		else {
			System.out.println("Incorrect text");
		}
	String Text1 = driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world' )]")).getText();		
		if(Expected.equals(Text1)) {
			System.out.println("correct");
		}
		else {
			System.out.println("Incorrect");
		}	
	Thread.sleep(5000);
    driver.close();		
	}
}
