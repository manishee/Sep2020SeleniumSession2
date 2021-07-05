//** Dec 3-P2***
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementExceptionConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//find Element -> creates the webelement
		WebElement url_ele=driver.findElement(By.id("Form_submitForm_subdomain"));
		
		url_ele.sendKeys("learnautomation.com");//-->sendkeys is used to write/type in the text box
		
		driver.navigate().refresh();
		
		url_ele=driver.findElement(By.id("Form_submitForm_subdomain"));
		url_ele.sendKeys("learnautomation1234.com");
		//StaleElementReferenceException: 
		//stale element reference: element is not attached to the page document
		
		
	}

}
