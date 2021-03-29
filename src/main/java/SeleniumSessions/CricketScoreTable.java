//Mar 29-P1

package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreTable {
	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/england-tour-of-india-2020-21-1243364/india-vs-england-3rd-odi-1243395/full-scorecard");
		
		////a[text()='Hardik Pandya']//parent::td//following-sibling::td//span
//		String WicketTakerName=driver.findElement(By.xpath("//a[text()='Hardik Pandya']//parent::td//following-sibling::td//span")).getText();
//		System.out.println(WicketTakerName);
		System.out.println(getWicketTakerName("Rohit Sharma"));
		System.out.println(getWicketTakerName("KL Rahul"));
		
		
//		List<WebElement>scoreList=driver.findElements(By.xpath("//a[text()='Rohit Sharma']//parent::td//following-sibling::td"));
//		for(int i=1; i<scoreList.size(); i++) {
//			String scoreText=scoreList.get(i).getText();
//			System.out.println(scoreText);
//		}
		
		
		System.out.println(getScoreCardList("Rohit Sharma"));
		System.out.println(getScoreCardList("Virat Kohli"));
		System.out.println(getScoreCardList("Hardik Pandya"));
		
	}

	public static String getWicketTakerName(String playerName) {
		
		return driver.findElement(By.xpath("//a[text()='"+playerName+"']//parent::td//following-sibling::td//span")).getText();
	}
	
	public static List<String> getScoreCardList(String playerName) {
		
		System.out.println("statistics for player " + playerName );
		
		List<String> scoreCardList=new ArrayList<String>();
		List<WebElement>scoreList=driver.findElements(By.xpath("//a[text()='"+playerName+"']//parent::td//following-sibling::td"));
		for(int i=1; i<scoreList.size(); i++) {
			String scoreText=scoreList.get(i).getText();
			scoreCardList.add(scoreText);
		}
		return scoreCardList;
	}
	
}

