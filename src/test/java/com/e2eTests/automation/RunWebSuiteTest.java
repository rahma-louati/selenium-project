package com.e2eTests.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/spec/features"},
		plugin = {"pretty","html:target/Cucumber-report.html"},
		tags = ("@Dropdown"),
		monochrome = true,
		snippets = SnippetType.CAMELCASE 
	
		)

public class RunWebSuiteTest {

}
