// *** P2-Feb 22****
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		
		By linkParent=By.className("menulink");
		//By linkChild=By.linkText("COURSES");
		By linkChild=By.linkText("ARTICLES");
	
		//for any method of Action class .build() and .perform() methods have to be used
		
//		Actions act=new Actions(driver);
//		act.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("COURSES")).click();
		
		doGetMoveToElement(linkParent, linkChild);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doGetMoveToElement(By locatorParent, By locatorChild) {
		Actions act=new Actions(driver);
		act.moveToElement(getElement(locatorParent)).build().perform();
		getElement(locatorChild).click();
	}
	
}
