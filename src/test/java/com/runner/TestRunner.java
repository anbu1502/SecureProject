package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.report.Report;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\feature", glue = {
		"com.setdef" }, dryRun = false, monochrome = true, tags = {
				"@positive" }, plugin = { "json:src/test/resources/Report/cucumber.json",
						"html:src/test/resources/Report/cucumberH.html"})

public class TestRunner extends BaseClass {
	@AfterClass
	public static void afterClass() {
		Report.reporting(System.getProperty("user.dir") + "\\src\\test\\resources\\Report\\cucumber.json");

	}

}
