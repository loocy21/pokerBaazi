package PokerBaziPom;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtility.WebDriverUtility;

/**
 * Description:This page contains AddMoney and varify the kyc details
 * @author Shobha
 *
 */
public class AddMoneyPage {
	WebDriverUtility wu= new WebDriverUtility();
	WebDriver driver;

	public AddMoneyPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/* Genric xpath of button add money */
	private WebElement addMoney(String value) {
		String xpath = "//span[text()='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}

	/* Genric xpath of all auto suggestion */
	private WebElement autoSugg(String deposit) {
		String xpath = "//span[text()='"+deposit+"']/ancestor::div[@class='add-money-card__amount-chips']/descendant::div[@class='pbButton']";
		return driver.findElement(By.xpath(xpath));
	}

	/* Genric xpath of exceeded popup and Promo text field */
	private WebElement tfPromo(String value) {
		String xpath = "//input[@placeholder='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}

	/* Genric xpath of varify address */
	private WebElement tfAddress(String varifyAdd) {
		String xpath = "//span[contains(text(),'"+varifyAdd+"')]/ancestor::div[@class='pb-container background__grey-image   ']/descendant::div[@class='address-field']";
		return driver.findElement(By.xpath(xpath));
	}
	/* Genric xpath of view all deposite code */
	private WebElement viewDepCode(String value) {
		String xpath = "//div[text()='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}
	@FindBy(xpath="//div[text()='The amount must be at least 100']")
	private WebElement varifyPopup;

	/**
	 * Description: this method is used to enter amount
	 * @author Prashun
	 * @param value
	 */
	public void setAmount(String value, String amount) {
		try {
			wu.Thread(3000);
			tfPromo(value).sendKeys(amount);
			System.out.println(tfPromo(value).getText());
			System.out.println("able to enter amount");
		} catch (Exception e) {
			Assert.fail("unable to enter amount");
		}
	}

	/**
	 * Description: this method is used to click on Proceed To Payment button
	 * @author Prashun
	 * @param value
	 */
	public void clkOnProceedToPayment(String value) {
		try {
			wu.Thread(3000);
			addMoney(value).click();
			System.out.println("able to click on Proceed To Payment button");
		} catch (Exception e) {
			Assert.fail("unable to click on Proceed To Payment button");
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
	 * Description:Method is used for mouseOver on featured and click 
	 * @author Shobha
	 * @param value
	 */
	public void tfApplyPromo1(String value,String promo) 
	{
		try {
			Thread.sleep(4000);
			tfPromo(value).sendKeys(promo);
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
			wu.mouseHover(driver, addMoney(value));
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
			wu.Thread(5000);
			addMoney(value).click();
			System.out.println("applyButton click succesfully");
		}catch(Exception e){
			Assert.fail("unable to click applyButton");
		}

	}
	public void varifyTheKycPage()
	{
		try {
			System.out.println(varifyPopup.getText());
		String actualPageName = "The amount must be at least 100";
		Assert.assertEquals(varifyPopup.getText(), actualPageName);
		System.out.println("Able to varify the kyc page succesfully ");
	}catch (Exception e) {
		Assert.fail("unable to varify the kyc page");
	}

		
}
	public void varifyPopup()
	{
		try {
			WebElement ele = varifyPopup;
			if(ele.isDisplayed())
			{
				System.out.println("popup is displayed");
			}
			else
			{
				System.out.println("popup  is not displayed");
			}
		}catch(Exception e){
			{
				
				Assert.fail("popup varification not done");
			}
		}
	}
}

