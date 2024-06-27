package com.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractPageStepDefinition {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null)
		{
			//WebDriverManager.firefoxdriver().setup();
			//driver = new FirefoxDriver();
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	

}
