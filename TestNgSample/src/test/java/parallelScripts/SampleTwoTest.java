package parallelScripts;

import org.testng.annotations.Test;

public class SampleTwoTest {
	@Test
	  public void testOne() {
		long id= Thread.currentThread().getId();
		  System.out.println("Test1 in SampleTwoTest..."+id);
	  }
	  
	  @Test
	  public void testTwo() {
		  long id= Thread.currentThread().getId();
		  System.out.println("Test2 in SampleTwoTest..."+id);
	  }
	  
	  @Test
	  public void testThree() {
		  long id= Thread.currentThread().getId();
		  System.out.println("Test3 in SampleTwoTest..."+id);
	  }
	  
	  @Test
	  public void testFour() {
		  long id= Thread.currentThread().getId();
		  System.out.println("Test4 in SampleTwoTest..."+id);
	  }
	  
	  
	  
	}

