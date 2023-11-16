package Mayur.POMProject;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteProduct extends BaseTest{

	@Test(priority=0)
	public void verifyDeleteFromCart() {
	loginP.loginMethod();
	homeP.selectItem();
	System.out.println("Item Found");
	homeP.addtocart();
	System.out.println("product is in the cart");
	Assert.assertEquals(false, false);
}
	@Test(priority=1)
	public void verifyDeleteFromHomePage() {
		
		loginP.loginMethod();
		for(WebElement item : homeP.inventry) {
			if(item.getText().contains(productName)) 
				item.click();
			break;
			}
		System.out.println("Item selected");
		productP.clickAddToCart();
		System.out.println("Item selected");
		
		homeP.removeProduct();
		
		System.out.println("product is removed from the cart");
		Assert.assertTrue(homeP.removeProduct());
	}
}
