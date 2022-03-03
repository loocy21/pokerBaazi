package Pokerbazi;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenricUtility.BaseClass;
import PokerBaziPom.CashierPage;
import PokerBaziPom.Dashboard_Page;
import PokerBaziPom.KYCPage;
import PokerBaziPom.LoginPage;
/**
 * Test Case:TBD019
 * Description:this test script contains varify the user is navigate to kyc page
 * @author Shobha
 *
 *
 */
@Listeners(GenricUtility.Listeners.class)


public class TBD019 extends BaseClass
{
	@Test
	public void PokerBaazi () throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		Dashboard_Page dp = new Dashboard_Page(driver);
		CashierPage cp = new CashierPage(driver);

		KYCPage kp = new KYCPage(driver);

		/* Enter xpath id and username */ 
		lp.enterUserName("username", "user791");

		/* Enter xpath id and userpwd */ 
		lp.enterUserPwd("password", "test123");

		/* click on login button */ 
		lp.clkbtLogin("LOGIN");

		/* click on addCash button */
		cp.clkOnAddCash("Add Money");

		/* enter the amount in deposit text filed */
		kp.amunt("Amount", "5000");

		/* click on promo */
		kp.tfPromo("PROMO", "PAY_723097");

		/* click on kyc details */
		kp.addKycDetails("ADD KYC DETAILS");
		

		/* varify the kyc page */
		kp.varifyTheKycPage();
		
		/* click on logout button */
		dp.clkLogout("Logout");








	}



}


