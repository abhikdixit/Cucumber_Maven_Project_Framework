package com.StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.Log_Message;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OrderPageStepDefinition extends AbstractPageStepDefinition {

	WebDriver driver = getDriver();
	
	@Given("^User Clicks on Order link in TestComplete$")
	public void user_Clicks_on_Order_link_in_TestComplete() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Order")).click();
		Log_Message.debug("User Cliked on Order Link");
	}

	@Given("^User enters quantity, customer name, street, city, zip, card, card number, expire date in TestComplete$")
	public void user_enters_quantity_customer_name_street_city_zip_card_card_number_expire_date_in_TestComplete() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("2");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("Abc");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("xyz");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("1001");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("1234");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("22/44");
		Log_Message.debug("User enter all the Details like Customer Name, Street, City, Zip and etc.");
	}

	@Given("^User Click on Process Button in TestComplete$")
	public void user_Click_on_Process_Button_in_TestComplete() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
	}

	@Then("^User should see order success message in TestComplete$")
	public void user_should_see_order_success_message_in_TestComplete() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//strong[normalize-space()='New order has been successfully added.']")).isDisplayed();
		Log_Message.debug("It should display -'order success message in TestComplete'...");
		//driver.close();
	}
	
	@Given("User is on WebOrder Home Page")
	public void user_is_on_web_order_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String uname, String upass) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(uname);
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(upass);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	}

	@Then("User should be in Home page and Logout button should display")
	public void user_should_be_in_home_page_and_logout_button_should_display() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_logout")).isDisplayed();
		driver.findElement(By.id("ctl00_logout")).click();
	}

	@Then("User should get proper {string}")
	public void user_should_get_proper(String ExpResult) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		if (ExpResult.equalsIgnoreCase("Invalid Login or Password.")) {
			String ActResult = driver.findElement(By.id("ctl00_MainContent_status")).getText();
			Assert.assertEquals(ActResult, ExpResult);
			
		} else 
		{
			String ActResult = driver.findElement(By.linkText("Logout")).getText();
			Assert.assertEquals(ActResult, ExpResult);
			driver.findElement(By.linkText("Logout")).click();
		}
	}
}
