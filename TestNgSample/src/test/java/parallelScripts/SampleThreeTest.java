package parallelScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleThreeTest {
	@Test
	  public void testOne() {
		WebDriver driver= new ChromeDriver();
		long id= Thread.currentThread().getId();
		  System.out.println("Test1 in SampleThreeTest..."+id);
		  driver.close();
	  }
	  
	  @Test
	  public void testTwo() {
		  WebDriver driver= new ChromeDriver();
		  long id= Thread.currentThread().getId();
		  System.out.println("Test2 in SampleThreeTest..."+id);
		  driver.close();
	  }
	  
	  @Test
	  public void testThree() {
		  WebDriver driver= new ChromeDriver();
		  long id= Thread.currentThread().getId();
		  System.out.println("Test3 in SampleThreeTest..."+id);
		  driver.close();
	  }
	  
	  @Test
	  public void testFour() {
		  WebDriver driver= new ChromeDriver();
		  long id= Thread.currentThread().getId();
		  System.out.println("Test4 in SampleThreeTest..."+id);
		  driver.close();
	  }
	  
	  
	  
	}

