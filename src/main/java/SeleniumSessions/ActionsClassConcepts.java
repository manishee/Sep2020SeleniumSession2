// ***** P2-Feb 25 *****
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassConcepts {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By FName=By.id("Form_submitForm_FirstName");
		By LName=By.id("Form_submitForm_LastName");
		By Submit_btn=By.id("Form_submitForm_action_request");
		
		Actions act=new Actions(driver);
		
//		act.sendKeys(driver.findElement(FName), "Manish").perform();
//		act.sendKeys(driver.findElement(LName), "Chugh").perform();
//		act.click(driver.findElement(Submit_btn)).perform();

		doActionSendKeys(FName, "Manish");
		doActionSendKeys(LName, "Chugh");
		doActionsClick(Submit_btn);
		//Keys.ENTER -> to perform Enter action from your keyboard
		//act.sendKeys(Keys.ENTER).perform();
		
		act.moveToElement(driver.findElement(LName)).sendKeys("Manish").build().perform();
		
		//act.doubleClick(); --> to double click at the current location of the cursor
		//act.doubleClick(target); --> to double click on any webelement
	}
	
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}

		public static void doActionSendKeys(By locator, String value) {
			Actions act=new Actions(driver);
			act.sendKeys(getElement(locator), value).perform();
		}
		
		public static void doActionsClick(By locator) {
			Actions act=new Actions(driver);
			act.click(getElement(locator)).perform();
		}
		
		public static void doSendKeysWithMoveToElement(By locator, String value) {
			Actions act=new Actions(driver);
			act.moveToElement(getElement(locator)).sendKeys(value).build().perform();
		}
		
		public static void doClickWithMoveToElement(By locator) {
			Actions act=new Actions(driver);
			act.moveToElement(getElement(locator)).click().build().perform();
		}
}
