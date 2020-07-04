/**
 * @author Lenovo
 *
 */
package com.cucumber.practice.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/cucumber/practice/feature/SmokeTest.feature",
				 glue="stepDefinations" ,
				 plugin = {
						    "html:target/cucumber-html-report",
						    "json:target/cucumber.json",
						    "junit:target/cucumber.xml"
						    

} ,
				 tags={"@SmokeTest"}
				)
public class TestRunner {
	
}