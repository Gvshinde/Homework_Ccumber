package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddAccount {
	WebDriver driver;
	public AddAccount(WebDriver driver) {
		this.driver=driver;
		
	}
	//Element Library 
	@FindBy(how=How.XPATH, using="//span[text()='List Accounts']")
	WebElement listaccounts;
	@FindBy(how=How.XPATH,using="//button[text()='Add Account']")
	WebElement addaccount;
	@FindBy(how=How.XPATH,using="//input[@id='account_name']")
	WebElement accountname;
	@FindBy(how=How.XPATH,using="//textarea[@id='description']")
	WebElement description;
	@FindBy(how=How.XPATH,using="//input[@id='balance']")
	WebElement inialbalance;
	@FindBy(how=How.XPATH,using="//input[@id='account_number']")
	WebElement accnumber;
	@FindBy(how=How.XPATH,using="//input[@id='contact_person']")
	WebElement contact_person;
	@FindBy(how=How.XPATH,using="//button[@id='accountSave']")
	WebElement savebutton;
	
	public void click_listacct() {
		listaccounts.click();
	}
	public void click_addacct() {
		addaccount.click();
	}
	public void enteracct_name(String acctname) throws InterruptedException {
		accountname.sendKeys(acctname);
		Thread.sleep(2000);
	}
	public void enter_description(String descriptn) {
		description.sendKeys(descriptn);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void enter_balance(String balance) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       inialbalance.sendKeys(balance);
	}
	public void eneter_acctnumber(String acctnumber) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		accnumber.sendKeys(acctnumber);
	}
	public void enter_contactperson(String contactperson) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contact_person.sendKeys(contactperson);
	}
	public void click_save() {
		savebutton.click();
		
	}
	public String getpagetitle() {
		return driver.getTitle();
		
	}
	public void record_validation() {
		//tbody/tr[1]/td[2]
		String Before_xpath="//tbody/tr[";
		String after_xpath="]/td[2]";
		
		for(int i=1;i<6;i++) {
			//driver.findElement(By.xpath("//tbody/tr[1]/td[2]"))
			String actual_text=driver.findElement(By.xpath(Before_xpath+i+after_xpath)).getText();
		    System.out.println(actual_text);
		   
		}
		
		
	}
	
	

}
