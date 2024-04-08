package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {
	WebDriver driver;

	public LoginPageWithPageFactory(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	@CacheLookup
	WebElement usernametxt;

	@FindBy(id = "password")
	@CacheLookup
	WebElement passwordtxt;

	@FindBy(id = "Login")
	@CacheLookup
	WebElement loginBtn;

	public void launchApplication(String URL) {
		driver.get(URL);
	}

	public void enterUsername(String username) {
		usernametxt.sendKeys(username);
	}

	public void enterpassword(String password) {
		passwordtxt.sendKeys(password);
	}

	public void clickloginButton() {
		loginBtn.click();
		System.out.println("App Opened");

	}
}