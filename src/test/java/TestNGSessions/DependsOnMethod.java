//May 6-P2
package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void signUpTest()
	{
		System.out.println("Sign Up Test");
		//int x=3/0;
	}

	@Test(dependsOnMethods = "signUpTest")
	public void registerationTest() {
		System.out.println("registeration test");
	}

	@Test(dependsOnMethods = "signUpTest")
	public void verificationTest() {
		System.out.println("verification test");
	}
}

	
