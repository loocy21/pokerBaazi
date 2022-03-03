package  PokerBaziPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Description: Elements of KYC Page
 * @author Prashun
 */
public class KYCPage {
	WebDriver driver;
	public KYCPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/*alert message*/
	@FindBy(xpath= "//div[@class='MuiAlert-message']")
	private WebElement txtAlertMessage;
	
	/*button element*/
	private WebElement btnTabAndVerification(String value) {
		String xpath= "//span[text()='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*text alert Document number already exists message*/
	@FindBy(xpath= "//div[@class='pb-container__body kyc-details__body']/span")
	private WebElement txtMessage;
	
	/*dropdown state*/
	@FindBy(xpath= "//input[@placeholder='Select State']")
	private WebElement ddState;
	
	/*text document, date, pan card number*/
	private WebElement txtEleDocument(String value) {
		String id= value;
		return driver.findElement(By.id(id));
	}
	
	/*btn upload driving license, voter id, pan card*/
	private WebElement btnUploadAadhar(String value) {
		String xpath= "//label[@for='"+value+"']/img";
		return driver.findElement(By.xpath(xpath));
	}
	
	
}
