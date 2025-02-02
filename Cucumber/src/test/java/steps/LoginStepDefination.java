package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefination extends TestBase {
	LoginPage loginpage;
	
	@Before
	public void beforerun() {
		initDriver();
		loginpage=PageFactory.initElements(driver,LoginPage.class );
	}
	
	@Given("User is on the codefios login page")
	public void user_is_on_the_codefios_login_page() {
	    
	    driver.get("https://codefios.com/ebilling/");
	}

	@When("User Enters username {string}")
	public void user_Enters_username(String username) {
	
	loginpage.enterUserName(username);
	    
	}

	@When("User enters password {string}")
	public void user_enters_password(String password) {
		loginpage.enterPassword(password);
	    
	}

	@When("User clicks on signin button")
	public void user_clicks_on_signin_button() {
		loginpage.clickSignInButton();
	    
	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
	String expectedTitle="Codefios";
	String actualTitle=loginpage.getPageTitle();
	Assert.assertEquals("Page title are not matching",expectedTitle,actualTitle);
	    
	}
//	@After
//	public void afterrun() {
//		driver.close();
//		driver.quit();
//		
//	}


}
