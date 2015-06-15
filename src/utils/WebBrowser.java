package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBrowser {
	
	private static WebDriver instance;
	
	private WebBrowser(){}
	
	public static WebDriver getInstance(){
		if (instance == null){
			instance = new FirefoxDriver();
			instance.manage().window().maximize();
			instance.get("http://www.toolsqa.com/automation-practice-form/");
			
		}
		return instance;
	}
	
	public static void Close(){
		if (instance !=null){
			instance.quit();
			instance = null;
		}
	}
	

}
