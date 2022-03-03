package Pokerbazi;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import  GenricUtility.BaseClass;

import PokerBaziPom.AddMoneyPage;
import PokerBaziPom.CashierPage;
import PokerBaziPom.LoginPage;
import PokerBaziPom.PaymentModePage;

/**
 * test case name: TBD008
 * Description: Before KYC check the add cash limit should be 75000 for a day - Click on Cashier present on lower side of the application > Click Add cash> Enter amount> Click Add cash> Add cash through netbanking
 * @author Prashun
 */
@Listeners( GenricUtility.Listeners.class)
public class TBD008 extends BaseClass{
	@Test
	public void tbd008() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		CashierPage cp = new CashierPage(driver);
		AddMoneyPage amp = new AddMoneyPage(driver);
		PaymentModePage pmp = new PaymentModePage(driver);
		
		/*login to the application*/
		lp.clkOnLogin("username", "password", "user791", " test123", "LOGIN");
		
		/*click add cash button*/
		cp.clkOnAddCash("Add Cash");
		
		/*enter the amount in text field*/
		amp.setAmount("Amount", "75000");
		
		/*click Proceed To Payment button*/
		amp.clkOnProceedToPayment("Proceed To Payment");
		
		/*click on select bank*/
		pmp.clkSelectBank();
		
		/*click on checkbox*/
		pmp.clkOnCheckbox();
		
		/*click Proceed To Payment button*/
		pmp.clkOnProceedToPayment("Proceed To Payment");
	}
}
