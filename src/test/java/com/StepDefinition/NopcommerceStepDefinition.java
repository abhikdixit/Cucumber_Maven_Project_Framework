package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NopcommerceStepDefinition extends AbstractPageStepDefinition {
	
	WebDriver driver = getDriver();

	@Given("User has Launched Browser in nopcommerce")
	public void user_has_launched_browser_in_nopcommerce() {
		// Write code here that turns the phrase above into concrete actions
		//System.out.println("Chrome browser has launched");
	}

	@When("User Navigate to Admin area Sign On Page in nopcommerce")
	public void user_navigate_to_admin_area_sign_on_page_in_nopcommerce() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	@When("User enters email and password in nopcommerce")
	public void user_enters_email_and_password_in_nopcommerce() {
		driver.findElement(By.id("Email")).clear();
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
	}

	@When("User Click on Login Button in nopcommerce")
	public void user_click_on_login_button_in_nopcommerce() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	}

	@Then("User should logged in and Dashboard page should display nopcommerce")
	public void user_should_logged_in_and_dashboard_page_should_display_nopcommerce() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//h1[normalize-space()='Dashboard']")).isDisplayed();
	}

	@When("User LogOut from the nopcommerce Application")
	public void user_log_out_from_the_nopcommerce_application() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("Logout")).click();
	}
	@Then("User should return back to Login page of nopcommerce")
	public void user_should_return_back_to_login_page_of_nopcommerce() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//strong[normalize-space()='Welcome, please sign in!']")).isDisplayed();
	}
	
	@Given("User is at Dashboard page")
	public void user_is_at_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("User click on Right pane_Customers tab")
	public void user_click_on_right_pane_customers_tab() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@When("User click on Customers child tab")
	public void user_click_on_customers_child_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("User should be on Customer page")
	public void user_should_be_on_customer_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@When("User click on Add New button")
	public void user_click_on_add_new_button() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	@Then("User should be on Customer Info page")
	public void user_should_be_on_customer_info_page() {
	    // Write code here that turns the phrase above into concrete actions
	 
	}
	@When("User enter the details like Email,FirstName,LastName,Gender and Company")
	public void user_enter_the_details_like_email_first_name_last_name_gender_and_company() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("Click on Save Button")
	public void click_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("it should display {string}")
	public void it_should_display(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Then("Added user should display in customer Web Table")
	public void added_user_should_display_in_customer_web_table() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
