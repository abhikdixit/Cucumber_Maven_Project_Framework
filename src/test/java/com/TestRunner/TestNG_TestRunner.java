package com.TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(

		features = {"Feature/Google_Search_Functionality.feature","Feature/OrangeHRM_AddUser.feature"}
		//features = {"Feature/TestComplete_Login.feature"}
		//features = {"Feature/WebOrder_Login.feature"}
		//features = {"Feature/NopCommerce_Login.feature","Feature/OrangeHRM_Login.feature"}
		//features = {"Feature"}
		,glue= "com.StepDefinition"
		//,dryRun = true
		,monochrome=true
		,plugin  = {"pretty","html:CucumberReport/Report.html"}
		//,tags={"@smoke,@E2E"}
		)
public class TestNG_TestRunner extends AbstractTestNGCucumberTests {

	 @Override
	 @DataProvider(parallel = false)
	 public Object[][] scenarios() 
	 {
	 return super.scenarios();
	 }
	 
}
