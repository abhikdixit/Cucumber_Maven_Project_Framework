package com.StepDefinition;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utilities.Log_Message;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class CommonPageStepDefinition extends AbstractPageStepDefinition {
	
	WebDriver driver = getDriver();
	
	@Given("^User has Launched Browser in TestComplete$")
	public void user_has_Launched_Browser_in_TestComplete() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Execution Started in CommonPageStepDefinition");
		Log_Message.startLog("Chrome Browser Launched");
	}

	@When("^User Navigate to Sign On Page in TestComplete$")
	public void user_Navigate_to_Sign_On_Page_in_TestComplete() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
	}

	@When("^User enters username and password in TestComplete$")
	public void user_enters_username_and_password_in_TestComplete() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	}
	
	@When("^User Click on Login Button in TestComplete$")
	public void user_Click_on_Login_Button_in_TestComplete() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	}

	@Then("^User should logged in and WebOrders page should display in TestComplete$")
	public void user_should_logged_in_and_WebOrders_page_should_display_in_TestComplete() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		driver.findElement(By.id("ctl00_logout")).isDisplayed();
	}	

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_logout")).click();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ctl00_MainContent_login_button")).isDisplayed();
		//driver.close();
	}
	
	@Given("User is on OrangeHRM Home Page")
	public void user_is_on_orange_hrm_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("User Navigate to Log-in Page of OrangeHRM")
	public void user_navigate_to_log_in_page_of_orange_hrm() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).isDisplayed();
	}
	@When("User enters username {string} and password {string} of OrangeHRM page")
	public void user_enters_username_and_password_of_orange_hrm_page(String Username, String Password) {
	    // Write code here that turns the phrase above into concrete actions
		  // Write code here that turns the phrase above into concrete actions
				driver.findElement(By.name("username")).sendKeys(Username);
				driver.findElement(By.name("password")).sendKeys(Password);
				driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	@Then("User should be in Dashboard page.")
	public void user_should_be_in_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on Dashboard Page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
	}
	
	@When("User enters valid credential")
	public void user_enters_valid_credential(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		//Write the code to handle Data Table
		List<List<String>> data = dataTable.asLists();
		//This is to get the first data of the set (First Row + First Column)
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0)); 
		//This is to get the first data of the set (First Row + Second Column)
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
// Below method is for Google page
	
	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.google.com/");
	}
	
	@When("User Enter the keyword as {string} in search box")
	public void user_enter_the_keyword_as_in_search_box(String uvalue) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(uvalue);
	}
	
	@When("User click on Search Button")
	public void user_click_on_search_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(6000);
		driver.findElement(By.name("btnK")).click();
	}
	@Then("Search result related to {string} word should display")
	public void search_result_related_to_word_should_display(String uvalue) {
	    // Write code here that turns the phrase above into concrete actions
		String actvalue = driver.findElement(By.xpath("//h3[contains(text(),'" +uvalue+"')][1]")).getText();
		Assert.assertEquals(actvalue, uvalue);
	}

	//------------------------Below is Hook example----------
	@After
	public void CloseBrowser() {
		//driver.quit();	
	}
}
