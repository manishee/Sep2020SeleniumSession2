//June 7-P1
package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadProp {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		//how to read config.properties file
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("/Users/mchugh/Desktop/Manish/Sep2020SeleniumSession2/src/main/java/SeleniumSessions/config.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));// how to read a property from config.properties file
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if (browserName.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(browserName.equals("safari")) {
			driver=new SafariDriver();
		}
		
		
		driver.get(prop.getProperty("env"));
		Thread.sleep(3000);
		driver.findElement(By.name(prop.getProperty("username_name"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name(prop.getProperty("password_name"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("loginBtn_xpath"))).click();
		Thread.sleep(3000);
		boolean b=driver.findElement(By.id(prop.getProperty("crmlogo_id"))).isDisplayed();
		System.out.println(b);
	}

}
