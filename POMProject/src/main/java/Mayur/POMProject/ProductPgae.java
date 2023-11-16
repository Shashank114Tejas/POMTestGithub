package Mayur.POMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPgae extends BaseClass {
	
	@FindBy (xpath= "//button[text()='Add to cart']")
	WebElement addToCart;

	@FindBy(xpath ="//div[@class='inventory_details_name large_size']")
	WebElement productheader;
	
	@FindBy (id= "shopping_cart_container")
	WebElement cart;
	
	@FindBy(xpath ="//button[@id='back-to-products']")
	WebElement backToProducts;

	@FindBy(xpath ="//div[@class='inventory_details_price']")
	WebElement itmprice;
		
	
	
	

	public ProductPgae(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddToCart() {
		addToCart.click();
		
	}
	
	public void clickCart() {
		cart.click();
	}
	
	public String getPrice() {
		System.out.println(itmprice.getText());
		return itmprice.getText();
	}
	
	
	
}
	

