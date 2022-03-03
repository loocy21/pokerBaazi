package Test_Script_Pokerbaazi.Pokerbazi;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import GenricUtilities.BaseClass;

import PokerBaziPom.AddMoneyPage;
import PokerBaziPom.CashierPage;
import PokerBaziPom.LoginPage;
/**
 * test case name: TBD005
 * Description: Click on Cashier present on lower side of the application > Click Add cash> Enter amount> Click Add cash>Add cash using  Promo code
 * @author Mabasha
 */
@Listeners(GenricUtilities.Listeners.class)
public class TBD005 extends BaseClass{
	@Test
	public void tbd005() throws Throwable  
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
		amp.setAmount("Amount", "1000");

		/* text field promo */
		amp.setAmount("PROMO", "PAY_723097");

		/* button procced to payment */
		amp.clkOnProceedToPayment("Proceed To Payment");	


	}

}
