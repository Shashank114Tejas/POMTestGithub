package Mayur.POMProject;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class SortTets extends BaseTest {
	public void VerifySort() {
		loginP.loginMethod();
		Select sl = new Select(homeP.filterList);
		sl.selectByVisibleText("Name (Z to A)");
		//System.out.println("Name (Z to A)");
		homeP.printItem();
	
		
	}

}
