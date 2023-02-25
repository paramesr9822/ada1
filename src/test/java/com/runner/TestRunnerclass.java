package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.report.Report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags = (""), snippets = SnippetType.CAMELCASE, plugin = { "pretty",
		"json:target\\Output.json" }, dryRun = false, features = "src\\test\\resources", glue = "com.stepdefinition")

public class TestRunnerclass extends BaseClass {

	@AfterClass
	public static void afterclass() throws FileNotFoundException, IOException {
		Report.generateJvmReport(getprojectpath() + getPropertyFileValue("jsonPath"));

	}

}
