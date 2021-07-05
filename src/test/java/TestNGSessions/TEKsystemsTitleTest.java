//May 20-p2

package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TEKsystemsTitleTest {

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
	@Test
	public void tekTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "TEKsystems. Let's own change, together.", "title is not correct");
	}
	
	@Test
	public void tekLogoTest() {
		boolean b=driver.findElement(By.className("navbar-brands")).isDisplayed();
		Assert.assertTrue(b);
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
