package Pokerbazi;

import org.testng.annotations.Test;

import GenricUtility.BaseClass;
import PokerBaziPom.AddMoneyPage;
import PokerBaziPom.CashierPage;
import PokerBaziPom.Dashboard_Page;
import PokerBaziPom.KYCPage;
import PokerBaziPom.LoginPage;

public class TBD023 extends BaseClass
{
	@Test
	public void TBD023() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		CashierPage cp = new CashierPage(driver);
		Dashboard_Page dp = new Dashboard_Page(driver);
		AddMoneyPage amp = new AddMoneyPage(driver);
		
		/* login to the application */
		lp.clkOnLogin("username", "password", "user791", " test123", "LOGIN");
		
		/* click on cashier button */
		dp.cashierClk("Cashier");
		
		/* click add cash button */
		cp.clkOnAddCash("Add Cash");
		

		/* enter the amount in text field*/
		amp.setAmount("Amount", "1");
		
		/* click on promo */
		amp.tfApplyPromo("PROMO");

		/* apply fratured */
		amp.applyFeatured("APPLY");

	
		/*click Proceed To Payment button*/
		amp.clkOnProceedToPayment("Proceed To Payment");
		
		/* validate the popup */
		amp.varifyTheKycPage();
		
		/*varify the popup*/
		amp.varifyPopup();

	
		
		
		
		
		
	}

}
