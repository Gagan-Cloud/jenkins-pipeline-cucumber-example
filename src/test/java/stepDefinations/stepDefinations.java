/**
 * @author Lenovo
 *
 */
package stepDefinations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import com.cucumber.practice.model.LoginPage;
import com.cucumber.practice.model.SearchPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepDefinations{
	
	public WebDriver driver;
	
	@Before
	public void setUp(){
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\workspace\\cucumber-practice\\src\\test\\resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-extensions");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.linkedin.com/uas/login");
	}
	
	@Given("^I navigate to the login page of linkedIn page$")
	public void i_navigate_to_the_login_page_of_linkedIn_page() throws Throwable {
		System.out.println("I navigated to login page of linked in");
		LoginPage login = new LoginPage(driver);
		Assert.assertEquals(login.getHeaderTitle(), "Welcome Back");
	}

	@When("^I provided the user name password and clicked login button$")
	public void i_provided_the_user_name_password_and_clicked_login_button() throws Throwable {
		System.out.println("I have provided the user name password and clicked login button ....");
		LoginPage login = new LoginPage(driver);
		login.enterUserName();
		login.enterPassword();
		login.clickSignInButton();
	}

	@Then("^I validate navigated to the search page$")
	public void i_validate_navigated_to_the_search_page() throws Throwable {
		SearchPage page = new SearchPage(driver);
		page.waitForPageToLoad();
		page.enterSearchBoxTextAndClick();
		page.clickExperienceLevelAndSelectMidSeniorLevel();
		page.clickApplyButton();
		Assert.assertEquals(page.getFiltersAppliedCount(), "1");
		page.clickOnAllFiltersToSelectFullTimeOption();
		Assert.assertEquals(page.getFiltersAppliedCount(), "2");
		page.clickApplyButton1();
		page.clickProfileButtonToSignOut();
	}
}