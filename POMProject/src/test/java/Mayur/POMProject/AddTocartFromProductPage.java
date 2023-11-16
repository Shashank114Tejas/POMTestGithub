package Mayur.POMProject;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddTocartFromProductPage extends BaseTest {
	@Test
	public void VerifyAddToCartFromProductPage() {
		loginP.loginMethod();
		homeP.navigateToProductPage(productName);
		productP.getPrice();
		productP.clickAddToCart();
	
		productP.clickCart();
		cartP.isproductincart();
		System.out.println("product is in the cart");
		Assert.assertTrue(cartP.isproductincart());
		
	}
}
