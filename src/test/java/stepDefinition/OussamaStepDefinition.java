package stepDefinition;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PageObjectClass;

public class OussamaStepDefinition extends Base{

	PageObjectClass oussamaStepDefinition = new PageObjectClass();
	
	@When("^User Open tekschool of America website$")
	public void user_Open_tekschool_of_America_website() throws Throwable {
		oussamaStepDefinition.tekSchoolPage();
	    }

	@And("^User click on test environment link$")
	public void user_click_on_test_environment_link() throws Throwable {
		Base.initializeDriver();
		oussamaStepDefinition.clickOnTestEnvironmentLink();
	}

	@Then("^User should see Test environment webpage$")
	public void user_should_see_Test_environment_webpage() throws Throwable {
		oussamaStepDefinition.checkTheTestEnvironmentPage();
	}
}
