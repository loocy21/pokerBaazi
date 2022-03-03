package Pokerbazi;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import  GenricUtility.BaseClass;

import PokerBaziPom.AddMoneyPage;
import PokerBaziPom.CashierPage;
import PokerBaziPom.LoginPage;
/**
 * test case name: TBD006
 * Description: Click on Cashier present on lower side of the application > Click Add cash> Enter amount> Click Add cash>Add cash using featured code
 * @author shobha
 */
@Listeners( GenricUtility.Listeners.class)
public class TBD006 extends BaseClass{
	@Test
	public void tbd006() throws Throwable  
	{

		LoginPage lp = new LoginPage(driver);
		CashierPage cp = new CashierPage(driver);
		AddMoneyPage amp = new AddMoneyPage(driver);

		/*Enter xpath id and username*/ 
		lp.enterUserName("username", "user791");

		/*Enter xpath id and userpwd*/ 
		lp.enterUserPwd("password", "test123");

		/*click on login button*/ 
		lp.clkbtLogin("LOGIN");

		/*click on addCash button*/
		cp.clkOnAddCash("Add Cash");

		/*enter the amount in deposit text filed */
		amp.setAmount("Amount", "5000");

		/* click on promo */
		amp.tfApplyPromo("PROMO");

		/* apply fratured */
		amp.applyFeatured("FEATURED");

		/* click on apply button */
		amp.btnApply("Apply");

		/* click on proceed to payment */
		amp.clkOnProceedToPayment("Proceed To Payment");
	}
}
