package utility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {
	public static WebDriver driver;

	public ActionClass(WebDriver driver) {

	}
     public static void launchUrl(String url) {
    	 driver.get(url);
     }
	public static void sendkeys(WebElement element, String InptValue) {
		element.sendKeys(InptValue);
	}

	public static void click(WebElement element) {
		element.click();

	}

	public static void getcurrentUrl() {
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);

	}

	public static void selectDropdownByValue(WebElement dropdown, String Value) {
		Select selectElement = new Select(dropdown);
		selectElement.selectByValue(Value);

	}

	public static void selectDropdownByIndex(WebElement dropdown, int indexValue) {
		Select selectElement = new Select(dropdown);
		selectElement.selectByIndex(indexValue);

	}

	public static void selectDropdownByVisibleText(WebElement dropdown, String Value) {
		Select selectElement = new Select(dropdown);
		selectElement.selectByVisibleText(Value);
	}

	public static void javaScriptExecutorClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click", element);
	}

	public static void clickandHold(WebElement element) {
		Actions builder = new Actions(driver);
		builder.clickAndHold(element).build().perform();

	}

	public static void pressEnterKey(WebElement element) {
		element.sendKeys(Keys.ENTER);
	}

	public static void pressEnterEsc(WebElement element) {
		element.sendKeys(Keys.ESCAPE);
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println("Title:" + title);

	}

	public static void windowSwitchFromParenttoNewWindow(WebDriver driver) {
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> itr  = allWindowHandles.iterator();
		int size=allWindowHandles.size();
		String child=null;
		for(int i=0;i<size;i++) {
			child=itr.next();
		}
			driver.switchTo().window(child);
		}
	
		public static void windowSwitchFromchildtoParentWindow(WebDriver driver) {
			Set<String> allWindowHandles = driver.getWindowHandles();
			String parent =(String)allWindowHandles.toArray()[0];
			driver.switchTo().window(parent);
		}
		public static void  winodSwitchCurrentchildtoImmediateparent(WebDriver driver) {
		Set<String> allWindowHandles=driver.getWindowHandles();
			String window=(String) allWindowHandles.toArray()[1];
			driver.switchTo().window(window);
			}
		public static String getText(WebElement element) {
			return element.getText(); 
			
		}
		
		public static boolean isElementpresent(WebElement element) {
			if(element.isDisplayed()) {
				return true;
			}
			return false;
			
		}
		boolean isEnabled(WebElement element) {
		if(element.isEnabled()) {
			return true;
		}
		return false;
		
	}
		public static boolean xWaitforElementVisible(WebElement el, int timeWait) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(el));
			return true;	
		}
		public static void radioButtonselect(WebElement el) {
		boolean checkStatus;
		checkStatus=el.isSelected();
		if(checkStatus=true) {
			System.out.println("Radio Button Already Checked");
		}
		else {
			el.click();
			System.out.println("Selected The RadioButton");
		}
		
		
		
		
	}
	  

}
