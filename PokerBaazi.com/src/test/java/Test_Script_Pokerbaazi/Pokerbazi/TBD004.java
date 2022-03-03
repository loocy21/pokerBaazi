package Test_Script_Pokerbaazi.Pokerbazi;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import GenricUtilities.BaseClass;

import PokerBaziPom.AddMoneyPage;
import PokerBaziPom.CashierPage;
import PokerBaziPom.LoginPage;
import PokerBaziPom.PaymentModePage;

/**
 * test case name: TBD004
 * Description:Click on Cashier present on lower side of the application > Click Add cash> Enter amount > Click Add cash> Add cash through netbanking (Have to check all the net banking)
 * @author Mabasha
 */
@Listeners(GenricUtilities.Listeners.class)
public class TBD004 extends BaseClass{
	@Test
	public void tbd004() throws Throwable {

		LoginPage lp = new LoginPage(driver);
		CashierPage cp = new CashierPage(driver);
		AddMoneyPage amp = new AddMoneyPage(driver);
		PaymentModePage pmp = new PaymentModePage(driver);

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

		/*click on Proceed To Payment btn*/
		amp.clkOnProceedToPayment("Proceed To Payment");

		/*select bank*/
		//pmp.clkNetBanking("Select Bank","ICICI Netbanking");
		pmp.clkSelectBank();

		/*click on checkbox*/
		pmp.clkOnCheckbox();

		/*click on Proceed To Payment btn*/
		amp.clkOnProceedToPayment("Proceed To Payment");

		/*click on status*/
		pmp.clkStstusOption("Successful");

		

	}
}
