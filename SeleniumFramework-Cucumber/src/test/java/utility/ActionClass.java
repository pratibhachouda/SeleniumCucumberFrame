package utility;

import javax.swing.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class ActionClass {
	public static WebDriver driver;

	public ActionClass(WebDriver driver) {

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
		Actions builder=new Actions (driver);
       builder.clickAndHold(element).build().perform();
       
      }
	public static void pressEnterKey(WebElement element) {
		element.sendKeys(Keys.ENTER);
	}
	
	public static void pressEnterEsc(WebElement element) {
		element.sendKeys(Keys.ESCAPE);
	}
		
	public static void getTitle() {
		String title=driver.getTitle();
		System.out.println("Title:"+ title);
		
	}	
}
