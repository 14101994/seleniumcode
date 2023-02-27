package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"FeatureFile"},
		glue= {"com.StepDefination"},
		monochrome= true, 
		plugin = {"html:Reports/abc.html",
				"json:Reports/abc.json",
				"junit:Reports/abc.xml",
				"pretty:Reports/abc.txt"}
		
		
		)

public class TestRunnerPractice extends AbstractTestNGCucumberTests {

	
	
}
