package PokerBaziPom;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtility.WebDriverUtility;

/**
 * Description: Elements of Payment Mode Page
 * @author Prashun
 */
public class PaymentModePage {
	WebDriver driver;
	WebDriverUtility wu = new WebDriverUtility();
	public PaymentModePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/*dropdown for select bank and select wallet*/   //not working
	private WebElement ddPaymentMode(String value) {
		String xpath= "//input[@placeholder='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* Genric xpath of exceeded popup and Promo text field */
	public WebElement btnPaymentOption(String value) {
		String xpath = "//input[@placeholder='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*dropdown for select wallet*/
	@FindBy(xpath= "//input[@placeholder='Select Wallet']")
	private WebElement ddSelectWallet;
	
	/*dropdown for net banking*/
	@FindBy(xpath= "//input[@placeholder='Select Bank']")
	private WebElement ddSelectBank;
	
	/*select option from dropdown*/    //not working
	private WebElement ddOptions(String value) {
		String xpath= "//li[text()='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*slect bank*/
	public WebElement ddselectBank(String value) {
	String xpath = "//li[text()='"+value+"']";
	return driver.findElement(By.xpath(xpath));
	}
	
	/*select option from select wallet dropdown*/
	@FindBy(xpath= "//li[text()='Paytm Wallet']")
	private WebElement ddWallet;
	
	/*select option from select bank dropdown*/
	@FindBy(xpath= "//li[text()='ICICI Netbanking']")
	private WebElement ddBank;
	
	/*button upi, Add New Card, VPA and card details*/   //not working
	private WebElement btnPaymentMode(String value) {
		String id= value;
		return driver.findElement(By.id(id));
	}
	
	/*Dynamic xpath btn Options*/
	public WebElement btnOptions(String value) {
		String xpath="//input[@id='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*Dynamic xpath btn option*/
	public WebElement btnOption(String value) {
		String xpath="//span[contains(text(),'"+value+"')]";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*button upi*/
	@FindBy(id= "Pay Via UPI")
	private WebElement btnUPI;
	
	/*button add new card*/
	@FindBy(id= "Add New Card")
	private WebElement btnAddNewCard;
	
	/*text vpa*/
	@FindBy(id= "upi_vpa")
	private WebElement txtVPA;
	
	/*checkbox input*/
	@FindBy(xpath= "//input[@class='input-props ']")
	private WebElement cbInput;
	
	/*button proceed to payment*/
	private WebElement btnProceedToPayment(String value) {
		String xpath = "//span[text()='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/**
	 * Description: this method is used to click on upi button
	 * @author Prashun
	 */
	public void clkOnUPI() {
		try {
			wu.Thread(5000);
			btnUPI.click();
			System.out.println("able to click on upi button");
		} catch (Exception e) {
			Assert.fail("unable to click on upi button");
		}
	}
	
	/**
	 * Description: this method is used to enter VPA
	 * @author Prashun
	 */
	public void setVPA( String vpa) {
		try {
			wu.Thread(5000);
			txtVPA.sendKeys(vpa);
			System.out.println("able to enter VPA");
		} catch (Exception e) {
			Assert.fail("unable to enter VPA");
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
			btnProceedToPayment(value).click();
			System.out.println("able to click on Proceed To Payment button");
		} catch (Exception e) {
			Assert.fail("unable to click on Proceed To Payment button");
		}
	}
	
	/**
	 * Description: this method is used to click on select wallet
	 * @author Prashun
	 * @param value
	 * @param paytm
	 */
	public void clkSelectWallet() {
		try {
			wu.Thread(5000);
			ddSelectWallet.click();
			ddWallet.click();
			System.out.println("able to click on select wallet");
		} catch (Exception e) {
			Assert.fail("unable to click on select wallet");
		}
	}
	
	/**
	 * Description: this method is used to click on select bank
	 * @author Prashun
	 * @param value
	 * @param paytm
	 */
	public void clkSelectBank() {
		try {
			wu.Thread(5000);
			ddSelectBank.click();
			ddBank.click();
			System.out.println("able to click on select bank");
		} catch (Exception e) {
			Assert.fail("unable to click on select bank");
		}
	}
	
	/**
	 * Description: this method is used to click on checkbox
	 * @author Prashun
	 */
	public void clkOnCheckbox() {
		try {
			wu.Thread(5000);
			cbInput.click();
			System.out.println("able to click on checkbox");
		} catch (Exception e) {
			Assert.fail("unable to click on checkbox");
		}
	}
	
	/**
	 * Description: this method is used to click on add new card button
	 * @author Prashun
	 */
	public void clkOnAddNewCard() {
		try {
			wu.Thread(5000);
			btnAddNewCard.click();
			System.out.println("able to click on add new card button");
		} catch (Exception e) {
			Assert.fail("unable to click on add new card button");
		}
	}
	
	/**
	 * Description: this method is used to click on add new card
	 * @author Mabasha
	 * @param amount
	 * @throws Throwable 
	 */
	public void clkAddCashThroughCard(String text) throws Throwable {
		try {
			wu.Thread(5000);
			btnOptions(text).click();
			System.out.println("Able to click on Add New Card "+text);
		}catch (Exception e) {
			Assert.fail("Unable to click on Add New Card ");
		}
	}
	
	/**
	 * Description: this method is used to click on net banking
	 * @author Mabasha
	 * @param locater,bankname
	 * @throws Throwable 
	 */
	public void clkNetBanking(String text,String bankname) throws Throwable {
		try {
			wu.Thread(5000);
			
			btnPaymentOption(text).click();
			Thread.sleep(3000);
			ddselectBank(bankname).click();
			System.out.println("Able to click on net banking"+text);
		}catch (Exception e) {
			Assert.fail("Unable to click on net banking ");
		}
	}
	
	/**
	 * Description: this method is used to click on status option
	 * @author Mabasha
	 * @param locater
	 * @throws Throwable 
	 */
	public void clkStstusOption(String text) throws Throwable {
		try {
			Thread.sleep(3000);
			String title = driver.getTitle();
			wu.switchToWindow(driver, title);
			Thread.sleep(10000);
			btnOption(text).click();
			System.out.println("Able to clic on "+text);
		}catch (Exception e) {
			Assert.fail("Unable to click on "+text);
		}
	}
	
}
