package PokerBaziPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtility.WebDriverUtility;
/**
 * Description:This page add money with promo code
 * @author Shobha
 *
 */

public class KYCPage 
{
	WebDriverUtility web= new WebDriverUtility();
	WebDriver driver;

	public KYCPage(WebDriver driver) {

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
	@FindBy(xpath="//span[text()='KYC-Pending']")
	private WebElement kycPageName;
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
		
		System.out.println("proccedToPayment click succesfully");
	}catch(Exception e){
		Assert.fail("unable to click proccedToPayment");
	}
	}
		
		/**
		 * Description:Method is used for click  apply button
		 * @author Shobha
		 * @param value
		 * @throws Throwable
		 */
		public void btnApply(String value)
		{
			try {
				web.Thread(5000);
				btnPayment(value).click();
				System.out.println("applyButton click succesfully");
			}catch(Exception e){
				Assert.fail("unable to click applyButton");
			}
		
	}
		/**
		 * Description:Method is used for click on kyc details
		 * @author Shobha
		 * @param value
		 */
		
		public void addKycDetails(String value)
		{
			try {
			btnPayment(value).click();
			System.out.println("Able to click on kyc details succesfully ");
			}catch (Exception e) {
				Assert.fail("unable to navigate the kyc page");
			}
			
		}
		/**
		 * Description:Method is used for varify the kyc page
		 * @author Shobha
		 */
		public void varifyTheKycPage()
		{
			try {
				System.out.println(kycPageName.getText());
			String actualPageName = "KYC-Pending";
			Assert.assertEquals(kycPageName.getText(), actualPageName);
			System.out.println("Able to varify the kyc page succesfully ");
		}catch (Exception e) {
			Assert.fail("unable to varify the kyc page");

			
		}
}
}