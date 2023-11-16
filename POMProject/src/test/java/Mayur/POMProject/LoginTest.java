package Mayur.POMProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;


public class LoginTest extends BaseTest{

	@Test
	public void verifylogin() {
	loginP.loginMethod();
		String textOnPage = homeP.header.getText();
		AssertJUnit.assertEquals(textOnPage, "Products");
	}
	
	
	
	
	
	
	
}
