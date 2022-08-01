package Helper;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class CommonMethod {
	public WebDriver driver;
	// public JavascriptExecutor js = (JavascriptExecutor) driver;
	static Logger logger = Logger.getLogger(CommonMethod.class.getName());
	
	
	By wikipediaSearchBox=By.xpath(("//*[@id='searchInput']"));
	By wikipediaSearchButton=By.xpath(("//*[@class='pure-button pure-button-primary-progressive']"));
	
   public CommonMethod(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void wikipediapage() throws InterruptedException {
		
		Thread.sleep(3000);
		//js.executeScript("scroll(0,450)");
		WebElement SearchBox= driver.findElement(wikipediaSearchBox);
		Thread.sleep(1000);
	    SearchBox.sendKeys("Apollo 11");
	    driver.findElement(wikipediaSearchButton).click();
	    Thread.sleep(2000);
	}

  public void validation() throws InterruptedException {
	  Thread.sleep(3000);
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://en.wikipedia.org/wiki/Apollo_11" );
	  System.out.println("URL matching --> Part executed");
	  
  }
}
