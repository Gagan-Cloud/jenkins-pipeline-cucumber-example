/**
 * @author Lenovo
 *
 */
package com.cucumber.practice.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/cucumber/practice/feature/LinkedInLogin.feature",
				 glue="stepDefinations" 
				)
public class TestRunner {
	
}