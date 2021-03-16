//P1-Mar11
package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpHandle {
	// cnt+shift+f --> to format the code
	// cnt+shift+o --> to get/organize the necessary packages 
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		Thread.sleep(2000);

		driver.findElement(By.linkText("Click Here")).click();
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();

		String parentWindowid=it.next();
		System.out.println("Parent Window id is:" +parentWindowid);

		String childWindowid=it.next();
		System.out.println("Child Window id is:" +childWindowid);

		//switch to child window
		driver.switchTo().window(childWindowid);
		System.out.println("child window title is " + driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.name("emailid")).sendKeys("abc@def.com");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(3000);
		driver.close();
		//driver.quit();
		driver.switchTo().window(parentWindowid);
		System.out.println("parent window title is " + driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}

}
