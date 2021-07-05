//Apr 12-P1
package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/");
		
		//Thread.sleep(5000); -> static wait
		//Implicitly wait - dynamic wait
		//it is only for web elements
		//its not applicable for non web elements -- title, url, alerts
		//its a global wait -> will be applied for all web elements by default
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test@123");
		driver.findElement(By.id("loginBtn")).click();
		//e4
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//e5
		//e6
		//e7
	}

}
