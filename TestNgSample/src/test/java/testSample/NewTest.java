package testSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		
	}
	
  @Test(priority = -1, alwaysRun =true, dependsOnMethods = "javaSearch")
  public void cypressSearch() {
	  
	  driver.get("https://www.google.com/");
	  WebElement srcBox = driver.findElement(By.tagName("textarea"));
			  srcBox.sendKeys("Cypress Tutorial");
	  		srcBox.submit();
	  		Assert.assertEquals(driver.getTitle(), "Cypress Tutorial - Google Search");
  }
  
  
  @Test(priority = 0)
  public void javaSearch() {
	  
	  driver.get("https://www.google.com/");
	  WebElement srcBox = driver.findElement(By.tagName("textarea"));
			  srcBox.sendKeys("Java Tutorial");
	  		srcBox.submit();
	  		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
  }
  
  @Test(priority = 3, enabled=false)
  public void seleniumSearch() {
	  
	  driver.get("https://www.google.com/");
	  WebElement srcBox = driver.findElement(By.tagName("textarea"));
			  srcBox.sendKeys("Selenium Tutorial");
	  		srcBox.submit();
	  		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
  }
  
  @AfterMethod
  
  private void driverClose() {
	// TODO Auto-generated method stub
	  
	  driver.close();

}
}

