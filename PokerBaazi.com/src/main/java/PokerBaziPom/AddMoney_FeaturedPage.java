package PokerBaziPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import GenricUtilities.WebDriverUtility;
/**
 * Description:This page contains addmoney with apply promo with featured 
 * @author Shobha
 *
 */

public class AddMoney_FeaturedPage 
{
	WebDriverUtility web= new WebDriverUtility();
	WebDriver driver;

	public AddMoney_FeaturedPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/* Genric xpath of button add money */
	private WebElement addMoney(String value) {
		String xpath = "//span[text()='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* Genric xpath of amount and Promo text field */
	private WebElement tfPromo(String value1) {
		String xpath = "//input[@placeholder='"+value1+"']";
		return driver.findElement(By.xpath(xpath));
	} 
	
	/* Genric xpath of button proceed to payment  */
	private WebElement btnPayment(String value) {
		String xpath = "//span[text()='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}
	/**
	 * Description:Method is used for click on add money 
	 * @author Shobha
	 * @param value
	 */
	public void addMnyClk(String value)
	{
		try {
			Thread.sleep(5000);
			addMoney(value).click();
			System.out.println("click on addMoney button succesfully");
		}catch(Exception e){
			Assert.fail("unable to click on addMoney button ");
		}
	}
	/**
	 * Desciption:Method is used for apply amount and promo code
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
	 * Description:Method is used for mouseOver on featured and click 
	 * @author Shobha
	 * @param value
	 */
	public void tfApplyPromo(String value) 
	{
		try {
		Thread.sleep(4000);
		tfPromo(value).click();
		System.out.println("PROMO entered succesfully with featured");
	}catch(Exception e){
		Assert.fail(" unable to entered PROMO with featured ");
	}
	}
	/**
	 * Description:Method is used for apply featured
	 * @author Shobha
	 * @param value
	 * @throws Throwable
	 */
	public void applyFeatured(String value) throws Throwable
	{
		try {
		Thread.sleep(5000);
		web.mouseHover(driver, addMoney(value));
		addMoney(value).click();
		System.out.println("applyFeatured click succesfully");
		}catch(Exception e){
			Assert.fail("unable to click applyFeatured");
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
		addMoney(value).click();
		System.out.println("applyButton click succesfully");
	    }catch(Exception e){
		Assert.fail("unable to click applyButton");
	}
		
	}
	/**
	 * Description:Method is used for click on proccedToPayment
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
