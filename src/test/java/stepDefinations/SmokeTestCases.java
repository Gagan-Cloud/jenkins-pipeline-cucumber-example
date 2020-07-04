package stepDefinations;

import org.testng.Assert;

import cucumber.api.java.en.Given;

public class SmokeTestCases {
	
	
	@Given("^Smoke Test Case One$")
	public void smoke_Test_Case_One() throws Throwable {
	   System.out.println("Smoke Test Case 1");
	   Assert.assertEquals("Test1", "Test1");
	}

	@Given("^Smoke Test Case Two$")
	public void smoke_Test_Case_Two() throws Throwable {
		System.out.println("Smoke Test Case 2");
		 Assert.assertEquals("Test2", "Test2");
	}

	@Given("^Smoke Test Case Three$")
	public void smoke_Test_Case_Three() throws Throwable {
		System.out.println("Smoke Test Case 3");
		 Assert.assertEquals("Test3", "Test3");
	}

	@Given("^Smoke Test Case four$")
	public void smoke_Test_Case_four() throws Throwable {
		System.out.println("Smoke Test Case 4");
		 Assert.assertEquals("Test4", "Test4");
	}

	@Given("^Smoke Test Case five$")
	public void smoke_Test_Case_five() throws Throwable {
		System.out.println("Smoke Test Case 5");
		 Assert.assertEquals("Test5", "Test5");
	}

	@Given("^Smoke Test Case six$")
	public void smoke_Test_Case_six() throws Throwable {
		System.out.println("Smoke Test Case 6");
		 Assert.assertEquals("Test6", "Test6");
	}

	@Given("^Smoke Test Case with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void smoke_Test_Case_with_and(String arg1, String arg2) throws Throwable {
		System.out.println("User Name : "+arg1+" Password : "+arg2);
	    Assert.assertEquals(arg1, arg2);
	}
	
	@Given("^Smoke Test Case eight \"([^\"]*)\" and \"([^\"]*)\"$")
	public void smoke_Test_Case_eight_and(String arg1, String arg2) throws Throwable {
		System.out.println("first Name : "+arg1+" last name : "+arg2);
	    Assert.assertEquals("Anvai", arg1);
	    Assert.assertEquals("Jawaji", arg2);
	}
}
