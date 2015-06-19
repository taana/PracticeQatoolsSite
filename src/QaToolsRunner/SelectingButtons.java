package QaToolsRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WebBrowser;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectingButtons {
	WebDriver Driver = WebBrowser.getInstance();
	@When("^Select Radio button\\(female\\)$")
	public void SelectRadiobuttonfemale() throws Throwable {
	   Driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[2]/p[2]/label")).click();
	//if(!element.isSelected()){
		   //element.click()
	   }
	

	@Then("^Select Third radio button for category Years of Exp$")
	public void SelectThirdradiobuttonYearsofExp() throws Throwable {
	    Driver.findElement(By.id("exp-2")).click();
	  
	}

	@Then("^Check the checkbox 'Automation Tester' for category Profession$")
	public void CheckboxAutomationTesterCategoryProfession() throws Throwable {
	Driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[4]/p[2]/label")).click();
		
	}

	@Then("^Check the checkbox 'Selenium IDE' for category Automation Tool$")
	public void CheckboxSeleniumIDECategoryAutomationTool() throws Throwable {
		Driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[10]/p[3]")).click(); 
	}
	
}	

