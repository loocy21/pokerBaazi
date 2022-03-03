package  PokerBaziPom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Description: Elements of Gaming History Page
 * @author Prashun
 */
public class GamingHistoryPage {
	WebDriver driver;
	public GamingHistoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
	
	/*button Game Options*/
	private WebElement btnGameOptions(String value) {
		String xpath= "//span[contains(text(),'"+value+"')]";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*text game type and hands played*/
	private List<WebElement> txtGameAndHandsPlayed(String value) {
		String xpath= "//div[@id='"+value+"']/span";
		return driver.findElements(By.xpath(xpath));
	}
	
	/*text Date and time and profit and loss*/
	private List<WebElement> txtDateTimeAndProfitLoss(String value) {
		String xpath= "//div[@id='"+value+"']/following-sibling::div/span";
		return driver.findElements(By.xpath(xpath));
	}
	
	/*text buy in*/
	@FindBy(xpath= "//div[@id='middle-cell-desktop']/div/following-sibling::div")
	private List<WebElement> txtBuyIn;
	
	/*text blinds(without index it wont be working)*/
	@FindBy(xpath= "//div[@id='middle-cell-desktop']/div[1]/span")
	private List<WebElement> txtBlinds;
}
