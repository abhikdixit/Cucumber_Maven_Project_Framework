package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WeborderPageStepDefinition extends AbstractPageStepDefinition {
	
	WebDriver driver = getDriver();
	
	@Given("User has Launched Chrome Browser")
	public void user_has_launched_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Chrome browser has launched");
	}

	@When("User Navigate to Sign In Page of WebOrder Application")
	public void user_navigate_to_sign_in_page_of_web_order_application() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
	}

	@When("User enters valid username and password in weborder login page")
	public void user_enters_valid_username_and_password_in_weborder_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	}

	@When("User Click on Login Button in from weborder login page")
	public void user_click_on_login_button_in_from_weborder_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	}

	@Then("User should be logged in and List of All Orders page should display")
	public void user_should_be_logged_in_and_list_of_all_orders_page_should_display() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//h2[normalize-space()='List of All Orders']")).isDisplayed();
	}
	
	@When("User click on Logout link from the home page")
	public void user_click_on_logout_link_from_the_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_logout")).click();
	}
	@Then("user should be taken back to Login page.")
	public void user_should_be_taken_back_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ctl00_MainContent_login_button")).isDisplayed();
		//driver.close();
	}
	//------------------------Below is Hook example----------
	@After
	public void CloseBrowser() {
		//driver.quit();	
	}

}
