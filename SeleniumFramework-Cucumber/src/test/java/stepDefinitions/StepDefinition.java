package stepDefinitions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPageWithPageFactory;

public class StepDefinition {
	ChromeOptions options = new ChromeOptions();
	WebDriver driver = new ChromeDriver(options.addArguments("--disable-notifications"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	LoginPageWithPageFactory login = new LoginPageWithPageFactory(driver);
	@Before
	public void beforeScenario() {
		System.out.println("order=0");
		System.out.println("Before Test Scenario-launch application");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://login.salesforce.com/");
	}
	@Before(order=0)
	public void orderExecution() {
		System.out.println("order=1");
	}
	@Before("@First")
	public void beforeFirstScenario() {
		System.out.println("This will run brfore First Scenarioa");
	}

	@Before("@Second")
	public void beforeSecondScenario() {
		System.out.println("This will run brfore Second Scenarioa");
	}

	@Before("@Third")
	public void beforeThirdScenario() {
		System.out.println("This will run brfore Third Scenarioa");
	}

	@After("@First")
	public void afterFirstScenario() {
		System.out.println("This will run after First Scenarioa");
	}

	@After("@Second")
	public void afterSecondScenario() {
		System.out.println("This will run after @Second Scenarioa");
	}

	@After("@Third")
	public void afterThirdScenario() {
		System.out.println("This will run after Third Scenarioa");
	}

	@Given("Launch the Salesforce Application")
	public void launch_the_salesforce_application() {

		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pratibhachouda4085@gmail.com");
		//driver.findElement(By.id("password")).clear();
		//driver.findElement(By.id("password")).sendKeys("pratibha@min2");
		//driver.findElement(By.id("Login")).click();
		//System.out.println(driver.getTitle());
		login.enterUsername("pratibhachouda4085@gmail.com");
		login.enterpassword("pratibha@min2");
		login.clickloginButton();
	
	}

	@After
	public void afterScenario() {
		System.out.println("After Test Scenario");
		driver.quit();
	}

	@When("User is on Home Page,Click on App Launcher")
	public void user_is_on_home_page_click_on_app_launcher() {

		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		System.out.println("App Launcher Clicked");
	}

	@When("Selcted Sales from app Launcher")
	public void selcted_sales_from_app_launcher() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[@class='slds-truncate']//following::p[6]//preceding::p[5]")).click();
		System.out.println("Clicked Sales");
	}

	@When("User is on sales Dashboard click on Leads")
	public void user_is_on_sales_dashboard_click_on_leads() {
		driver.findElement(By
				.xpath("//div[@class='slds-grid slds-has-flexi-truncate navUL']//child::one-app-nav-bar-item-root[4]"))
				.click();
		System.out.println("Leads");
		System.out.println(driver.getTitle());
	}

	@When("Click on New to create a New Lead")
	public void click_on_new_to_create_a_new_lead() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		String titleNewLeads = driver.findElement(By.xpath("//h2[text()='New Lead']")).getText();
		System.out.println(titleNewLeads);
	}

	@When("Enter all the Mandatory Fileds {string} {string} {string} and click Save")
	public void enter_all_the_mandatory_fileds_nike_and_click_save(String First_Name, String Last_Name,
			String Company) {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(First_Name);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Last_Name);
		driver.findElement(By.xpath("//label[text()='Company']/following::input[1]")).sendKeys(Company);
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();

	}

	@Then("Lead should Created using given Name successfully")
	public void lead_should_created_using_given_name_successfully() {
		String msg = driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']")).getText();
		System.out.println(msg);
	}

	@Given("First Step")
	public void first_step() {
		System.out.println("First Step");
	}

	@When("Second Step")
	public void second_step() {
		System.out.println("Second Step");
	}

	@Then("Third Step")
	public void third_step() {
		System.out.println("Third Step");
	}

	public static void main(String[] args) {

	}

}
