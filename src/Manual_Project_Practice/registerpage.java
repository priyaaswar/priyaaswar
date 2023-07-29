package Manual_Project_Practice;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.Test;

	public class registerpage {
		WebDriver driver;

		public registerpage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(name = "name")
		WebElement name1;

		@FindBy(xpath = "//input[@name=\"mobile\"]")
		WebElement mobile;

		@FindBy(xpath = "(//button[@type=\"button\"])[2]")
		WebElement button;

		@FindBy(xpath = "//input[@type=\"email\"]")
		WebElement email;

		@FindBy(xpath = "//select[@class=\"form-control\"]//option[22]")
		WebElement state;

		@FindBy(xpath = "(//button[@type=\"submit\"])[1]")
		WebElement click1;

		@FindBy(xpath = "//label[@for=\"trial-grade-2\"]")
		WebElement selectclass;

		@FindBy(xpath = "//p[text()='Whole Numbers']")
		WebElement topic;

		@FindBy(xpath = "//label[@for=\"trial-slot-card-7661186\"]")
		WebElement time;

		@FindBy(xpath = "(//button[@type=\"submit\"])[1]")
		WebElement conform;

		@FindBy(xpath = "//img[@class=\"d-none d-md-block nav-arrow-desktop\"]")
		WebElement anil;

		@FindBy(xpath = "//span[text()='My profile']")
		WebElement profile;

		String s = "https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN";

		public void user() {
			name1.sendKeys("anil sonawane");
		}

		public void mobile() {
			mobile.sendKeys("8830163791");
		}

		public void button() {
			button.click();
		}

		public void email() {
			email.sendKeys("asonawane19@gmail.com");
		}

		public void state() {
			state.click();
		}

		public void click1() {
			click1.click();
		}

		public void selectclass() {
			selectclass.click();
		}

		public void topic() {
			topic.click();
		}

		public void time() {
			time.click();
		}

		public void conform() {
			conform.click();
		}

		public void anil() {
			anil.click();
		}

		public void profile() {
			profile.click();
		}

		public void url() {
			driver.get(s);
		}

	}
	

