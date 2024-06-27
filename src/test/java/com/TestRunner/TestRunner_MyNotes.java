package com.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.StepDefinition.AbstractPageStepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {"Feature_API/ToGet_Book_Details_Using_ISBN_Number.feature"}
		//features = {"Feature_API/NopCommerce_Login.feature","Feature/OrangeHRM_Login.feature"}
		//features = {"Feature"}
		//This is to execute only failed scenarios
		//features = {"@FailedTests/failed_TCs.txt"}
		,glue= "com.StepDefinition"
		,dryRun=false
		,monochrome=true
		,plugin  = {"pretty","html:CucumberReport/MyNotes_API.html"}
		//,plugin  = {"pretty","html:CucumberReport/MasterReport.html","rerun:FailedTests/failed_TCs.txt"}
		//,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} 
		//Execute all of them Except Sanity
		//,tags="not @smoke"
		// Execute Smoke and Sanity both test cases
		//,tags= "@smoke or @sanity"
		// Execute Smoke and Sanity , but both should be marked together in feature
		//,tags= "@smoke and @sanity"
		//,tags= "@smoke"
		//,tags= "@E2E"
		
		)
public class TestRunner_MyNotes {

}
