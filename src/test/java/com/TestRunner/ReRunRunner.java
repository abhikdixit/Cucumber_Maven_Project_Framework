package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(

		features = {"@Rerun/failed_scenarios.txt"}
		,glue= "com.StepDefinition"
		,plugin  = {"pretty","html:CucumberReport/Report"}
				
		)
public class ReRunRunner {

}
