//P3-Apr22
package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		System.out.println(driver.getTitle());
		
		JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
		String titleByJS=jsUtil.getTitleBYJS();
		System.out.println(titleByJS);
		
	}

}
