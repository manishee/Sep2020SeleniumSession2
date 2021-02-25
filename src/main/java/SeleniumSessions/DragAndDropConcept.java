// *** P3-Feb 22****
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		Thread.sleep(3000);
		
		By sourceElement=By.id("draggable");
		By targetElement=By.id("droppable");
		
//		WebElement sourceElement=driver.findElement(By.id("draggable"));
//		WebElement targetElement=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
//		act
//		.clickAndHold(sourceElement)
//		.moveToElement(targetElement)
//		.release()
//		.build()
//		.perform();
		
//		act.dragAndDrop(sourceElement, targetElement).perform();
		
		doSelectDragAndDrop(sourceElement, targetElement);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDragAndDrop(By sourceLocator, By destinationLocator) {
		Actions act=new Actions(driver);
		act.dragAndDrop(getElement(sourceLocator), getElement(destinationLocator)).perform();
	}
	}


