/**
 * @author Lenovo
 *
 */
package stepDefinations;

import org.testng.Assert;

import cucumber.api.java.en.Given;


public class stepDefinations{
	
	@Given("^This statement execute smoke test scripts$")
	public void this_statement_execute_smoke_test_scripts() throws Throwable {
	  
		System.out.println("Executing smoke test scripts ....");
		Assert.assertEquals("SmokeTest", "SmokeTest");
	    
	}

	@Given("^This statement execute regression test scripts$")
	public void this_statement_execute_regression_test_scripts() throws Throwable {
	    System.out.println("Executing regression test scripts ....");
	    Assert.assertEquals("RegressionTest", "RegressionTest");
	   
	}
	
	@Given("^This statement execute smoke and regression test scripts$")
	public void this_statement_execute_smoke_and_regression_test_scripts() throws Throwable {
		 System.out.println("Executing Smoke and  regression test scripts ....");
		    Assert.assertEquals("SmokeRegressionTest", "SmokeRegressionTest");
	}
}