package com.StepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;

public class RestAssured_MyNotes {
	
	private RestApi_TestContext stepData;
	
	//Now with just adding Constructor to RestAssuredAPIStepDefinition file and pass 
	//RestApi_TestContext as a Parameter to constructor would take all the pain. 
	//Within the RestApi_TestContext object we have everything available which is required for the test
    public RestAssured_MyNotes(RestApi_TestContext stepData) {
        this.stepData = stepData;
    }
	
	@Given("User is on RestBookStore URI Home Page")
	public void user_is_on_rest_book_store_uri_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		// Write code here that turns the phrase above into concrete actions
		  // Specify the base URL to the RESTful web service
		  RestAssured.baseURI = "https://bookstore.toolsqa.com";
		  
		  // Get the RequestSpecification of the request that you want to sent
		  // to the server. The server is specified by the BaseURI that we have
		  // specified in the above step.
		  stepData.httpRequest = RestAssured.given();
	}
	@When("User Enter the valid ISBN Number {string}")
	public void user_enter_the_valid_isbn_number(String isbn) {
	    // Write code here that turns the phrase above into concrete actions
		// RestAssured httpRequest = null;
				// Write code here that turns the phrase above into concrete actions
				  // Make a request to the server by specifying the method Type and the method URL.
				  // This will return the Response from the server. Store the response in a variable.
				stepData.response = stepData.httpRequest.request(Method.GET, "/BookStore/v1/Book?ISBN="+isbn);
	}
	@Then("verify Status code should be {string}")
	public void verify_status_code_should_be(int Expcode) {
	    // Write code here that turns the phrase above into concrete actions
		int statusCode = stepData.response.getStatusCode();
		  System.out.println("Status code is =>  " + statusCode);
		  Assert.assertEquals(Expcode, statusCode);
	}
	@Then("verify Title of the books return from server")
	public void verify_title_of_the_books_return_from_server() {
	    // Write code here that turns the phrase above into concrete actions
		String responseBody = stepData.response.getBody().asString();
		  System.out.println("Response Body is =>  " + responseBody);
		  stepData.jsonPathEvaluator = new JsonPath(responseBody);  
		  String title_act = stepData.jsonPathEvaluator.get("title");
			System.out.println(title_act);
			Assert.assertEquals(title_act,"Git Pocket Guide");
	}

}
