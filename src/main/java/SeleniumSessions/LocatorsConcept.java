//** Dec 3-P2***
package SeleniumSessions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();	
		driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//Creating the webelement + action(click, sendkeys, gettext)
		//1:id
		
		//1st way
//		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("Manish");
//		driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("Chugh");
//		Thread.sleep(5000);
//		
//		driver.findElement(By.id("Form_submitForm_action_request")).click();
		
		//2nd way
		
//		WebElement FName=driver.findElement(By.id("Form_submitForm_FirstName"));
//		WebElement LName=driver.findElement(By.id("Form_submitForm_LastName"));
//		WebElement Submit_btn=driver.findElement(By.id("Form_submitForm_action_request"));
//		
//		FName.sendKeys("Manish");
//		FName.sendKeys("Tenveer");
//		LName.sendKeys("Chugh");
//		
//		Submit_btn.click();
		
		//3rd way
//		By FName=By.id("Form_submitForm_FirstName");
//		By LName=By.id("Form_submitForm_LastName");
//		By Submit_btn=By.id("Form_submitForm_action_request");
		
//		WebElement FName_ele=driver.findElement(FName);
//		WebElement LName_ele=driver.findElement(LName);
//		WebElement Submit_btn_ele=driver.findElement(Submit_btn);
//		
//		FName_ele.sendKeys("Manish");
//		LName_ele.sendKeys("Chugh");
//		Submit_btn_ele.click();
		
		//4th
//		getElement(FName).sendKeys("Manish");
//		getElement(LName).sendKeys("Chugh");
//		getElement(Submit_btn).click();
		
		//5th
//		doSendKeys(FName, "Manish");
//		doSendKeys(LName, "Chugh");
//		doClick(Submit_btn);
		
		//6th
		
		String FName_id="Form_submitForm_FirstName";
		String LName_id="Form_submitForm_LastName";
		String Submit_btn_id="Form_submitForm_action_request";
		
		doSendKeys(getLocator(FName_id), "Manish");
		doSendKeys(getLocator(LName_id), "Chugh");
		doClick(getLocator(Submit_btn_id));
		
	}
		public static By getLocator(String value) {
			return By.id(value);
		}
	
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		public static void doSendKeys(By locator, String value) {
			getElement(locator).sendKeys(value);
		}
		
		public static void doClick(By locator) {
			getElement(locator).click();
		}

}
