//Mar 25-P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_2 {

	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
		
		//span[text()='Manish Chugh']//ancestor::td//preceding-sibling::td//span
		
//		String checkbox_xpath="//a[text()='Manish Chugh']"
//				+ "//parent::td//preceding-sibling::td/div";
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("manishchugh1981@gmail.com");
		driver.findElement(By.name("password")).sendKeys("iloveU@123");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		
		Thread.sleep(2000);
		driver.navigate().to("https://ui.cogmento.com/contacts");
		
		Thread.sleep(2000);
//		driver.findElement(By.xpath(checkbox_xpath)).click();
		selectContact("Manish Chugh");
		selectContact("Angelo Dipaolo");
		selectContact("Tatiana B");
		selectContact("Tenveer Hussain");
		
	}

	public static void selectContact(String name) {
		
		String checkbox_xpath="//a[text()='"+name+"']"
				+ "//parent::td//preceding-sibling::td/div";
		driver.findElement(By.xpath(checkbox_xpath)).click();
	
	
	}
	
}
	
	
	
	
