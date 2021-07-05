//Apr 26-P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.ca");
		
		JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
		//jsUtil.scrollPageDown();
		//jsUtil.scrollPageDown("1200");
		Thread.sleep(2000);
		//jsUtil.scrollPageUp();
		
		WebElement element=driver.findElement(By.linkText("Explore more"));
		jsUtil.scrollIntoView(element);
		
	}

}
