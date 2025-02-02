package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddAccount;
import pages.LoginPage;
import pages.TestBase;

public class AddAccountStepDefination extends TestBase {
	LoginPage loginpage;
	AddAccount addact;
	
	
	
	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String logincred, String field) {
		loginpage=PageFactory.initElements(driver, LoginPage.class);

		if(field.equalsIgnoreCase("username")) {
			loginpage.enterUserName(logincred);
			
		}else if(field.equalsIgnoreCase("password")) {
			loginpage.enterPassword(logincred);
		}else {
			System.out.println("Please eneter valid credential");
		}
	 }

	

	@When("User clicks on {string}")
	public void user_clicks_on(String click_field) {
		addact=PageFactory.initElements(driver, AddAccount.class);
	    if(click_field.equalsIgnoreCase("login"))
	    {
	    	loginpage.clickSignInButton();
	    }else if(click_field.equalsIgnoreCase("listAccounts")) {
	    	addact.click_listacct();
	    }else if(click_field.equalsIgnoreCase("addAccount")) {
	    	addact.click_addacct();
	    }else if(click_field.equalsIgnoreCase("Save")) {
	    	addact.click_save();
	    }
	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		String expectedTitle="Codefios";
		String actualTitle=loginpage.getPageTitle();
		Assert.assertEquals("Page title are not matching",expectedTitle,actualTitle);    
	}

	@Then("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String userinput, String field) {
	    if(field.equalsIgnoreCase("accountName")) {
	    	try {
				addact.enteracct_name(userinput);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }else if(field.equalsIgnoreCase("description")) {
	    	addact.enter_description(userinput);
	    }else if(field.equalsIgnoreCase("initialBalance")) {
	    	addact.enter_balance(userinput);
	    	
	    }else if(field.equalsIgnoreCase("accountNumber")) {
	    	addact.eneter_acctnumber(userinput);
	    }else if(field.equalsIgnoreCase("contactPerson")) {
	    	addact.enter_contactperson(userinput);
	    }
		
	}

	
	

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
		
		addact.record_validation();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		takeScreenshot(driver);
		
	    
	}


}
