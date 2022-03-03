package Pokerbazi;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import  GenricUtility.BaseClass;

import PokerBaziPom.AddMoneyPage;
import PokerBaziPom.CashierPage;
import PokerBaziPom.EnterCardDetailsPage;
import PokerBaziPom.LoginPage;
import PokerBaziPom.PaymentModePage;

/**
 * test case name: TBD003
 * Description: open application and login with credentials and Click on Cashier present on lower side of the application > Click Add cash> Enter amount> Click Add cash> Add cash through card.
 * @author Mabasha
 */
@Listeners( GenricUtility.Listeners.class)
public class TBD003 extends BaseClass{
	@Test
	public void tbd003() throws Throwable {

		LoginPage lp = new LoginPage(driver);
		CashierPage cp = new CashierPage(driver);
		AddMoneyPage amp = new AddMoneyPage(driver);
		EnterCardDetailsPage ep = new EnterCardDetailsPage(driver);
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
		amp.setAmount("Amount", "15000");
		
		/*click on Proceed To Payment btn*/
		amp.clkOnProceedToPayment("Proceed To Payment");
		
		/*click add cash through card*/
		//pmp.clkAddCashThroughCard("Add New Card");
		pmp.clkOnAddNewCard();
		
		/*enter card number in tf*/
		ep.clkEnterCardNum("card_number", "4017043173005110");
		
		/*enter card holder name in tf*/
		ep.clkEnterCardHolderName("name_on_card", "mabasha");
		
		/*enter card_exp_month*/
		ep.clkEntercard_exp_month("card_exp_month", "01");
		
		/*enter card_exp_year*/
		ep.clkEntercard_exp_year("card_exp_year", "28");
		
		/*enter security_code*/
		ep.clkEntersecurity_code("security_code", "566");
		
		/*click on check boxes*/
		ep.clkOnCheckbox();
		
		/*click on proceed to pay*/
		ep.clkbtnProceedToPay("PROCEED TO PAYMENT");
		
		/*click on status*/
		ep.clkStstusOption("Successful");

		/*click on close button*/
		ep.clkBtnClose();

	}
}
