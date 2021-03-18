//P1-March 15
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Custom_XPath_1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// Xpath : is not an attribute, its a locator
		// two types:
		// 1. Absolute xpath: html/body/div/div[2]/div[3]/form/div/div[3]/input
		// 2. Relative xpath: Custom Xpath

		// tag[@attr='value'] --> Formula
		// input[@id='username']
		// input[@id='username' and @type='email']

		// button[@id]
		// button[@id='loginBtn']
		// button[@id='loginBtn' and @type]
		// button[@id='loginBtn' and @type='submit']

		// input[@class='form-control private-form__control login-email']
		driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']"));
		// driver.findElement(By.className("form-control private-form__control
		// login-email"));

		// a[@href='https://register.freecrm.com/register/']
		// a[@target='_blank']

		// text() --> to locate headings, labels, links, text
		// tag[text()='textvalue'] --> Formula
		// a[text()='Sign Up']
		// h3[text()='Companies & Contacts']
		// h2[text()='Refreshing business software that your teams will love']

		// contains()-->very important and used a lot
		// tag[contains(@attr, 'value')] -->Formula

		// input[contains(@id, 'username')]
		// input[contains(@id, 'user')]
		// input[contains(@id, 'name')]

		// dynamic ID //input[@id='test_123']
		// <input id=test_123>
		// <input id=test_456>
		// <input id=test_789>
		// input[contains(@id, 'test_')]

		// contains() with text()
		// tag[contains(text(), 'textvalue']--> Formula

		// h3[contains(text(), 'Companies')]
		// a[contains(text(), 'Sign Up')]
		
		//input[contains(@type, 'submit')]
		//input[contains(@type, 'submit') and contains(@value, 'Login')]
		//input[contains(@type, 'submit') and @value='Login']
		
		//a[@href='https://register.freecrm.com/register/' and contains(text(), 'Sign')] 
		//input[starts-with(@id, 'username')]

		//* --> Totak nodes in HTML DOM
		
	}

}
