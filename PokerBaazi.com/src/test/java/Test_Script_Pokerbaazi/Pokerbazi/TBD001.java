package Test_Script_Pokerbaazi.Pokerbazi;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import GenricUtilities.BaseClass;

import PokerBaziPom.AddMoneyPage;
import PokerBaziPom.CashierPage;
import PokerBaziPom.LoginPage;
import PokerBaziPom.PaymentModePage;
/**
 * test case name: TBD001
 * Description: Click on Cashier present on lower side of the application > Click Add cash> Enter amount> Click Add cash> Add cash through UPI
 * @author Prashun
 */
@Listeners(GenricUtilities.Listeners.class)
public class TBD001 extends BaseClass{
	@Test
	public void tbd001() throws Throwable {
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
		
		/*click on upi*/
		pmp.clkOnUPI();
		
		/*enter your VPA*/
		pmp.setVPA("7777777777@paytm");
		
		/*click on checkbox*/
		pmp.clkOnCheckbox();
		
		/*click Proceed To Payment button*/
		//pmp.clkOnProceedToPayment("PROCEED TO PAYMENT");
	}
}
