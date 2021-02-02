//*********** Feb 1 - P1************
package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {
//mac - cmd+shift+o -> to import the library
//win - control+shift+o	
	static WebDriver driver;
	public static void main(String[] args)
		{

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.ca");
		
		System.out.println("total images are " +getElementsCount("img"));
		System.out.println("total links are " +getElementsCount("a"));
		
		List<String> srcList=getAttributesList("img", "src");
		//System.out.println(srcList);
		//for each loop
		for(String s : srcList) {
			System.out.println(s);
		}
		
		System.out.println("-------------------");
		List<String> hrefList=getAttributesList("a", "href");
		for(String s :hrefList) {
			System.out.println(s);
		}
		
//		List<WebElement> imagesList=driver.findElements(By.tagName("img"));
//		System.out.println("total images are " +imagesList.size());
//		//for each loop
//		for(WebElement e : imagesList)
//		{
//			String src=e.getAttribute("src");
//			System.out.println(src);
//		}
		}
	
		public static int getElementsCount(String tagName)
		{
			return driver.findElements(By.tagName(tagName)).size();			
		}
		public static List<String> getAttributesList(String tagName, String attributeName) 
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
		
	
	}


