package Mayur.POMProject;

import org.testng.Assert;

import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

	@Test
	public void VerifyLogout() {
		loginP.loginMethod();
		String textOnPage = homeP.header.getText();
		System.out.println(textOnPage);
		
		homeP.logoutMethod();
		Assert.assertTrue(loginP.getLoginButton().isDisplayed());
	}
}
