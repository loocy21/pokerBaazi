package Pokerbazi;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenricUtility.BaseClass;
import PokerBaziPom.Dashboard_Page;
import PokerBaziPom.LoginPage;
import PokerBaziPom.ResponcebleGaming_Page;
/**
 * Test Case:TBD018
 * Description:This test Script contains verify the deposit Limit 
 * @author Shobha
 *
 */
@Listeners(GenricUtility.Listeners.class)


public class TBD018 extends BaseClass
{
	@Test
	public void DepositLimit () throws Throwable 
	{
		
	
	LoginPage lp = new LoginPage(driver);
	Dashboard_Page dp = new Dashboard_Page(driver);
	ResponcebleGaming_Page rg = new ResponcebleGaming_Page(driver);
	
	/*login to the application*/
	lp.clkOnLogin("username", "password", "user791", " test123", "LOGIN");
	
	/*click responsible gaming button*/
	 dp.cashierClk("Responsible Gaming");
	
	 /* get text of all headers */
     rg.getAllText1();
     
     /* get text of all increase Limit */
     rg.getTextIncLimit();
     
     /* Verify the gaming page */
     rg.varifyTheDepositLimitPage();
     
     /* click on logout button */
     dp.clkLogout("Logout");
	

}
}
