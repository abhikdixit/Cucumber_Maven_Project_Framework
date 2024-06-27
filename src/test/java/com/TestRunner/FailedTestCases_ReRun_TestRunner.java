package com.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.StepDefinition.AbstractPageStepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {"@FailedTests/failed_TCs.txt"}
		,glue= "com.StepDefinition"
		,plugin  = {"pretty","html:CucumberReport/Rerun_Report.html"}
				
		)

public class FailedTestCases_ReRun_TestRunner extends AbstractPageStepDefinition {
	// Global Variable
	static WebDriver driver = getDriver();
	
	//------------------------Below is Hook example----------
	@AfterClass
	public static void CloseBrowser() {
		driver.quit();	
	}
}