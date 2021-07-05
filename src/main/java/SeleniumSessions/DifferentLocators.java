//**** P1-Dec 10**
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentLocators {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//Thread.sleep(6000);
		
		//1. id:unique
		
		//2. name : not unique
		//driver.findElement(By.name("FirstName")).sendKeys("Manish");
		
		//3. xpath -> is not an attribute, its a locator(address of the element in DOM)
		//driver.findElement(By.xpath("//*[@id=\"Form_submitForm_FirstName\"]")).sendKeys("Manish");
		
		//4. css selector -> not an attribute, its a locator
		//driver.findElement(By.cssSelector("#Form_submitForm_LastName")).sendKeys("Manish");
		
		//5. linkText: only for links:having <a> html tag
		//driver.findElement(By.linkText("ES")).click();
		
		//6. partialLinkText: only for links -> long link text
		//driver.findElement(By.partialLinkText("Privacy")).click();
		
		//7. tagName -> used to get the elements on a page, like total No. of Links, images
//		driver.get("https://www.freework.com");
//		Thread.sleep(6000);
//		
//		String h2_text=driver.findElement(By.tagName("h2")).getText();
//		System.out.println(h2_text);
//		
//		String text=driver.findElement(By.linkText("Sign up")).getText();
//		System.out.println(text);
		
		//8. className : not unique
		driver.get("https://authentication.td.com/uap-ui/index.html?consumer=easyweb&locale=en_CA#/login/easyweb-getting-started");
		Thread.sleep(6000);
		
		driver.findElement(By.className("otp-always-show-error")).sendKeys("123345345");
		
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		
		//username -> ng-pristine ng-valid form-control ng-empty ng-untouched
		//password -> otp-always-show-error ng-pristine ng-untouched ng-valid form-control ng-empty
	}
	

}
