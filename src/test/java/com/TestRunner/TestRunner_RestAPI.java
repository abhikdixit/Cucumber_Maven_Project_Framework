package com.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(

		//features = {"Feature/Create_Address_Using_Token.feature"}
		//features = {"Feature/ToGet_Details_Using_CountryName_UsingAPI.feature"}
		//features = {"Feature/Create_Refresh_Token.feature"}
		features = {"Feature/Get_Default_Country.feature"}
		//features = {"Feature/Retrieve_a_Country_Multiple_Data.feature"}
		//features = {"Feature"}
		,glue= "com.StepDefinition"
		,dryRun=false
		,monochrome=true
		,plugin  = {"pretty","html:CucumberReport/API_Report.html"}
		//,plugin  = {"pretty","html:CucumberReport/Report.html","rerun:Rerun/failed_scenarios.txt"}
		//Execute all of them Except Sanity
		//,tags="not @API_Smoke"
		// Execute Smoke and Sanity both test cases
		//,tags= "@API_Smoke or @API_Sanity"
		// Execute Smoke and Sanity , but both should be marked together in feature
		//,tags= "@API_Regression and @API_Smoke"
		//,tags= "@API_Smoke"
		
		)


public class TestRunner_RestAPI {

}
