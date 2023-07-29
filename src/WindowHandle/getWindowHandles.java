package WindowHandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	  WebDriver driver = new ChromeDriver();

		driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Thread.sleep(3000);
			
		Set<String> WindowID = driver.getWindowHandles();
		//used to store all open windows ID
		
		//first Way
		Iterator <String> It = WindowID.iterator();
		
		String ParentWindow = It.next();
		String ChildWindow = It.next();
		
		System.out.println(ParentWindow);
		System.out.println(ChildWindow);
		//A868D34E3E18D03FFC132E1A2072AA68
		//284152EBABE2097D273191108546A85B

		//second Way
		List<String> WindowList = new ArrayList(WindowID);
		
		String Parent = WindowList.get(0);
		String Child = WindowList.get(1);
		
		System.out.println(Parent);
		System.out.println(Child);
		
		// How to switch selenium focus on child window
		driver.switchTo().window(ParentWindow);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(ChildWindow);
		System.out.println(driver.getTitle());
	driver.quit();	
	}
	
}
