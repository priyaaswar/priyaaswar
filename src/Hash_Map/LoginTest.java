package Hash_Map;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginTest {

	public static HashMap<String , String> Logindata(){
		
		HashMap<String , String> HM = new HashMap<String , String>();
		HM.put("A", "Sherya:sherya1234");
		HM.put("B", "Priya:priya123");
		HM.put("C", "shilpa:shilpa234");
		HM.put("D", "kalyani:kalyani123");

		return HM;	
	}
	public static void main(String[]args) {
		
	//	WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String name = LoginTest.Logindata().get("D");
		String arr[]=name.split(":");
		
		// 0-shreya & 1 shreya1234
		
		driver.findElement(By.id("email")).sendKeys(arr[0]);
		
		driver.findElement(By.id("pass")).sendKeys(arr[1]);
		
		driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
		
		String act_title = driver.getTitle();
		
		if(act_title.equals("Log in to Facebook")) {
			System.out.println("correct title");
		}else {
			System.out.println("incorrect title");
		}
		driver.quit();	
	}
}
