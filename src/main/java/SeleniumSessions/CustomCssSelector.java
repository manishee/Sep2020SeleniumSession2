//Apr 8-P1
package SeleniumSessions;

import org.openqa.selenium.By;

public class CustomCssSelector {

	public static void main(String[] args) {

		//https://app.hubspot.com/login
		
		//id --> #{id} - Formula
		//class --> .classname
		
		//#username
		//.form-control.private-form__control.login-email -->.c1.c2.c3
		//.login-email ->unique classname
		//.login-email#username --> .class#id
		//#username.login-email --> #id.class
		//.form-control.private-form__control.login-email#username
		//#username.form-control.private-form__control.login-email
		
		//tag#id - Formula
		//tag.classname
		
		//input#username
		//input.form-control.private-form__control.login-email
		//input.form-control.private-form__control.login-email#username
		
		By.cssSelector(".form-control.private-form__control.login-email");
		By.className("form-control private-form__control login-email");// -->wrong
		By.xpath("//input[@class='form-control private-form__control login-email']]");
		
		//tag[attr='value'] - Formula
		//input[id='username']
		//input[type='email']
		
		//input[type='email'][id='username']-->multiple attributes
		
		
		//parent to child 
		//div.private-form__input-wrapper input[id='username']
		//div.private-form__input-wrapper > input[id='username']
		//.private-form__input-wrapper > input[id='username']
		//.private-form__input-wrapper > input#username
		//.private-form__input-wrapper > #username
		
		//id="test_1234"
		//id="test_2345"
		
		//input[id*='username'] * -->contains
		//input[id*='name']
		
		//input[id^='username'] ^-->starts with
		//input[id^='user']
		
		//input[id$='name'] $-->ends with
		
		//child to parent--> is not possible
		//child to ancestor-> no
		
		//comma in css
		//input#username,  input#password
		//input#username,  input#password, #checkbox-content-4, #loginBtn
		
		//sibling concept
		//preceding sibling --> backward traversing not allowed
		
		//div.private-form__input-wrapper + div
		
		// not operator in css
		
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		
		//input.form-control.private-form__control:not(#password) --> excluded based on id
		//input.form-control.private-form__control:not(.login-email)
		
		//----------------------------------
		
		//https://www.freshworks.com/
		//ul.footer-nav li a
		//ul.footer-nav>li>a
		//nth-of-type --> to go to specific element
		//ul.footer-nav li:nth-of-type(3)--> to get a specific element
		//ul.footer-nav li:nth-of-type(n)-- to get all elements
	}

}
