package Mayur.POMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	String standardUser ="standard_user";
	String locked ="locked_out_user";
	String problem ="problem_user";
	String password ="secret_sauce";

	/**
	 * WebElements
	 */
//	@FindBy(id = "user-name")
//	WebElement userNameField;
	
	 public WebElement getUserNameField() {
	        return driver.findElement(By.id("user-name"));
	    }
	 
	 public void setUserNameField(String userName) {
		 getUserNameField().sendKeys(userName);
	    }
	 
//	@FindBy(id="password")
//	WebElement passwordField;
	 
	
	 public WebElement getPasswordField() {
	        return driver.findElement(By.id("password"));
	    }
	 
	 public void setPasswordField(String password) {
		 getPasswordField().sendKeys(password);
	    }
	 
//	@FindBy(id="login-button")
//	WebElement loginButton;
	
	public WebElement getLoginButton() {
        return driver.findElement(By.id("login-button"));
    }
	
	
	
	/*
		Initialization of locators/variables
	*/
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	
	/*
	 * Methods
	 */
	
	


	public void loginMethod() {
		setUserNameField(standardUser);
		setPasswordField(password);
		getLoginButton().click();
	}
}
