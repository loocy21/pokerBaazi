package Pokerbazi;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import  GenricUtility.BaseClass;

import PokerBaziPom.DashboardPage;
import PokerBaziPom.LoginPage;
import PokerBaziPom.WalletTransactions;

/**
 * test case name: TBD007
 * Description: User should be able to see all transactions in my transactions like deposit, withdrawls etc
 *  in history section present in the application
 * @author Mabasha
 */
@Listeners( GenricUtility.Listeners.class)
public class TBD007 extends BaseClass{
	@Test
	public void tbd007() throws Throwable {

		LoginPage lp = new LoginPage(driver);
		DashboardPage dp = new DashboardPage(driver);
		WalletTransactions wt=new WalletTransactions(driver);

		/*Enter xpath id and username*/ 
		lp.enterUserName("username", "user791");

		/*Enter xpath id and userpwd*/ 
		lp.enterUserPwd("password", "test123");

		/*click on login button*/ 
		lp.clkbtLogin("LOGIN");
		
		/*click on wallet transaction*/
		dp.clkOnDashboardOptions("Wallet Transactions");
		
		/*get and print all transaction text*/
		wt.getAllTransactionText();
		
	}
}
