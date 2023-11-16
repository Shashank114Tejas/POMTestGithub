package Mayur.POMProject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

	@FindBy(xpath ="//span[text()='Products']")
	WebElement header;

	@FindBy(xpath ="//div[@class='inventory_item_name']")
	List<WebElement> inventry;

	
	@FindBy (xpath = "//button[text()='Remove']")
	List<WebElement >removeBtns;

	@FindBy (xpath= "//button[contains(@id,'add-to-cart')]")
	List<WebElement> addToCartBtns;
	
	@FindBy(xpath = "//img[@class='inventory_item_img']")
	List<WebElement> productImages;
	
	@FindBy (id="react-burger-menu-btn")
	WebElement menu;  
	
	@FindBy (id="logout_sidebar_link")
	WebElement logout;
	
	@FindBy (id ="add-to-cart-sauce-labs-fleece-jacket")
	WebElement jacketaddToCart;
	
	@FindBy (id= "shopping_cart_container")
	WebElement cart;
	
	@FindBy (xpath ="//select[@class='product_sort_container']")
	WebElement filterList;
	@FindBy(xpath = "//button[text()='Remove']")
	WebElement removeBtn;
	
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String urlOfPage() {
		return driver.getCurrentUrl();
	}
	
	public String selectItem() {
		
		for(WebElement item : inventry) {			
			if(item.getText().contains(productName)) 
				System.out.println(item.getText());
			return item.getText();
		}
		return null;
	}
	
	
	public boolean printItem() {
		for(WebElement item : inventry) {
		System.out.println(item.getText());
		if (item.getText().isEmpty())
			return false;
			}
		return true;
	}
	
	
	
	
	public void addtocart() {
		jacketaddToCart.click();
	
	}
	public boolean removeProduct() {
		for(WebElement remove :removeBtns) {
			if(remove.getText().equalsIgnoreCase("Remove")) {
				remove.click();
				System.out.println("product removed");
				return true;
			}
		}
		return false;
		
	}
		
	public void clickCart() {
		cart.click();
	}
	
	public void logoutMethod() {
		menu.click();
		logout.click();
	}
	
	public void AddProductToCart(String ProductName){
		for(WebElement button : addToCartBtns) {
			if (button.getAttribute("id").contains(ProductName)) {
				button .click();
			}
		}
	}
	
	public void navigateToProductPage(String ProductName){
		for(WebElement image : productImages) {
			
			if (image.getAttribute("alt").toLowerCase().contains(ProductName)) {
				image .click();
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}
