//Ap-12 p3
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	public static void main(String[] args) {

		//ExplicitWait:
		//1. WebDriverWait extends FluentWait
		//2. FluentWait
		//both are implementing Wait interface
		
		
		//1. WebDriverWait: is a class
		//is a dynamic wait
		//its a custom wait for a specific element
		//not a global wait
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("test@gmail.com");;
		//wait.until(ExpectedConditions.titleContains("CRMPRO"));		
		System.out.println(driver.getTitle());

		 
		
		
	}

}
