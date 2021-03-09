//P2-Mar8
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(3000);

		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);

//		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//		System.out.println(choiceList.size());
//
//		for (int i = 0; i < choiceList.size(); i++) {
//			String text = choiceList.get(i).getText();
//			System.out.println(text);
//			if (text.equals("choice 7")) {
//				choiceList.get(i).click();
//				break;
//			}
//		}

		By choice_span = By.xpath("//span[@class='comboTreeItemTitle']");
		// Multiple Selection
		// selectChoiceFromDropDown(choice_span, "choice 6", "choice 2", "choice 7");
		// Single Selection
		//selectChoiceFromDropDown(choice_span, "choice 6 2 2");
		

	}

	public static void selectChoiceFromDropDown(By locator, String... value) {
		List<WebElement> choiceList = driver.findElements(locator);
		System.out.println(choiceList.size());

		for (int i = 0; i < choiceList.size(); i++) {
			String text = choiceList.get(i).getText();
			System.out.println(text);

//				if (text.equals(value)) {
//				choiceList.get(i).click();
//				break;
//			}

			for (int j = 0; j < value.length; j++) {
				if (text.equals(value[j])) {
					choiceList.get(i).click();
					break;
				}
			}

		}
	}

}
