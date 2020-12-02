//*** Dec2-P1****
package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", "/Users/mchugh/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
	}

}
