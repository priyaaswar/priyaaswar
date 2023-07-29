package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondProgram {

public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement Element=driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
		
		js.executeScript("arguments[0].scrollIntoView;", Element);
		
		//1. How many rows in table
		//1st way
     	int	row=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		System.out.println("No. of rows--->"+row);
		
		//2nd way
		List<WebElement> row1 =driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println(row1.size());
		
		//2.How many columns in table
	   int col =driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("No.of col-->"+col);
		
		//retrive all data from table
		for(int i= 2; i<=row; i++) {
			for(int j= 1; j<=col; j++) {
				
				String data= driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
				
				if(data.equals("Canada")) {
					
					System.out.println("Row Number :" + i +":" +"col Number:" + j);
					
					break;
				}
			}
		}
		
		
		
		
		
		
		
		
		
	
}
}