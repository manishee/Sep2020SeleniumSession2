//p1-Ap22
package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://authentication.td.com/uap-ui/index.html?consumer=easyweb&locale=en_CA#/login/easyweb-getting-started");
		
		By emailId=By.id("username100");
		
//		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)//top casting
//							.withTimeout(Duration.ofSeconds(15))
//							.pollingEvery(Duration.ofSeconds(2))
//							.ignoring(NoSuchElementException.class)
//							.ignoring(StaleElementReferenceException.class);
//		
//		wait.until(ExpectedConditions.presenceOfElementLocated(emailId)).sendKeys("test@gmail.com");
//		
		waitforElementWithFluentWait(emailId, 10, 1).sendKeys("test@td.com");
		
	}
	
	public static WebElement waitforElementWithFluentWait(By locator, int timeOut, int pollingTime) {
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)//top casting
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class);
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	

}
