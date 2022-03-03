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
 * Description: This class consists of Locaters and generic methods related to wallet Transaction page
 * @author Mabasha
 */
public class WalletTransactions {
	WebDriver driver;
	WebDriverUtility wu=new WebDriverUtility();
	public WalletTransactions(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	/*Dynamic xpath button Options*/
	public WebElement btnOptionsWallet(String value) {
		String xpath="//span[contains(text(),'"+value+"')]";
		return driver.findElement(By.xpath(xpath));
	}

	/*deposit status */
	public WebElement depositStatusOption(String value) {
		String xpath="//span[contains(text(),'"+value+"')]/ancestor::div[@class='pb-container__body wallet-transaction-card__body']/descendant::div[@class='row-direction']/span[contains(@class,'wallet-transaction-card')]";
		return driver.findElement(By.xpath(xpath));
	}

	/*deposit price option*/
	public WebElement depositePrice(String value) {
		String xpath="//span[contains(text(),'"+value+"')]/ancestor::div[@class='pb-container__body wallet-transaction-card__body']/descendant::span[contains(@class,'bold ')]";
		return driver.findElement(By.xpath(xpath));
	}

	/*Closeing Balance*/
	public WebElement closingBalanceText(String value) {
		String xpath="//span[contains(text(),'"+value+"')]/ancestor::div[@class='pb-container__body wallet-transaction-card__body']/descendant::div[@class='wallet-transaction-card__value']/span[contains(@class,'pbText__normal')]";
		return driver.findElement(By.xpath(xpath));
	}
	/*get all btns*/
	@FindBy(xpath = "//span[@class='MuiTab-wrapper']")
	private List<WebElement> getAllTransaction;
	
	
	/*get all bonus*/
	@FindBy(xpath = "//div[text()='pb-container    pb-screen__container wallet-transactions__container']")
	private List<WebElement> getAllBonus;
	
	
	/**
	 * Description: this method is used get all transaction text in wallet transaction page
	 * @author Mabasha
	 * @throws Throwable 
	 */
	public void getAllTransactionText() throws Throwable {
		try {
			wu.Thread(5000);
			for (WebElement text : getAllTransaction) {
				System.out.println(text.getText());
			}
			System.out.println("Able to print all Transaction Text ");
		}catch (Exception e) {
			Assert.fail("Able to print all Transaction Text ");
			
		}
	}
	
	public void clkOnBonus(String value)
	{
		btnOptionsWallet(value).click();
	}
	
	public void btnWallet(String value)
	{
		btnOptionsWallet(value).click();
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
	public void varifyPopup()
	{
		try {
			List<WebElement> ele = getAllBonus;
			if(((WebElement) ele).isDisplayed())
			{
				System.out.println("bonus is displayed");
			}
			else
			{
				System.out.println("bonus is not displayed");
			}
		}catch(Exception e){
			{
				
				Assert.fail("bonus varification not done");
			}
		}
	}
}
