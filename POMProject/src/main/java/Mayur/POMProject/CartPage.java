package Mayur.POMProject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseClass {
	
	
	@FindBy (xpath ="//div[@class='inventory_item_name']")
	List<WebElement> prodiuctsInCart;
	
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	WebElement cartBadge;
	

	
	
	
	
	
	
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean isproductincart() {	
		if (cartBadge.isDisplayed())
		return true;
		else
			return false;
		
	}
	
	
	
	
	
	
}
