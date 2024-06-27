package com.StepDefinition;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OrangeHRMStepDefinition extends AbstractPageStepDefinition {
	// Global Variable
	WebDriver driver = getDriver();
	
	@Given("^User has Launched Browser$")
	public void user_has_Launched_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Chrome browser has launched");
	}

	@When("^User Navigate to Sign On Page$")
	public void user_Navigate_to_Sign_On_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@When("^User Click on Login Button$")
	public void user_Click_on_Login_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}

	@Then("^User should logged in and Dashboard page should display$")
	public void user_should_logged_in_and_Dashboard_page_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
	}

	@Then("^User Should see Marketplace$")
	public void user_Should_see_Marketplace() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.xpath("//span[text()='PIM']")).isDisplayed();
	}

	
	@Given("User Click on Welcome User Link")
	public void user_click_on_welcome_user_link() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	}
	@When("User Click on Logout Link")
	public void user_click_on_logout_link() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(5000);
	}
	@Then("Login Page should display")
	public void login_page_should_display() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")).isDisplayed();
		System.out.println("LogOut Successfully");
	}
	
	@Then("Login button should display")
	public void login_button_should_display() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).isDisplayed();
	}
	
	@Given("User Click on PIM Page")
	public void user_click_on_pim_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//span[text()='PIM']")).isDisplayed();
		
	}
	@When("User Click on Admin tab")
	public void user_click_on_admin_tab() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(5000);
	    
	}
	@When("User Click on Add button")
	public void user_click_on_add_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(5000);
	}
	@Then("User should be navigated to Add User page")
	public void user_should_be_navigated_to_add_user_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//h6[text()='Add User']")).isDisplayed();
	}
	
	@When("User enters {string} and {string} for OrangeHRM")
	public void user_enters_and_for_orange_hrm(String uname, String upass) {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(upass);
	}
	@When("User click on Login button of OrangeHRM app")
	public void user_click_on_login_button_of_orange_hrm_app() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	@Then("User should be in Home page and Dashboard page should display")
	public void user_should_be_in_home_page_and_dashboard_page_should_display() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
	}
	
	//------------------------Below is Hook example----------
	@AfterClass
	public void CloseBrowser() {
		driver.quit();	
	}

}
