package Pokerbazi;

import org.testng.annotations.Test;
import  GenricUtility.BaseClass;
import PokerBaziPom.DashboardPage;
import PokerBaziPom.LoginPage;
import PokerBaziPom.VerifyAccountPage;
/**
 * Description:This test script contains 
 * @author user
 *
 */

public class VerifyAccountTestScript extends BaseClass{
	@Test
	public void testCase1() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		DashboardPage dp = new DashboardPage(driver);
		VerifyAccountPage acp = new VerifyAccountPage(driver);
		
		/*login to the application*/
		lp.clkOnLogin("username", "password", "user791", " test123", "LOGIN");
		
		/*click verify account from dashboard*/
		dp.clkOnDashboardOptions("Verify Account");
		
		
		acp.getVerifyEmail("Email Address Verification");
		
		acp.getVerifyPhoneNo("Mobile Number Verification");
		
		acp.clkEdit();
		acp.setPhoneNO("8187948235");
		
		acp.clkOnSendOtp("Send OTP");
		
		acp.clkOnVerify("VERIFY");
		
		acp.clkOnContinueWithKyc("CONTINUE WITH KYC");
		
	}	
	
}
