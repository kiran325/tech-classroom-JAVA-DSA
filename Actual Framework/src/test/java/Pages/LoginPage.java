package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * PAGE OBJECT for the Login page (https://www.saucedemo.com/)
 *
 * RULE: This class NEVER contains assertions (no Assert.xxx here).
 * Its only job is to represent the page and expose ACTIONS on it.
 * Verification/assertions belong in the test class, not the page class.
 */

public class LoginPage {
	
	private WebDriver driver;
	
	// @FindBy tells Selenium WHERE this element lives on the page.
    // This is the ONLY place in the entire framework where this locator is written.
	
	 @FindBy(id = "user-name")
	 private WebElement usernameInput;

	    @FindBy(id = "password")
	    private WebElement passwordInput;

	    @FindBy(id = "login-button")
	    private WebElement loginButton;

	    @FindBy(css = "[data-test='error']")
	    private WebElement errorMessage;

	   //CONSTRUCTOR: every Page Object receives the driver and initializes
	   // its own @FindBy elements via PageFactory. This is boilerplate
	   // you'll type for every page class.
	    
 public LoginPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  
  }
 
 	//ACTION METHODS -- these are what your test classes will call.
 	// Notice how readable this makes tests: loginPage.login("x", "y")
 	// instead of 3 separate findElement + sendKeys/click lines.

 public void enterUsername(String username) {
     usernameInput.clear();
     usernameInput.sendKeys(username);
 }

 public void enterPassword(String password) {
     passwordInput.clear();
     passwordInput.sendKeys(password);
 }

 public void clickLoginButton() {
     loginButton.click();
 }

 	// A "composite" action -- combines the 3 steps above into one
 	// convenient call for the common case (valid login flow)
 public void login(String username, String password) {
     enterUsername(username);
     enterPassword(password);
     clickLoginButton();
 }

 	// GETTER -- returns data so the TEST can assert on it.
 	// The page object fetches the text; it does NOT decide pass/fail.
 public String getErrorMessage() {
     return errorMessage.getText();
 
 }

}
