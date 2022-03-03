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
	 * Description:This page contains cashier page test cases
	 * @author Shobha
	 *
	 */

	public class Dashboard_Page 
	{
		WebDriverUtility web= new WebDriverUtility();
		WebDriver driver;

		public Dashboard_Page(WebDriver driver) {

			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		/* Genric xpath of button cashier and add money */
		private WebElement btnCashier(String value) {
			String xpath = "//span[text()='"+value+"']";
			return driver.findElement(By.xpath(xpath));
		}
		/*get all bonus*/
		@FindBy(xpath = "//div[text()='pb-container    pb-screen__container wallet-transactions__container']")
		private List<WebElement> getAllBonus;
		
		/**
		 * Description:Method is used for click on cashier button 
		 * @author Shobha
		 * @param value
		 */
		public void cashierClk(String value)
		{
			try {
			btnCashier(value).click();
			System.out.println("click on cashier button succesfully");
			}catch(Exception e){
				Assert.fail("unable to click on cashier button ");
			}
		}
		/**
		 * Description:Method is used for click on addMoney button 
		 * @author Shobha
		 * @param value
		 */
		public void addMnyClk(String value)
		{
			try {
			Thread.sleep(5000);
		
			btnCashier(value).click();
			System.out.println("click on addMoney button succesfully");
		}catch(Exception e){
			Assert.fail("unable to click on addMoney button ");
		}
		}
		/**
		 * Description:Method is used for click on logout button
		 * @author Shobha
		 * @param value
		 */
			public void clkLogout(String value)
			{
				try {
				btnCashier(value).click();
				System.out.println("click on logout button succesfully");
			}catch(Exception e){
				Assert.fail("unable to click on logout button ");
			}
				
			}
			public void getAllBonus()
			{
				try {
					web.Thread(10000);
					for (WebElement text : getAllBonus) {
						System.out.println(text.getText());
					}
					System.out.println("Able to print all Bonus Text ");
				}catch (Exception e) {
					Assert.fail("Able to print all Bonus Text ");
					
				}
			
		}
	}
		
	

