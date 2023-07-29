package PageObject_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
      WebDriver driver;
	
      public LoginPage(WebDriver driver){
    	  
    	//initilazation
    	  this.driver = driver;
    	  PageFactory.initElements(driver,this);
      }
      //pagefactory
	@FindBy(xpath = "//input[@name=\"username\"]")
	public WebElement useremail;
		
	@FindBy(xpath="//input[@name=\"password\"]")	
		public WebElement password;
		
	@FindBy(xpath = "//button[@type=\"submit\"]")
	public WebElement button;
			
	public void username(String email) {
		useremail.sendKeys(email);
	}	
	
		public void password(String pass) {
			password.sendKeys(pass);
		}
		
		public void login() {
			button.click();
		}
		public void GoTo() {
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}

		public void useremail(String string) {
			// TODO Auto-generated method stub
			
		}
	}


