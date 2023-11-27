package testSample;

import org.testng.annotations.Test;

public class SampleFourTest {
  
	@Test
	  public void testOne() {
		  System.out.println("Test1 in SampleFourTest");
	  }
	  
	  @Test(groups = "FeatureOne")
	  public void testTwo() {
		  System.out.println("Test2 in SampleFourTest");
	  }
	  
	  @Test
	  public void testThree() {
		  System.out.println("Test3 in SampleFourTest");
	  }
	  
	  @Test
	  public void testFour() {
		  System.out.println("Test4 in SampleFourTest");
	  }
	  
}
