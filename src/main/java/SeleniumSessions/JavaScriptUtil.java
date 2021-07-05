//P2-Apr22
package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

	WebDriver driver;
	
	public JavaScriptUtil(WebDriver driver) {
		this.driver=driver;
		
	}
	/**
	 * Get title using javascript
	 * @return - title
	 */
	public String getTitleByJS() 
	{ 
	JavascriptExecutor js = (JavascriptExecutor) driver;
	return js.executeScript("return document.title;").toString();
	}
	/**
	 * This method refreshes the webpage
	 */
	public void refreshBrowserByJS() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}
	/**
	 * This method creates an alert with the user defined message
	 * @param message in form of string
	 */
	public void generateAlert(String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('" + message + "')");
	}
	/**
	 * 
	 * @return --> returns the text from a web page
	 */
	public String getPageInnerText() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("return document.documentElement.innerText;").toString();
	}
	/**
	 * This method clicks on a web element
	 * @param element
	 */
	public void clickElementByJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	/**
	 * This method writes text inside a webelement
	 * @param id
	 * @param value
	 */
	public void sendKeysUsingWithId(String id, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('" + id + "').value='" + value + "'");
	}

	/**s
	 * This method scrolls down to the bottom of a webpage
	 */
	public void scrollPageDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	/**
	 * This method scrolls down to specific height
	 * @param height
	 */
	public void scrollPageDown(String height) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, '" + height + "')");
	}	
	/**
	 * This method scrolls up to top of the page
	 * 
	 */
	public void scrollPageUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}
	/**
	 * This method scrolls down to the visibility of a specific web element
	 * 
	 */
	public void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
}
