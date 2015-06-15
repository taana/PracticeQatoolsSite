package QaToolsRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class SetUpBrowser {
protected WebDriver driver;

public SetUpBrowser (WebDriver driver){
	this.driver = driver;
	driver= new FirefoxDriver();
}


	public WebDriver openBrowser(){
driver.navigate().to("http://www.toolsqa.com/automation-practice-form/");
return driver;

	}
 public WebDriver  manageBrowser(){
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;
 }
	
	public void closeBrowser(){
		if(driver!=null)
			driver.quit();
	}
}