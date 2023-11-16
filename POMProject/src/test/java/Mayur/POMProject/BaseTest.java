package Mayur.POMProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends BaseClass{
 
	@BeforeClass
	public void SetUp() {
		//WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(op);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
	}
	
	@BeforeClass
	public void objectmethod() {
		loginP = new LoginPage(driver);
		homeP = new HomePage(driver);
		productP = new ProductPgae(driver);
		cartP =new CartPage(driver);
	}
	@AfterMethod
	public void ScreenshotOnFail(	ITestResult result) throws WebDriverException, IOException {
	if(result .getStatus() == ITestResult.FAILURE){
		System.out.println("Failed "+result.getMethod().getMethodName());
		String randomNumber = "ss"+Math.random();
		String directory = System.getProperty("user.dir") + "//ScreenShot//";
		TakesScreenshot ss = (TakesScreenshot)driver;
		FileHandler.copy(ss.getScreenshotAs(OutputType.FILE), new File(directory+randomNumber+".png"));
		}
	driver.get("https://www.saucedemo.com/");
	}
	


	@AfterClass
	public void cleanUp() {
		
	}
	@AfterClass
	public void Close() {
		driver.quit();
	}
}
