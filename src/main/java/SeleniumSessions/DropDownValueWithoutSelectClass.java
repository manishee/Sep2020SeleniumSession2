//******** P2-Feb11*************
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownValueWithoutSelectClass {

		static WebDriver driver;
		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
			
			//Dropdown htmn tag is : Select
			//but we dont use Select class from Selenium
			//select a value from the dropdown
			
			By industry_options = By.xpath("//select[@id='Form_submitForm_Industry']/option");
			By country_options = By.xpath("//select[@id='Form_submitForm_Country']/option");
			
//			List<WebElement> industryList=driver.findElements(By.xpath("//select[@id='Form_submitForm_Industry']/option"));
//			System.out.println(industryList.size());
//			for(WebElement e : industryList) {
//				String text=e.getText();
//				if(text.equals("Electronics")) {
//					e.click();
//					break;
//				}
//			}

			//selectDropDownValueWithoutSelectClass(industry_options, "Electronics");
			selectDropDownValueWithoutSelectClass(country_options, "Australia");
	}
		
		public static void selectDropDownValueWithoutSelectClass(By locator, String value) {
			
		List<WebElement> optionList=driver.findElements(locator);
		System.out.println(optionList.size());
		
		for(WebElement e : optionList) {
			String text=e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
		}

}
