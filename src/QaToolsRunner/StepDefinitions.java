package QaToolsRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WebBrowser;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	// public StepDefinitions(WebDriver driver) {
	// super(driver);
	//
	// }
	WebDriver Driver = WebBrowser.getInstance();

	@Given("^Open URL$")
	public void Open_UR_http_www_toolsqa_com_automation_practice_form()
			throws Throwable {
		// d
		// driver.findElement(By.xpath(".//*[@id='content']/h1"));
		Driver.findElement(By.xpath(".//*[@id='content']/h1"));

	}

	@When("^Type Name & Last Name$")
	public void Type_Name_Last_Name() throws Throwable {
		Driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/p[3]/input")).sendKeys("Tania");
		Driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/p[4]/input")).sendKeys("Demen");
	}

	@Then("^Click on Submit button$")
	public void Click_on_Submit_button() throws Throwable {
		Driver.findElement(By.xpath(".//*[@id='submit']")).click();
	}

	@And("^Close browser$")
	public void Close_browser() throws Throwable {
		WebBrowser.Close();
		// driver.quit();
	}

	@When("^Click on the link Partial Link Test$")
	public void Click_on_the_link() throws Throwable {
		Driver.findElement(By.partialLinkText("Partial")).click();
	}

	@Then("^Click on the another link Link Test$")
	public void ClickonAnotherlink() throws Throwable {
		Driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/p[2]/a/strong")).click();
		//Driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/p[2]/a/strong")).click();
	}
	@Given("^Home page should be opened$")
	public void Home_page_should_be_opened() throws Throwable {
	   Driver.navigate().to("http://www.toolsqa.com/");
	}

	@When("^About page should be opened$")
	public void About_page_should_be_opened() throws Throwable {
	   Driver.findElement(By.xpath("//*[@id='main-nav']/li[6]/a/span")).click();
	}

	@Then("^Navigate back to home page$")
	public void Navigate_back_to_home_page() throws Throwable {
	   Driver.navigate().back();
	}

	@Then("^Navigate forward to about page$")
	public void Navigate_forward_to_about_page() throws Throwable {
	    Driver.navigate().forward();
	}

	@Then("^Refresh browser$")
	public void Refresh_browser() throws Throwable {
	    Driver.navigate().refresh();
	}
}