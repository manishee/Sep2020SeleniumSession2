//** Dec 3-P2***
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		
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
		
		WebElement FName=driver.findElement(By.id("Form_submitForm_FirstName"));
		WebElement LName=driver.findElement(By.id("Form_submitForm_LastName"));
		WebElement Submit_btn=driver.findElement(By.id("Form_submitForm_action_request"));
		
		FName.sendKeys("Manish");
		FName.sendKeys("Tenveer");
		LName.sendKeys("Chugh");
		
		Submit_btn.click();
		
		
		
	}

}
