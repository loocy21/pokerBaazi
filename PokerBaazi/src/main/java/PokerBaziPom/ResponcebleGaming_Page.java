package PokerBaziPom;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import GenricUtility.WebDriverUtility;
/**
 * Description:Method is used for varify the deposit limit page
 * @author Shobha
 *
 */

public class ResponcebleGaming_Page 
{
	WebDriverUtility web= new WebDriverUtility();
	WebDriver driver;

	public ResponcebleGaming_Page(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}



	/* get text of all headers name */
	@FindBy(xpath="//div[@class='pb-container__body pbHeader__body pb-screen__header']")
	private List<WebElement> getTextAll;


	/* Genric xpath of get text of DepositLimit */
	@FindBy(xpath = "//div[@class='pb-container background__default box-shadow__default border-radius__default ']")
	private List<WebElement> getTextAllLimit;
	/**
	 * Description:Method is used for take get text of all headers
	 * @author Shobha
	 */
	public void getAllText1()
	{
		try {
			web.Thread(5000);
			for (WebElement text : getTextAll) {
				System.out.println(text.getText());
			}
			System.out.println("Able to print all headers ");
		}catch (Exception e) {
			Assert.fail("unable to print all headers ");

		}
	}
	/**
	 * Description:Method is used for get all text of all deposit limit
	 * @author Shobha
	 */
	public void getTextIncLimit()
	{
		try {
			web.Thread(5000);
			for (WebElement text : getTextAllLimit) {
				System.out.println(text.getText());
			}
			System.out.println("Able to print all increase my limit options ");
		}catch (Exception e) {
			Assert.fail("unable to print allincrease my limit options ");

		}
	}
	/**
	 * Description:Method is used for varify the page
	 * @author Shobha
	 */

	public void varifyTheDepositLimitPage()
	{
		try {
		String actual = "PokerBaazi - Dashboard";
		String expected = driver.getTitle();
		Assert.assertEquals(actual, expected);
		System.out.println("actual Title:"+actual);
		
		System.out.println("Able to varify the responcible gaming page ");
	}catch (Exception e) {
		Assert.fail("unable to varify the responcible gaming page ");

		
	}
		
	}
}




	









