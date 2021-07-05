//P1-May 20
package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TEKsystemsTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.teksystems.com/en-ca");
	}
	

	@Test(priority=1, groups="Title")
	public void tekTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=5, groups="Logo")
	public void tekLogoTest() {
		boolean b=driver.findElement(By.className("navbar-brand")).isDisplayed();
	}
	
	@Test(priority=6, groups="Link")
	public void tekLinkTest() {
		boolean b=driver.findElement(By.linkText("Sign Up")).isDisplayed();
	}
	
	@Test(priority=4, groups="Test")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority=2, groups="Test")
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(priority=3, groups="Test")
	public void test3() {
		System.out.println("test3");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
