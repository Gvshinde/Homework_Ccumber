package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddAccount;
import pages.LoginPage;
import pages.TestBase;

public class AddAccountStepdefination extends TestBase {
	AddAccount addact;
	LoginPage loginpage;
	String account_name;

	@Before
	public void beforerun() {
		initDriver();
		
	}
	
	
	
	@When("User enters the {string} in the username field")
	public void user_enters_the_in_the_username_field(String username) {
		loginpage=PageFactory.initElements(driver, LoginPage.class);
	    loginpage.enterUserName(username);
		
	}

	@When("User enters the {string} in the password field")
	public void user_enters_the_in_the_password_field(String password) {
	    loginpage.enterPassword(password);
	}

	@When("User clicks on login")
	public void user_clicks_on_login() {
	    loginpage.clickSignInButton();
	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		String expectedTitle="Codefios";
		String actualTitle=loginpage.getPageTitle();
		Assert.assertEquals("Page title are not matching",expectedTitle,actualTitle);
			}

	@Then("User clicks on listAccounts\"")
	public void user_clicks_on_listAccounts() {
		addact=PageFactory.initElements(driver,AddAccount.class);
		addact.click_listacct();
	    
	}

	@Then("User clicks on addAccount")
	public void user_clicks_on_addAccount() {
	addact.click_addacct();    
	}

	@Then("User enters {string} in the accountName field in accounts page")
	public void user_enters_in_the_accountName_field_in_accounts_page(String acctname) throws InterruptedException {
	    account_name=acctname;
		addact.enteracct_name(acctname);
	}

	@Then("User enters {string} in the description field in accounts page")
	public void user_enters_in_the_description_field_in_accounts_page(String desctription) {
	  addact.enter_description(desctription);
	}

	@Then("User enters {string} in the initialBalance field in accounts page")
	public void user_enters_in_the_initialBalance_field_in_accounts_page(String balance) {
	    // Write code here that turns the phrase above into concrete actions
		addact.enter_balance(balance);
	    
	}

	@Then("User enters {string} in the accountNumber field in accounts page")
	public void user_enters_in_the_accountNumber_field_in_accounts_page(String actnumber) {
	    // Write code here that turns the phrase above into concrete actions
		addact.eneter_acctnumber(actnumber);
	    
	}

	@Then("User enters {string} in the contactPerson field in accounts page")
	public void user_enters_in_the_contactPerson_field_in_accounts_page(String contactperson) {
	    // Write code here that turns the phrase above into concrete actions
		addact.enter_contactperson(contactperson);
	    
	}

	@Then("User clicks on Save")
	public void user_clicks_on_Save() {
		addact.click_save();
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
//		String expectedtitle="Manage Account";
//		String catualTitle=addact.getpagetitle();
//		Assert.assertEquals("page not found", expectedtitle, catualTitle);
		String[] actualtext;
		actualtext=addact.record_validation();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
