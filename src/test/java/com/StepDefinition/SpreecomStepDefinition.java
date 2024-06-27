package com.StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SpreecomStepDefinition extends AbstractPageStepDefinition {

	WebDriver driver = getDriver();
	
	@Given("User has Launched Chrome Browse")
	public void user_has_launched_chrome_browse() {
		System.out.println("Chrome browser has launched");
	}
	
	@When("User Clicks on Login Button")
	public void user_clicks_on_login_button() throws InterruptedException {
		driver.findElement(By.name("commit")).click();
		Thread.sleep(3000);
	}

	@Then("User is created and logged in and My Account page should display")
	public void user_is_created_and_logged_in_and_my_account_page_should_display() {
		driver.findElement(By.xpath("//h3[text()='My Account']"));
	}
	
	@When("User Navigate to Login Page")
	public void user_navigate_to_login_page() {
		//driver.findElement(By.xpath("//h3[text()='My Account']"));
		driver.get("https://demo.spreecommerce.org/login");
	}

	@When("User enters email and password")
	public void user_enters_email_and_password() {
		driver.findElement(By.name("spree_user[email]")).sendKeys("api@spree.com");
        driver.findElement(By.name("spree_user[password]")).sendKeys("spree123");
	}
	
	@Then("User should logged in and My Account page should display")
	public void user_should_logged_in_and_my_account_page_should_display() {
		driver.findElement(By.xpath("//h3[text()='My Account']"));
	}

	@Then("Logged in succesfully message should be displayed")
	public void logged_in_succesfully_message_should_be_displayed() {
		System.out.println("Logged in succesfully message should be displayed");
		driver.findElement(By.xpath("//span[text()='Logged in successfully']")).isDisplayed();
	}

	@When("User Clicks Logout Button")
	public void user_clicks_logout_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("account-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		Thread.sleep(1000);
	}

	@Then("User should Navigate to Login Page")
	public void user_should_navigate_to_login_page() {
		driver.get("https://demo.spreecommerce.org/login");
		System.out.println("User should Navigate to Login Page!!");
	}

	@Then("Signed out successfully message should be displayed")
	public void signed_out_successfully_message_should_be_displayed() {
		System.out.println("Signed out successfully message should be displayed");
	}
	@Then("email id is displayed in Account info")
	public void email_id_is_displayed_in_account_info() {
		System.out.println("Account Info Displayed!!");
	}
	
	// Below section for DataDriven Testing
	
	@When("User enters {string} and {string} in spreecom")
	public void user_enters_and_in_spreecom(String email, String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("spree_user[email]")).sendKeys(email);
        driver.findElement(By.name("spree_user[password]")).sendKeys(password);

	    
	}
	@Then("User should get proper {string} in spreecom")
	public void user_should_get_proper_in_spreecom(String ExpResult) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		// Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		if (ExpResult.equalsIgnoreCase("Invalid email or password.")) {
			String ActResult = driver.findElement(By.xpath("//span[text()='Invalid email or password.']")).getText();
			Assert.assertEquals(ActResult, ExpResult);
			
		} else 
		{
			String ActResult = driver.findElement(By.xpath("//span[text()='Logged in successfully']")).getText();
			Assert.assertEquals(ActResult, ExpResult);
			Thread.sleep(1000);
			driver.findElement(By.id("account-button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@href='/logout']")).click();
			Thread.sleep(1000);
		}
	}

}
