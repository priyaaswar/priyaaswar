package Manual_Project_Practice;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class byjusprofilepage {
		WebDriver driver;

		public byjusprofilepage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "(//input[@type=\"text\"])[4]")
		WebElement date;

		@FindBy(xpath = "//button[text()='Save']")
		WebElement save;

		public void date() {
			date.sendKeys("16/3/2022");
		}

		public void save() {
			date.click();
		}

	}
	

