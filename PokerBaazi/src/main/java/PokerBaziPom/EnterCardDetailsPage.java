package PokerBaziPom;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtility.WebDriverUtility;

public class EnterCardDetailsPage {
	WebDriverUtility wu= new WebDriverUtility();
	WebDriver driver;

	public EnterCardDetailsPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*card details*/   //not working
	private WebElement txtCardDetails(String value) {
		String id= value;
		return driver.findElement(By.id(id));
	}
	
	/*Dynamic xpath Text Filed Options*/
	public WebElement tfOptions(String value) {
		String xpath="//input[@id='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*Dynamic xpath btn option*/
	public WebElement btnOption(String value) {
		String xpath="//span[contains(text(),'"+value+"')]";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* check box */
	@FindBy(xpath= "//img[@src='/assets/unchecked-icon.svg']")
	private WebElement clkCheckBox;
	
	/*enter card no*/
	@FindBy(xpath= "//div[@class='aadhaar_container']")
	private WebElement txtCardNo;
	

	/*enter card no*/
	@FindBy(xpath= "//button[text()='Next']")
	private WebElement clkNxtButton;
	
	/*enter card holder name*/
	@FindBy(xpath= "//input[@placeholder='Card holder name']")
	private WebElement txtCardHolderName;
	
	/*enter card exp month*/
	@FindBy(xpath= "//input[@placeholder='MM']")
	private WebElement txtCardExpMonth;
	
	/*enter card exp year*/
	@FindBy(xpath= "//input[@placeholder='YY']")
	private WebElement txtCardExpYear;
	
	/*enter cvv*/
	@FindBy(xpath= "//input[@placeholder='CVV']")
	private WebElement txtCVV;
	
	/*click on save card*/
	@FindBy(xpath= "//input[@class='input-props juspay_locker_save']")
	private WebElement cbSaveCard;
	
	/*checkbox input*/
	@FindBy(xpath= "//input[@class='input-props ']")
	private WebElement cbInput;
	
	/*button proceed to payment*/
	@FindBy(xpath= "//span[text()='PROCEED TO PAYMENT']")
	private WebElement btnProceedToPayment;
	
	/*close button*/
	@FindBy(xpath = "//button[contains(@class,'close-button')]")
	private WebElement btnClose;
	
	
	public void clkOnReg(String value)
	
	{
		//clkCheckBox.click();
		wu.ClickableElement(driver, btnOption(value));
		clkCheckBox.click();
		
		//.btnOption(value).click();
		
	}
	public void proccedDigilock(String value)
	{
		btnOption(value).click();
		txtCardNo.sendKeys(value);
		
		
	}
	/**
	 * Description: this method is used to enter card details
	 * @author Prashun
	 * @param cardNo
	 * @param nameOnCard
	 * @param expMonth
	 * @param expYear
	 * @param cvv
	 */
	public void setCardDetails(String cardNo, String nameOnCard, String expMonth, String expYear, String cvv) {
		try {
			wu.Thread(3000);
			wu.switchFrames(driver, 0);
			txtCardNo.sendKeys(cardNo);
			wu.switchToPage(driver);
			wu.switchFrames(driver, 1);
			txtCardHolderName.sendKeys(nameOnCard);
			wu.switchToPage(driver);
			wu.switchFrames(driver, 2);
			txtCardExpMonth.sendKeys(expMonth);
			wu.switchToPage(driver);
			wu.switchFrames(driver, 3);
			txtCardExpYear.sendKeys(expYear);
			wu.switchToPage(driver);
			wu.switchFrames(driver, 4);
			txtCVV.sendKeys(cvv);
			wu.switchToPage(driver);
			System.out.println("able to enter card details");
		} catch (Exception e) {
			Assert.fail("unable to enter card details");
		}
	}
	
	/**
	 * Description: this method is used enter  cardnumber in cardnumber  tf
	 * @author Mabasha
	 * @param id 
	 * @param cardnumber
	 * @throws Throwable 
	 */
	public void clkEnterCardNum(String locater,String cardnumber) throws Throwable {
		try {
			wu.Thread(3000);
			driver.switchTo().frame(0);
			tfOptions(locater).sendKeys(cardnumber);
			System.out.println("cardnumber entered sucessfully "+cardnumber);
		}catch (Exception e) {
			Assert.fail("Unable to enter cardnumber ");
		}
	}
	/**
	 * Description: this method is used enter  name in card holder  tf
	 * @author Mabasha
	 * @param id 
	 * @param holdername
	 * @throws Throwable 
	 */
	public void clkEnterCardHolderName(String locater,String holdername) throws Throwable {
		try {
			wu.Thread(3000);
			driver.switchTo().parentFrame();
			driver.switchTo().frame(1);
			tfOptions(locater).sendKeys(holdername);
			System.out.println("holdername entered sucessfully "+holdername);
		}catch (Exception e) {
			Assert.fail("Unable to enter holdername ");
		}
	}
	/**
	 * Description: this method is used enter  card_exp_month in card_exp_month   tf
	 * @author Mabasha
	 * @param id 
	 * @param card_exp_month
	 * @throws Throwable 
	 */
	public void clkEntercard_exp_month(String locater,String date) throws Throwable {
		try {
			wu.Thread(3000);
			driver.switchTo().parentFrame();
			driver.switchTo().frame(2);
			tfOptions(locater).sendKeys(date);
			System.out.println("card_exp_month entered sucessfully "+date);
		}catch (Exception e) {
			Assert.fail("Unable to enter card_exp_month ");
		}
	}
	/**
	 * Description: this method is used enter  card_exp_year in card_exp_year   tf
	 * @author Mabasha
	 * @param id 
	 * @param card_exp_year
	 * @throws Throwable 
	 */
	public void clkEntercard_exp_year(String locater,String date) throws Throwable {
		try {
			wu.Thread(3000);
			driver.switchTo().parentFrame();
			driver.switchTo().frame(3);
			tfOptions(locater).sendKeys(date);
			System.out.println("card_exp_month entered sucessfully "+date);
		}catch (Exception e) {
			Assert.fail("Unable to enter card_exp_month ");
		}
	}
	/**
	 * Description: this method is used enter  security_code in security_code   tf
	 * @author Mabasha
	 * @param id 
	 * @param security_code
	 * @throws Throwable 
	 */
	public void clkEntersecurity_code(String locater,String cvv) throws Throwable {
		try {
			wu.Thread(3000);
			driver.switchTo().parentFrame();
			driver.switchTo().frame(4);
			tfOptions(locater).sendKeys(cvv);
			driver.switchTo().parentFrame();
			System.out.println("card_exp_month entered sucessfully "+cvv);
		}catch (Exception e) {
			Assert.fail("Unable to enter card_exp_month ");
		}
	}
	
	/**
	 * Description: this method is used to click on checkbox
	 * @author Prashun
	 */
	public void clkOnCheckbox() {
		try {
			wu.Thread(5000);
			cbSaveCard.click();
			cbInput.click();
			System.out.println("able to click on checkbox");
		} catch (Exception e) {
			Assert.fail("unable to click on checkbox");
		}
	}
	
	/**
	 * Description: this method is used to click on Proceed To Payment button
	 * @author Prashun
	 */
	public void clkOnProceedToPayment() {
		try {
			wu.Thread(3000);
			btnProceedToPayment.click();
			System.out.println("able to click on Proceed To Payment button");
		} catch (Exception e) {
			Assert.fail("unable to click on Proceed To Payment button");
		}
	}
	
	/**
	 * Description: this method is used to click on proceed to pay
	 * @author Mabasha
	 * @param locater
	 * @throws Throwable 
	 */
	public void clkbtnProceedToPay(String locater) throws Throwable {
		try {
			wu.Thread(3000);
			btnOption(locater).click();
			System.out.println("Able to click on Proceed To Payment");
		}catch (Exception e) {
			Assert.fail("Unable to click on Proceed To Payment");
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
			wu.Thread(5000);
			String title = driver.getTitle();
			wu.switchToWindow(driver, title);
			Thread.sleep(10000);
			btnOption(text).click();
			System.out.println("Able to clic on "+text);
		}catch (Exception e) {
			Assert.fail("Unable to click on "+text);
		}
	}
	/**
	 * Description: this method is used to click on close button
	 * @author Mabasha
	 * @param locater
	 * @throws Throwable 
	 */
	public void clkBtnClose() throws Throwable {
		try {
			wu.Thread(5000);
			btnClose.click();
			System.out.println("Able to clik con close button");
		}catch (Exception e) {
			Assert.fail("Unable to clik con close button");
			
		}
	}
}
