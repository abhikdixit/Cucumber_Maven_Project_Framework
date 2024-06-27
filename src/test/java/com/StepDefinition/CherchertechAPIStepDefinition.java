package com.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class CherchertechAPIStepDefinition extends AbstractPageStepDefinition {

	// WebDriver driver = getDriver();

	/*
	 * Response response; RequestSpecification httpRequest; JsonPath
	 * jsonPathEvaluator;
	 */

	private RestApi_TestContext stepData;

	public CherchertechAPIStepDefinition(RestApi_TestContext stepData) {
		this.stepData = stepData;
	}

	@Given("^User is on Chercher tech URI Home Page$")
	public void user_is_on_Chercher_tech_URI_Home_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI = "https://demo.spreecommerce.org/api/v2/storefront/countries";
		stepData.httpRequest = RestAssured.given();
	}

	@When("^User Enter the Emp id \"([^\"]*)\"$")
	public void user_Enter_the_Emp_id(String empid) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		stepData.response = stepData.httpRequest.get("/" + empid);

		stepData.jsonPathEvaluator = stepData.response.getBody().jsonPath();
		System.out.println(stepData.jsonPathEvaluator);
	}

	@Then("^verify the name return from server$")
	public void verify_the_name_return_from_server() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(
				"ISO Name received from Response " + stepData.jsonPathEvaluator.get("data.attributes.iso_name"));
	}

	@Then("^verify the description return from server$")
	public void verify_the_description_return_from_server() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("ID received from Response " + stepData.jsonPathEvaluator.get("data.id"));
	}

	@Then("^verify the price return from server$")
	public void verify_the_price_return_from_server() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("ISO3 received from Response " + stepData.jsonPathEvaluator.get("data.attributes.iso3"));
	}
}
