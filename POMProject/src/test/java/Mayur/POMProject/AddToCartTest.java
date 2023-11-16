package Mayur.POMProject;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

@Test
	public void VerifyAddToCartFromHome() {
	
	loginP.loginMethod();
	
	homeP.AddProductToCart(productName);
	
	Assert.assertTrue(cartP.isproductincart());
	}
		

}
