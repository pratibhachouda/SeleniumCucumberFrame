package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import enums.Browsertype;
import enums.ExecutionMode;
import manager.*;

public class WebdriverManager {

	WebDriver driver;
	private Browsertype browserType;
	private ExecutionMode executionMode;

	public WebdriverManager() {
		browserType = FileReaderManager.getInstance().getConfigFileReader().getBrowser();
		executionMode = FileReaderManager.getInstance().getConfigFileReader().getexecutionMode();

	}
    public WebDriver getDriver() {
    	if(driver==null)
    		driver=creatDriver();
    	return driver;
    	
    }
	private WebDriver creatDriver() {
		switch (executionMode) {
		case LOCAL:
			driver = createLocalDriver();
			break;
		case HEADLESS:
			driver = creatHeadless();
			break;
		}
		return driver;

	}

	private WebDriver creatHeadless() {

		switch (browserType) {
		case CHROME:
        ChromeOptions options = new ChromeOptions();
       options.addArguments("--disable-notifications");
       options.addArguments("--headless=new");
       driver=new ChromeDriver(options);
       driver.manage().window().maximize();
       break;
       
		case FIREFOX:
			FirefoxOptions fp = new FirefoxOptions();
			fp.addArguments("--disable-notifications");
			fp.addArguments("--headless=new");
			driver = new FirefoxDriver(fp);
		    driver.manage().window().maximize();

			break;

		}
		return driver;
	}

	private WebDriver createLocalDriver() {
		switch (browserType) {
		case CHROME:
			ChromeOptions options = new ChromeOptions();
		    options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			break;
		case FIREFOX:
			FirefoxOptions fp = new FirefoxOptions();
			fp.addArguments("--disable-notifications");
			driver = new FirefoxDriver(fp);
			break;

		}
		return driver;

	}

	}
