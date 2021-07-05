//***Dec 14-P4*****
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMTest {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.init_driver("firefox");
		br.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By FName=By.id("Form_submitForm_FirstName");
		By LName=By.id("Form_submitForm_LastName");
		By Submit_btn=By.id("Form_submitForm_action_request");

		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(FName, "test@gmail.com");
		eleUtil.doSendKeys(LName, "Test@1234");
		//Thread.sleep(6000);
		eleUtil.doClick(Submit_btn);

		br.closeBrowser();
	}

}
