//p1-June 10
package SeleniumSessions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenerateLogs {

	public static void main(String[] args) {
		
		String log4jConfPath="/Users/mchugh/Desktop/Manish/Sep2020SeleniumSession2/Log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		
		Logger log=Logger.getLogger(GenerateLogs.class);//generate logs for this class
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		log.info("launching browser");
		log.info("browser has been launched");
		
		driver.get("https://www.teksystems.com/");
		log.info("navigated to teksystems.com website");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		log.info("the title of the page is " +driver.getTitle());
		log.info("captured the title of the page");
		
		if(title.equals("TEKsystems. Let's own change, together.")) {
			System.out.println("correct title");
			log.info("correct title and the test case is passed");
		}else {
			System.out.println("Incorrect title");
			log.info("Incorrect title and the test case is failed");
		}
			
		log.info("quit the browser");
		driver.quit();
	}

}
