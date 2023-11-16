package Mayur.POMProject;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public String url ="https://www.saucedemo.com/";
	protected HomePage homeP;
	protected LoginPage loginP;
	protected CartPage cartP;
	protected ProductPgae productP;
	public String randomNumber = "ss"+Math.random();
	String productName ="backpack";
	
	
	
	
	
}
