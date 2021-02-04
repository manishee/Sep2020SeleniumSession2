//**** Dec14-P3*****

package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	public By getLocator(String value) {
		return By.id(value);
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	/**
	 * This method returns a list of web elements
	 * @param locator
	 * @return
	 */
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	/**
	 * This function writes in a text box
	 * @param locator
	 * @param value
	 */
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	/**
	 * This function clicks on a web element.
	 * @param locator
	 */
	public void doClick(By locator) {
		getElement(locator).click();
	}
	/**
	 * This function takes a tagName and returns the number of elements on a page based
	 * on the tagName provided
	 * @param tagName
	 * @return
	 */
	public int getElementsCount(String tagName)
	{
		return driver.findElements(By.tagName(tagName)).size();			
	}
	
	public List<String> getAttributesList(String tagName, String attributeName) 
	{
		List<String> attrList=new ArrayList<String>();
		List<WebElement> elementList=driver.findElements(By.tagName(tagName));
		for(WebElement e : elementList) 
		{
			String text=e.getAttribute(attributeName);
			attrList.add(text);
		}
		return attrList;
	}
	/**
	 * This functions uses xpath to click on an element from a list
	 * @param locator
	 * @param linkText
	 */
	public void doClickFromList(By locator, String linkText) {
		List<WebElement> footerList=getElements(locator);
		for(int i=0; i<footerList.size(); i++) {
			String text=footerList.get(i).getText();
			if(text.equals(linkText)) {
			footerList.get(i).click();
			break;
			}
		}
		
	}
	
//****************************** DROP DOWN UTILS*************
	
	public void doSelectDropDownByVisibleText(By locator,String text) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public void doSelectDropDownByIndex(By locator,int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public void doSelectDropDownByValue(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	
}
