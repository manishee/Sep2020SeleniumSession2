//**** Dec 14-P1*****
package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	WebDriver driver;
	
	/**
	 * 
	 * @param browserName
	 * @return this method returns driver
	 */
	public WebDriver init_driver(String browserName) {
		
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();					
		}else if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else {
			System.out.println("please pass the correct browser " + browserName);
		}
		return driver;
	}
	/**
	 * This is used to launch the url using get method
	 * @param url
	 */
	public void launchUrl(String url) {
		System.out.println("url = " + url);
		driver.get(url);
	}
	/**
	 * This is used to navigate to the url using navigate().to() method
	 * @param url
	 */
	public void navigateToUrl(String url) {
		System.out.println("url = " + url);
		driver.navigate().to(url);
	}
	/**
	 * 
	 * @return this method returns the page title
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}
	/**
	 * it quits the browser
	 */
	public void quitBrowser() {
		driver.quit();
	}
	/**
	 * it closes the browser
	 */
	public void closeBrowser() {
		driver.close();
	}

}
