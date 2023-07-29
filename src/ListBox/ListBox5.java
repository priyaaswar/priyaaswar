package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import zmq.socket.pubsub.Dist;

public class ListBox5 {

	public static void main(String[] args) throws InterruptedException {
		
	//Handle listbox without select cls
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.redbus.in/");
		
	driver.manage().window().maximize();
		
		driver.findElement(By.id("src")).sendKeys("pune");
		
      List<WebElement> city =driver.findElements(By.xpath("//ul[@class=\"C120_suggestion\"]//li"));
		Thread.sleep(3000);
		
		System.out.println(city.size());
		
		for (int i=0; i<city.size();i++) {
			
			String cityname = city.get(i).getText();
			System.out.println(cityname);
			if (city.get(i).getText().equals("katraj")) {
				System.out.println(city.get(i).getText());
				city.get(i).click();
					
			}	
		}
		driver.findElement(By.id("dest")).sendKeys("Mumbai");
		List<WebElement> Dest = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"]//li"));
		
		System.out.println(Dest.size());
		
		for (int i=0; i<Dest.size();i++) {
			
			String Distcity = Dest.get(i).getText();
			System.out.println(Distcity);
			if(Dest.get(i).getText().equals("Vashi")){
				System.out.println(Dest.get(i).getText());	
				Dest.get(i).click();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	Thread.sleep(4000);	
	driver.close();	
	}

	private static Object getText() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
