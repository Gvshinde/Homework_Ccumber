package runners;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)//Junit library 
@CucumberOptions(
		//---------------------------------------------------------------
		//feature file 
		features="src\\test\\resources\\features\\AddAccount.feature",
		//this referring to the package which holds all the step definitions class
		glue="steps",
		tags="@AddAccount",
		strict = true,
		monochrome=true,//whenever we are running features it shows pretty understandable format 
		dryRun=false,//it will check major errors (initialization error) also check the code in 
		plugin= {
				"pretty",
				"html:target/report/cucumber.html",//reports get created 
				"json:target/reports/cucumber.json"
		}
		
		)
public class LoginRunner {

}
