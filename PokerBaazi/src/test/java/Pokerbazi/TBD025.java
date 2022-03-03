package Pokerbazi;

import org.testng.annotations.Test;

import GenricUtility.BaseClass;
import PokerBaziPom.AddMoneyPage;
import PokerBaziPom.CashierPage;
import PokerBaziPom.Dashboard_Page;
import PokerBaziPom.LoginPage;
import PokerBaziPom.WalletTransactions;

public class TBD025 extends BaseClass
{
	@Test
	public void TBD025() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		
		Dashboard_Page dp = new Dashboard_Page(driver);
		WalletTransactions wt = new WalletTransactions(driver);
		
		
		/* login to the application */
		lp.clkOnLogin("username", "password", "user791", " test123", "LOGIN");
		
		
	     dp.cashierClk("Cashier");
	     
	     dp.cashierClk("Wallet Transactions");
		
		/* click on cashier button */
		//wt.btnWallet("Wallet Transactions");
		
		/* click add cash button */
		dp.cashierClk("Bonus");
		
		Thread.sleep(7000);
		dp.getAllBonus();
		
		//wt.varifyPopup();
		

	}

}
