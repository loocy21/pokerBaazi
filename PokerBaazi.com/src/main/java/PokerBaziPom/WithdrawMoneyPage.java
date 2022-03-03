package  PokerBaziPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Description: Elements of Withdraw Money Page
 * @author Prashun
 */
public class WithdrawMoneyPage {
	WebDriver driver;
	public WithdrawMoneyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/*button withdraw element*/
	private WebElement btnWithdrawElement(String value) {
		String xpath= "//span[contains(text(),'"+value+"')]";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*text amount*/
	@FindBy(id= "id")
	private WebElement txtAmount;
	
	/*text account and balance information*/
	private WebElement txtActAndBalInfo(String value) {
		String xpath= "//span[text()='"+value+"']/ancestor::li[@class='MuiListItem-root pb-list__item MuiListItem-gutters']/descendant::div[@class='MuiListItemSecondaryAction-root pb-list__item__secondary-action']/span";
		return driver.findElement(By.xpath(xpath));
	}

	/*link add kyc details*/
	@FindBy(xpath= "//div[@class='withdraw-add-kyc-details commission-secured-text']")
	private WebElement lnkAddKYCDetails;
	
	
}
