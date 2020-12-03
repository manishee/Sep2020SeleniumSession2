//**Dec 3-P1**
package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcepts {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
	
	
	driver.navigate().to("https://www.amazon.com");
	System.out.println(driver.getTitle());
	
	
	
	//Internally navigate().to() method calls the .get()method only.
	//Both these methods take just one parameter i.e. String
	//These methods are synonyms to each other
	
	driver.navigate().back();
	System.out.println(driver.getTitle());
	
	driver.navigate().forward();
	System.out.println(driver.getTitle());
	
	driver.navigate().back();
	System.out.println(driver.getTitle());
	
	driver.navigate().refresh();
	
	}

}
