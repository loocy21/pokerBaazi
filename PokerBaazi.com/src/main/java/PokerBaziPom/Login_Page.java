package PokerBaziPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;
/**
 * Description:This page contains login page related scenario
 * @author Shobha
 *
 */

public class Login_Page 
{
	WebDriverUtility web = new  WebDriverUtility();
	WebDriver driver;
	
	public Login_Page(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 
	/* Dynamic xpath Text Filed Options*/
	public WebElement tfOptions(String value) {
		String xpath="//input[@id='"+value+"']";
		return driver.findElement(By.xpath(xpath));
		
	}
	
	/* Dynamic xpath login button */
	public WebElement linkOptions(String value) {
		String xpath="//span[contains(text(),'"+value+"')]";
		return driver.findElement(By.xpath(xpath));
	}
	/**
	 * Description:Method is used for enter Username in username TF
	 * @author Shobha
	 * @param id
	 * @param username
	 */
	public void loginCred(String id,String username)
	{
		try {
		tfOptions(id).sendKeys(username);
		System.out.println("Username entered succesfully");
		}catch(Exception e){
			Assert.fail("unable to entered username");
		}
	}
	/**
	 * Description:Method is used for enter password in password TF
	 * @author Shobha
	 * @param id
	 * @param password
	 */
	public void password(String id,String password)
	{
		try {
		tfOptions(id).sendKeys(password);
		System.out.println("password entered succesfully");
		}catch(Exception e){
			Assert.fail("unable to entered password");
		}
	}
	/**
	 * Description:Method is used for click on login button
	 * @author Shobha
	 * @param LOGIN
	 */
	public void btnLogin(String LOGIN)
	{
		try {
		linkOptions(LOGIN).click();
		System.out.println("click on login button succesfully");
		}catch(Exception e){
			Assert.fail("unable to click on login button ");
		}
	}
}



