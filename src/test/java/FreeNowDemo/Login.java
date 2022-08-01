package FreeNowDemo;
import java.awt.Window;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Helper.CommonMethod;
//import org.junit.Test;
//import Helper.CommonMethod;
import Program.base;



	public class Login extends base  {
		static Logger logger= Logger.getLogger(Login.class.getName());
		public WebDriver driver;
			
	@BeforeTest
	public void initialize() throws IOException {
		driver=InitlializeDriver1();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	}
	@Test
	  public void login() throws InterruptedException, IOException  {
		//created the base class and call the method here
		    JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.get("https://www.wikipedia.org/");
			CommonMethod commonmethod= new CommonMethod(driver);
			commonmethod.wikipediapage();
			commonmethod.validation();
	}
	@AfterTest
	public void close() {
		driver.quit();
	  }

}	


