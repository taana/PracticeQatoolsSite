package QaToolsRunner;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.WebBrowser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsSwitchingWindows {

	// public StepsSwitchingWindows(WebDriver driver) {
	// super(driver);
	// TODO Auto-generated constructor stub

	WebDriver Driver = WebBrowser.getInstance();

	@Given("^Navigate to Automation Practice Switch Windows page$")
	public void Navigate_to_Automation_Practice_Switch_Windows_page()
			throws Throwable {
		Driver.navigate().to("http://www.toolsqa.com/automation-practice-switch-windows/");
	}

	@When("^Get Window name$")
	public void Geh_Window_name() throws Throwable {
		String handle = Driver.getWindowHandle();
		System.out.println(handle);

	}

	@Then("^Click on New Message Window$")
	public void ClickNewMessageWindow() throws Throwable {
	//WebDriverWait wait = new WebDriverWait(Driver,10) ;
	//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='content']/p[3]/button")));
		Driver.findElement(By.xpath(".//*[@id='content']/p[4]/button")).click();
		//Driver.findElement(By.cssSelector("#content>p>button")).click();
		
	}

	@Then("^Get all the Windows names$")
	public void Get_all_the_Windows_names() throws Throwable {
		Set handles = Driver.getWindowHandles();
		System.out.println(handles);
		for (String handle1 : Driver.getWindowHandles()) {
			Driver.switchTo().window(handle1);
		}

	}

	@Then("^Close the pop up window$")
	public void Close_the_pop_up_window() throws Throwable {
		Driver.close();
	}
}