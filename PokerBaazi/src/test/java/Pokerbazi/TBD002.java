package Pokerbazi;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import  GenricUtility.BaseClass;

import PokerBaziPom.AddMoneyPage;
import PokerBaziPom.CashierPage;
import PokerBaziPom.LoginPage;
import PokerBaziPom.PaymentModePage;
/**
 * test case name: TBD002
 * Description: Click on Cashier present on lower side of the application > Click Add cash> Enter amount> Click Add cash> Add cash through wallet 
 * @author Prashun
 */
@Listeners( GenricUtility.Listeners.class)
public class TBD002 extends BaseClass{
	@Test
	public void tbd002() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		CashierPage cp = new CashierPage(driver);
		AddMoneyPage amp = new AddMoneyPage(driver);
		PaymentModePage pmp = new PaymentModePage(driver);
		
		/*login to the application*/
		lp.clkOnLogin("username", "password", "user791", " test123", "LOGIN");
		
		/*click add cash button*/
		cp.clkOnAddCash("Add Cash");
		
		/*enter the amount in text field*/
		amp.setAmount("Amount", "1000");
		
		/*click Proceed To Payment button*/
		amp.clkOnProceedToPayment("Proceed To Payment");
		
		/*click on select wallet*/
		pmp.clkSelectWallet();
		
		/*click on checkbox*/
		pmp.clkOnCheckbox();
		
		/*click Proceed To Payment button*/
		pmp.clkOnProceedToPayment("Proceed To Payment");
		
	}
}
