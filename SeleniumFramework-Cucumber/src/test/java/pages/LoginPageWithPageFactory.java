package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import manager.FileReaderManager;
import utility.ActionClass;

public class LoginPageWithPageFactory {
	WebDriver driver;
	String appUrl;
	String appUserName;
	String appPassword;

	public LoginPageWithPageFactory(WebDriver driver) {
		appUrl=FileReaderManager.getInstance().getConfigFileReader().getApplicationURL();
		appUserName=FileReaderManager.getInstance().getConfigFileReader().UserName();
		appPassword=FileReaderManager.getInstance().getConfigFileReader().Password();
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		ActionClass.driver=driver;
		
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

	public void launchApplication() {
		System.out.println(appUrl);
		System.out.println(appUserName);
		System.out.println(appPassword);
		ActionClass.launchUrl(appUrl); 
		//driver.get(URL);
	
	}

	public void enterUsername() {
		//usernametxt.sendKeys(username);
		ActionClass.sendkeys(usernametxt, appUserName); 
		
	}

	public void enterpassword() {
		//passwordtxt.sendKeys(password);
		ActionClass.sendkeys(passwordtxt, appPassword);
	}

	public void clickloginButton() {
		//loginBtn.click();
		ActionClass.click(loginBtn);
      System.out.println("App Opened");
	}   
}