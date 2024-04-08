package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// locate for Webelement in login page
	By usernametxt = By.id("username");
	By passwordtxt = By.id("password");
	By loginBtn = By.id("Login");
	// test method

	public void launchApplication(String URL) {
		//ChromeOptions options = new ChromeOptions();
		//WebDriver driver = new ChromeDriver(options.addArguments("--disable-notifications"));
		driver.get(URL);
		System.out.println("App Launched");
	}
		public void enterUsername(String username) {
		driver.findElement(usernametxt).sendKeys(username);
	}

	public void enterpassword(String password) {
		driver.findElement(passwordtxt).sendKeys(password);
	}

	public void clickloginButton() {
		driver.findElement(loginBtn).click();
	}
	public void GetTitle() {
		driver.getCurrentUrl();
		System.out.println(driver.getTitle());
}

}
