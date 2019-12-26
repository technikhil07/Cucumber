package stepDefinitions;

import org.openqa.selenium.WebDriver;

import CommonFunctions.CommonFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginValidation {
	WebDriver driver;
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
	    driver=CommonFunctions.startBrowser("chrome");
	}

	@When("^Open Application$")
	public void open_Application() throws Throwable {
		CommonFunctions.openApplication(driver);
		
	   
	}

	@When("^Wait For Username$")
	public void wait_For_Username() throws Throwable {
		CommonFunctions.waitForElement(driver, "id","username", "10");
	    
	}

	@When("^Enter Username$")
	public void enter_Username() throws Throwable {
		CommonFunctions.typeAction(driver, "name","username", "admin");
	    
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
		CommonFunctions.typeAction(driver, "id", "password", "master");
	    
	}

	@When("^Wait For Password$")
	public void wait_For_Password() throws Throwable {
		CommonFunctions.waitForElement(driver, "id", "password", "10");
	   
	}
	
	

	@When("^Click on Login$")
	public void click_on_Login() throws Throwable {
		CommonFunctions.clickAction(driver, "id", "btnsubmit");
	    
	}

	@When("^Wait For Logout$")
	public void wait_For_Logout() throws Throwable {
		CommonFunctions.waitForElement(driver, "id", "logout", "10");
	   
	}

	@When("^Click on Logout$")
	public void click_on_Logout() throws Throwable {
		CommonFunctions.clickAction(driver, "id", "logout");
	    
	}

	@When("^Wait for ok$")
	public void wait_for_ok() throws Throwable {
		CommonFunctions.waitForElement(driver, "xpath", "//button[contains(text(),'OK!')", "10");
	   
	}

	@When("^Click on ok$")
	public void click_on_ok() throws Throwable {
		CommonFunctions.clickAction(driver, "xpath", "//button[contains(text(),'OK!')");
	    
	}

	@When("^CloseBrowser$")
	public void closebrowser() throws Throwable {
		CommonFunctions.closeBrowser(driver);
	    
	}


}
