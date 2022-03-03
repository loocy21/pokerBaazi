package Test_Script_Pokerbaazi;

import org.testng.annotations.Test;


import GenricUtilities.BaseClass;
import PokerBaziPom.AddMoney_FeaturedPage;
import PokerBaziPom.AddMoney_Page;
import PokerBaziPom.Dashboard_Page;
import PokerBaziPom.Login_Page;

public class TC_02Pokerbaazi extends BaseClass
{
	@Test
	public void PokerBaazi() throws Throwable  
	{
		
	Login_Page lp = new Login_Page(driver);
	Dashboard_Page dp = new Dashboard_Page(driver);
    AddMoney_FeaturedPage am = new AddMoney_FeaturedPage(driver);
	
	/* text field user name */
	lp.loginCred("username", "user791");
	
	/* text field password */
	lp.password("password", "test123");
	
	/* button Login */
	lp.btnLogin("LOGIN");
	
	/* button casier */
	dp.cashierClk("Cashier");
	
	/*buttom addCash*/
	dp.addMnyClk("Add Cash");
	
	/* text field amount */
	am.amunt("Amount", "5000");
	
	/* click on promo */
	am.tfApplyPromo("PROMO");
	
	/* apply fratured */
	am.applyFeatured("FEATURED");
	
	/* click on apply button */
	am.btnApply("Apply");
	
	
	/* click on proceed to payment */
	am.proccedPayment("Proceed To Payment");
	
	
	
	
	
	
	

}
	

}
