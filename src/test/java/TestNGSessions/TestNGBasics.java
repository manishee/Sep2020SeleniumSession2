//p1-May 3
package TestNGSessions;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	//testNG--> TestNextGeneration... a unit testing tool
	//is used to design, maintain and run the test cases
	//Annotations to write the test steps and test cases
	
	//Pre Condition --> Test Case Steps(Actual vs Expected) --> Post Steps
	//launch Chrome ->enter the url(Google vs Google) -->Close the browser
//------------------------------------------------------------------------	
	/**
	 * 
	BS --> setup
	BT --> launchBrowser
	BC --> login
	BM --> enterURL
	Test --> getTitleTest
	AM --> Logout
	AC --> closeBrowser
	AT --> deleteAllCookies
	AS --> generateReport
	 */
//-----------------------------------------------------------------------	
	
	/**
	 * 
BS --> setup
BT --> launchBrowser
BC --> login

	BM --> enterURL
		Test --> getTitleTest
	AM --> Logout
	
	BM --> enterURL
		Test --> verifyUserdeactivatedTest
	AM --> Logout
	
AC --> closeBrowser
AT --> deleteAllCookies
AS --> generateReport
	 */
//-----------------------------------------------------------------------
	
	
	//by default the execution happens in the alphabetical order 
	
	@BeforeSuite
	public void setUp() {
		System.out.println("BS --> setup");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("BT --> launchBrowser");
	}

	@BeforeClass
	public void login() {
		System.out.println("BC --> login");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("BM --> enterURL");
	}
	
	@Test
	public void getTitleTest() {
		System.out.println("Test --> getTitleTest");
		int z=1/0;
	}
	
	@Test
	public void verifyUserdeactivatedTest() {
		System.out.println("Test --> verifyUserdeactivatedTest");
	}
	
	@Test
	public void createuserTest() {
		System.out.println("Test --> createuserTest");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM --> Logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC --> closeBrowser");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("AT --> deleteAllCookies");
	}
	
	@AfterSuite
	public void generateReport() {
		System.out.println("AS --> generateReport");
	}
	
}
