package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.WebdriverManager;
import pages.LoginPageWithPageFactory;

public class StepDefinitionForFrameWork {
	WebDriver driver;
	LoginPageWithPageFactory Login;
	WebdriverManager webdrivermanager;
	
	
	@Given("Launch the sf Application")
	public void launch_the_sf_application() {
		
		
		webdrivermanager = new WebdriverManager();
		this.driver= webdrivermanager.getDriver();
		Login = new LoginPageWithPageFactory(this.driver);
		Login.launchApplication();
		Login.enterUsername();
		Login.enterpassword();      
		Login.clickloginButton();     
	}
	
	@When("User is on Home Page,Click on Application Launcher")
	public void user_is_on_home_page_click_on_application_launcher() {
	    
	}

	@When("Selcted Sales from application Launcher")
	public void selcted_sales_from_application_launcher() {
	    
	}

	@When("on sales Dashboard click on Leads")
	public void on_sales_dashboard_click_on_leads() {
	    
	}

	@When("Click on New to create a Lead")
	public void click_on_new_to_create_a_lead() {
	   
	}

	@When("Enter all the required Filed {string} {string} {string} and click Sav")
	public void enter_all_the_required_filed_and_click_sav(String string, String string2, String string3) {
	    
	}

	@Then("Now Lead Created using Following Details successfully")
	public void now_lead_created_using_following_details_successfully() {
	    
	}




}
