//*************** P1-Feb 11***********
package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownFeatures {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry=By.id("Form_submitForm_Industry");
		By country=By.id("Form_submitForm_Country");
		
		List<String> industryList=doGetDropDownOptions(industry);
		System.out.println("Total values in industry " + industryList.size());
		System.out.println(industryList);
		
		List<String> countryList=doGetDropDownOptions(country);
		System.out.println("Total values in country " + countryList.size());
		System.out.println(countryList);
		
//		Select select_industry=new Select(driver.findElement(industry));
//		
//		List<WebElement> industryOptionsList= select_industry.getOptions();
//		System.out.println(industryOptionsList.size());
//		
//		for(int i=0;i<industryOptionsList.size(); i++) {
//			String text=industryOptionsList.get(i).getText();
//			System.out.println(text);
//			
//		}

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<String> doGetDropDownOptions(By locator) {
		
		List <String> optionValueList=new ArrayList<String>();
		Select select=new Select(getElement(locator));
		List<WebElement> optionList=select.getOptions();
		
		for (WebElement e : optionList) {
			optionValueList.add(e.getText());
		}
		
		return optionValueList;
	}

}
