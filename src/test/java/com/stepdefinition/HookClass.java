package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookClass extends BaseClass {

	@Before
	public void beforescenario() throws FileNotFoundException, IOException {
		getDriver(getPropertyFileValue("browserName"));
		enterUrl(getPropertyFileValue("url"));
		maximizewindow();

	}

	@After
	public void afterscenario(Scenario scenario) {
		scenario.attach(screenshot(), "images/png", "Every Scenario");
		// TakesScreenshot screenshot=(TakesScreenshot)driver;
		// byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
		// scenario.attach(b, "images/png", "Every Scenario");
		// if(scenario.isFailed()) {
		// scenario.attach(screenshot(), "images/png", "Every Scenario");
		// }
		

		quit();

	}

}
