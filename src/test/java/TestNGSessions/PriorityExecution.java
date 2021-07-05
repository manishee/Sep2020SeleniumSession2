//May 6 - p1
package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityExecution {
	//In case few test cases don't have any priority defined and few have priority defined
	//then the test cases which don't have priority defined will be executed first 
	//based on the alphabetical order. But in case there is a priority defined with a negative value
	//then that test cases takes precedence and will be executed first
	
	@Test(priority = -1)
	public void firstTest() {
		System.out.println("First Test-c");
	}
	@Test
	public void secondTest() {
		System.out.println("Second Test-b");
	}
	@Test
	public void thirdTest() {
		System.out.println("Third Test-d");
	}
	@Test(priority = 3)
	public void fourthTest() {
		System.out.println("Fourth Test-e");
	}
	@Test(priority = 1)
	public void fifthTest() {
		System.out.println("Fifth Test-a");
	}
	
	
}
