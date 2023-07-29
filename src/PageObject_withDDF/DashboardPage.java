package PageObject_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

        WebDriver driver;
		//1.
        @FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")
        WebElement name;
		
		
        @FindBy(xpath = "//p[@class=\"oxd-text oxd-text--p\"]")
		WebElement time;
		
		//2.
		public DashboardPage(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		//3.
		public void Namevalidation() {
			String text = name.getText();
			if(text.equals("Paul Collings")){
				System.out.println("correct username");
			}else {
				System.out.println("incorrect username");
			}
		}
       public void TimeAt() {
	
	boolean time1=time.isDisplayed();
	System.out.println(time1);
	}
}
