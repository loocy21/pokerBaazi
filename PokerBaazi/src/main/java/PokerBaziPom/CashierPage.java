package PokerBaziPom;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtility.WebDriverUtility;

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
	/*get all bonus*/
	@FindBy(xpath = "//div[text()='pb-container    pb-screen__container wallet-transactions__container']")
	private List<WebElement> getAllBonus;
	
	
	/**
	 * Description: this method is used to click on add cash
	 * @author Prashun
	 * @param value
	 */
	public void clkOnAddCash(String value) {
		try {
			wu.Thread(7000);
			wu.ClickableElement(driver, btnCashier(value));
			//btnCashier(value).click();
			System.out.println("able to click on add cash");
		} catch (Exception e) {
			Assert.fail("unable to click on add cash");
		}
	}
	public void getAllBonus()
	{
		try {
			wu.Thread(10000);
			for (WebElement text : getAllBonus) {
				System.out.println(text.getText());
			}
			System.out.println("Able to print all Bonus Text ");
		}catch (Exception e) {
			Assert.fail("Able to print all Bonus Text ");
			
		}
}
}