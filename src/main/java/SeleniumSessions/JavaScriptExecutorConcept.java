//P3-Apr22
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://classic.crmpro.com/index.html");
		driver.get("https://authentication.td.com/uap-ui/index.html?consumer=easyweb&locale=en_CA#/login/easyweb-getting-started");
		//System.out.println(driver.getTitle());//using selenium
		
		JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
		
//		String titleByJS=jsUtil.getTitleByJS();//using JS
//		System.out.println(titleByJS);
		Thread.sleep(3000);
		
		//jsUtil.refreshBrowserByJS();
		
		
		//jsUtil.generateAlert("Hi, welcome to js alert");
		
//		String pageText=jsUtil.getPageInnerText();
//		System.out.println(pageText);
		
//		WebElement element=driver.findElement(By.linkText("Sign Up"));
//		jsUtil.clickElementByJS(element);
		
		//TD example
		jsUtil.sendKeysUsingWithId("username100", "selenium@test100.com");
	}

}
