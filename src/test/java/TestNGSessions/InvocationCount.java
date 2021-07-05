//May6-P3
package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 10)
	public void signUp() {
		System.out.println("Sign up");
	}
	
	
}
