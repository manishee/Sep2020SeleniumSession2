//P2-Apr22
package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptUtil {

	WebDriver driver;
	
	public JavaScriptUtil(WebDriver driver) {
		this.driver=driver;
		
	}
	/**
	 * Get title using javascript
	 * @return - title
	 */
	public String getTitleBYJS() 
	{ 
	JavascriptExecutor js = (JavascriptExecutor) driver;
	return js.executeScript("return document.title;").toString();
	}

	
	
	
	
	
	
	
	
}
