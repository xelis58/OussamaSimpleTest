package pageObjects;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PageObjectClass extends Base{
	
	public PageObjectClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//a[text()='Test Environment']")
	private WebElement testEnvironmentLink;
	
	public void tekSchoolPage(){
		System.out.println("The user is on Techschool of America website");
		
	}
	
	public void clickOnTestEnvironmentLink(){
		
		try{
			testEnvironmentLink.click();
			}
			catch(ElementNotInteractableException e){
				testEnvironmentLink.sendKeys(Keys.ENTER);
			}
		
	}
	
	public void checkTheTestEnvironmentPage(){
		try{
			   String title=driver.getTitle();
			   if(title.equals("TEK SCHOOL"))
			   {
				   System.out.println("Test passed");
			   }
		   }
		   catch(ElementNotInteractableException e){
			   
		   }
	}
	
}
