package MultipleLinks;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	private static final URL Link = null;

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
			
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No.of links--->"+links.size());
		
		int Brokenlinks = 0;
		
		for(WebElement element: links) {
			
		 String url = element.getAttribute("href");	
			
		 if(url==null || url.isEmpty()) {
			 System.out.println("url is empty or null");
		 }
		 URL link = new URL(url);
		 
		 HttpsURLConnection httpscode = (HttpsURLConnection) Link.openConnection();
		 httpscode.connect();
		 
		if(httpscode.getResponseCode()>=400) {
			
			System.out.println(httpscode.getResponseCode()+"--->"+url+"is--->Broken link");
			Brokenlinks++;
		} else {
			System.out.println(httpscode.getResponseCode()+"-->"+url+"is--->valid link");
			
		}
		 
		System.out.println("No.of Broken links--->"+Brokenlinks); 
		
		}
	}

}
