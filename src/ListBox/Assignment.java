package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver",
				"\"C:\\Users\\gaura\\Downloads\\chromedriver_win32\\chromedriver.exe\""); 
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	
	// store the element in object
WebElement web=	driver.findElement(By.xpath("//select[@type=\"text\"]"));
WebElement day=driver.findElement(By.id("daybox"));
WebElement month=driver.findElement(By.xpath("//select[@ng-model=\"monthbox\"]"));
WebElement year=driver.findElement(By.id("yearbox"));

// for skills list
Select s=new Select(web);
List<WebElement> list=s.getOptions();
// find the size/length of skills list
System.out.println("****LENGTH OF SKILLS LIST IS-->"+list.size()+"******");
Thread.sleep(3000);
// print all list present in skills list 78
for(int i=0;i<list.size();i++) {
	System.out.println( list.get(i).getText());
}
// create object of select class for day,month and year
Select s1=new Select(day);
Select s2=new Select(month);
Select s3=new Select(year);

// for print size of date
List<WebElement> first=s1.getOptions();
System.out.println();
System.out.println("**day list-->"+first.size()+"***");
Thread.sleep(3000);
// for select date  8
for(int i=0;i<first.size();i++) {
	String s4=first.get(i).getText();
	System.out.println(s4);{
		if(s4.equals("8"))
			first.get(i).click();
	}
}
// for print month size
List<WebElement> second=s2.getOptions();
System.out.println();
System.out.println("***MONTH SIZE IS--->"+second.size()+"****");
// FOR SELECT MONTH June
for(int i=0;i<second.size();i++) {
	String s5=second.get(i).getText();
	System.out.println(s5);{
		if(s5.equals("June"))
			second.get(i).click();
	}
}
// for print year list
List<WebElement> third=s3.getOptions();
System.out.println();
System.out.println("*** YEAR LIST IS --->"+third.size()+"****");
// for select year  1923
for(int i=0;i<third.size();i++) {
	String s6=third.get(i).getText();
	System.out.println(s6);{
		if(s6.equals("1923"))
			third.get(i).click();
	}
}

Thread.sleep(5000);
driver.quit();
}
	
	
}
