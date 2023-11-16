package Mayur.POMProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

	
	@Test
	public void verifyHompageUrl() {
		loginP.loginMethod();
		boolean result=false;
		if(homeP.urlOfPage().equals("https://www.saucedemo.com/inventory.html")) {
		 result = true;
	}
		Assert.assertTrue(result);
		
	}
	

	
	
	
}
