package  PokerBaziPom;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

/**
 * Description: Elements of cashier Page
 * @author prashun
 *
 */
public class CashierPage {
	WebDriver driver;
	WebDriverUtility wu = new WebDriverUtility();
	public CashierPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/* Genric xpath of button add cash and withdraw*/
	private WebElement btnCashier(String value) {
		String xpath = "//span[text()='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/**
	 * Description: this method is used to click on add cash
	 * @author Prashun
	 * @param value
	 */
	public void clkOnAddCash(String value) {
		try {
			wu.Thread(10000);
			btnCashier(value).click();
			System.out.println("able to click on add cash");
		} catch (Exception e) {
			Assert.fail("unable to click on add cash");
		}
	}
	
}
