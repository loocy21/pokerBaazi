package PokerBaziPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;
/**
 * Description:This page add money with promo code
 * @author Shobha
 *
 */

public class AddMoney_Page 
{
	WebDriverUtility web= new WebDriverUtility();
	WebDriver driver;

	public AddMoney_Page(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/* Genric xpath of amount and Promo text field */
	private WebElement tfPromo(String value) {
		String xpath = "//input[@placeholder='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	} 
	
	/* Genric xpath of button proceed to payment  */
	private WebElement btnPayment(String value) {
		String xpath = "//span[text()='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}
	/**
	 * Description:Method is used for apply amount on text field
	 * @author Shobha
	 * @param value
	 * @param Amount
	 */
	public void amunt(String value,String Amount)
	{
		try {
		tfPromo(value).sendKeys(Amount);
		System.out.println("Amount entered succesfully");
		}catch(Exception e){
			Assert.fail("unable to entered Amount");
		}
		
		
	}
		/**
		 * Description:Method is used for apply promo on text field
	     * @author Shobha
		 * @param value
		 * @param PROMO
		 * @throws Throwable 
		 */
	public void tfPromo(String value,String PROMO) throws Throwable
	{
		try {
		tfPromo(value).sendKeys(PROMO);
	
		
		
		System.out.println("PROMO entered succesfully");
	}catch(Exception e){
		Assert.fail("unable to entered PROMO");
	}
	}
	/**
	 * Description:Method is used for click on proceed to payment
	 * @author Shobha
	 * @param value
	 */
	public void proccedPayment(String value)
	{
		try {
		btnPayment(value).click();
		driver.navigate().back();
		System.out.println("proccedToPayment click succesfully");
	}catch(Exception e){
		Assert.fail("unable to click proccedToPayment");
	}
		
	}
}
